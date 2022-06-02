package com.exemplo.uploadDownload.service;

import java.io.IOException;
import java.net.MalformedURLException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.io.Resource;
import org.springframework.core.io.UrlResource;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;
import org.springframework.web.multipart.MultipartFile;

import com.exemplo.uploadDownload.exception.FileStorageException;
import com.exemplo.uploadDownload.exception.MyFileNotFoundException;
import com.exemplo.uploadDownload.property.FileStorageProperties;

@Service
public class FileStorageService {
	
	private final Path fileStorageLocation;
	
	// Construtor com injeção de dependência
	@Autowired
	public FileStorageService(FileStorageProperties fileStorageProperties) {
		this.fileStorageLocation = Paths.get(fileStorageProperties.getUploadDir()).toAbsolutePath().normalize();
		try {
			Files.createDirectories(this.fileStorageLocation);
		}
		catch(Exception ex) {
			throw new FileStorageException("Não foi possível criar o diretóriono local indicado!", ex);
		}
	}
	
	// Método para acesso ao arquivo
	public String storeFile(MultipartFile file) {
		
		// Tratamento para normalização de path
		String fileName = StringUtils.cleanPath(file.getOriginalFilename());
		
		try {
			if (fileName.contains("..")) {
				throw new FileStorageException("O arquivo contém uma sequência inválida para seu path! " + fileName);
			}
			
			// Copia o arquivo para o local indicado
			Path targetLocation = this.fileStorageLocation.resolve(fileName);
			Files.copy(file.getInputStream(), targetLocation, StandardCopyOption.REPLACE_EXISTING);
			
			return fileName;
		}
		catch(IOException ex) {
			throw new FileStorageException("Não foi possível armazenar o arquivo " + fileName + ". Tente novamente!", ex);
		}
	}
	
	// Recuperar o arquivo que foi upado
	public Resource loadFileAsResource (String fileName) {

		try {
			Path filePath     = this.fileStorageLocation.resolve(fileName).normalize();
			Resource resource = new UrlResource(filePath.toUri()); 
			
			if (resource.exists()) {
				return resource;
			}
			else {
				throw new MyFileNotFoundException("Arquivo não encontrado!" + fileName);
			}
		}
		catch(MalformedURLException ex) {
			throw new MyFileNotFoundException("Arquivo não encontrado!" + fileName, ex);
		}

	}

}
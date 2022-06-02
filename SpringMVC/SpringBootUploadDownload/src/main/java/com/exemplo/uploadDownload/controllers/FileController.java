package com.exemplo.uploadDownload.controllers;

import com.exemplo.uploadDownload.model.UploadFileResponse;
import com.exemplo.uploadDownload.service.FileStorageService;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.io.Resource;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import javax.servlet.http.HttpServletRequest;
import java.io.IOException;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

@RestController
public class FileController {
	
	// Criando uma propriedade para servir de log de manipulação a partir do controller
	private static final Logger logger = LoggerFactory.getLogger(FileController.class);
	
	@Autowired
	private FileStorageService fileStorageService;

	@PostMapping("/uploadFile")
	public UploadFileResponse uploadFile(@RequestParam("file") MultipartFile file) {

		String fileName = fileStorageService.storeFile(file);

		String fileDownloadUri = ServletUriComponentsBuilder.fromCurrentContextPath().path("/downloadFile/").path(fileName).toUriString();

		return new UploadFileResponse(fileName, fileDownloadUri, file.getContentType(), file.getSize());

	}
	
	// Método para upar dois ou mais arquivos
	@PostMapping("/uploadMultipleFiles")
	public List<UploadFileResponse> uploadMultipleFiles(@RequestParam("files")MultipartFile[] files) {

		return Arrays.asList(files)
				.stream()
				.map(file -> uploadFile(file))
				.collect(Collectors.toList());

	}
	
	// Estrutura para download de arquivos
	
	/*
		Simplificando, a anotação @PathVariable pode ser usada para manipular variáveis ​​de modelo
		no mapeamento de URI de solicitação e defini-las como parâmetros de método.
	*/
	@GetMapping("/downloadFile/{fileName:.+}")

	// Método para download de arquivos
	public ResponseEntity<Resource> downloadFile(@PathVariable String fileName, HttpServletRequest request){
		
		//Criando propriedade para acesso ao método que executa os downloads
		Resource resource = fileStorageService.loadFileAsResource(fileName);
		
		// Tentativa de determinar o tipo de conteúdo do arquivo
		String contentType = null;
		
		try {
			contentType = request.getServletContext().getMimeType(resource.getFile().getAbsolutePath());
		}
		catch(IOException ex) {
			logger.info("Não foi possível determinar o conteúdo do arquivo.", ex);
		}
		
		// Verificar se o tipo de contéudo não pode ser verificada porque não pode acessá-lo
		if (contentType == null) {
			
			/*
				MIME Types:
				O MIME type é o mecanismo para dizer ao cliente a variedade de documentos transmitidos:
				a extensão de um nome de arquivo não tem significado na web. Portanto, é importante que o
				servidor esteja configurado corretamente, de modo que o MIME-type correto seja transmitido
				com cada documento. Os navegadores costumam usar o MIME-type para determinar qual ação usar
				como padrão para fazer quando um recurso é obtido.
				
				Fonte -> https://developer.mozilla.org/pt-BR/docs/Web/HTTP/Basics_of_HTTP/MIME_types
				
				Há dois tipo MIME que são importantes para tipos padrões:
					1- text/plain é o tipo padrão para arquivos de texto.
					Um arquivo de texto deve ser legível para um ser humano, e não deve conter dados binários.

					2- application/octet-stream é um tipo padrão para todos outros casos.
					Um tipo de arquivo desconhecido deveria usar este tipo. Navegadores tomarão mais cuidado ao
					manipular esses arquivos, tentando proteger o usuário e prevenir comportamentos perigosos.
				
				Fonte -> https://developer.mozilla.org/pt-BR/docs/Web/HTTP/Basics_of_HTTP/MIME_types/Common_types
			*/
			contentType = "aplicattion/octet-stream";
			
		}

		// Implementação do return
		
		/*
			ResponseEntity representa toda a resposta HTTP:
			código de status, cabeçalhos e corpo . Como resultado, podemos usá-lo para configurar totalmente a resposta HTTP.
			
			Fonte -> https://www.baeldung.com/spring-response-entity
		*/
		return ResponseEntity.ok()
				.contentType(MediaType.parseMediaType(contentType))
				.header(HttpHeaders.CONTENT_DISPOSITION, "attachment; filename=\"" + resource.getFilename() + "\"")
				.body(resource);
		
	}

}
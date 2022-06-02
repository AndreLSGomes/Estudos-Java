package com.exemplo.uploadDownload.property;

import org.springframework.boot.context.properties.ConfigurationProperties;

// Esta anotation exige um parâmetro e este foi setado na application.properties
@ConfigurationProperties(prefix = "file")
public class FileStorageProperties {
	
	private String uploadDir;
	
	//Métodos acessores (POJO)
	public String getUploadDir() {
		return uploadDir;
	}

	public void setUploadDir(String uploadDir) {
		this.uploadDir = uploadDir;
	}
	
}
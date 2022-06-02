package com.exemplo.uploadDownload;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import com.exemplo.uploadDownload.property.FileStorageProperties;

@SpringBootApplication
//Habilitando as propriedades setadas na classe FileStorageProperties
@EnableConfigurationProperties({FileStorageProperties.class})

public class SpringBootUploadDownloadApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootUploadDownloadApplication.class, args);
	}

}
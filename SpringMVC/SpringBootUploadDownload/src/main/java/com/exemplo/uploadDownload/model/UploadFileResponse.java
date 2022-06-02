package com.exemplo.uploadDownload.model;

public class UploadFileResponse {
	
	private String fileType;
	private String fileName;
	private long fileSize;
	private String fileDownloadUri;
	
	// Construtor
	public UploadFileResponse(String fileName, String fileDownloadUri, String fileType, long fileSize) {
		super();
		this.fileType        = fileType;
		this.fileName        = fileName;
		this.fileSize        = fileSize;
		this.fileDownloadUri = fileDownloadUri;
	}

	// Métodos acessores
	public String getFileType() {
		return fileType;
	}
	
	public void setFileType(String fileType) {
		this.fileType = fileType;
	}
	
	public String getFileName() {
		return fileName;
	}
	
	public void setFileName(String fileName) {
		this.fileName = fileName;
	}
	
	public long getFileSize() {
		return fileSize;
	}
	
	public void setFileSize(long fileSize) {
		this.fileSize = fileSize;
	}
	
	public String getFileDownloadUri() {
		return fileDownloadUri;
	}
	
	public void setFileDownloadUri(String fileDownloadUri) {
		this.fileDownloadUri = fileDownloadUri;
	}

}

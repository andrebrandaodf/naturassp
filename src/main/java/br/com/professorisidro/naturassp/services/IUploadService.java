package br.com.professorisidro.naturassp.services;

import org.springframework.web.multipart.MultipartFile;

public interface IUploadService {

	public String uploadFile(MultipartFile arquivo);
}

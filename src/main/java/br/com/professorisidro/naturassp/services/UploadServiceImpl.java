package br.com.professorisidro.naturassp.services;

import org.springframework.stereotype.Component;
import org.springframework.web.multipart.MultipartFile;

@Component
public class UploadServiceImpl implements IUploadService{

	@Override
	public String uploadFile(MultipartFile arquivo) {

		try {
			System.out.println("DEBUG - "+arquivo.getOriginalFilename());
			return arquivo.getOriginalFilename();
		}
		catch(Exception ex) {
			ex.printStackTrace();
		}
		
		return null;
	}


}

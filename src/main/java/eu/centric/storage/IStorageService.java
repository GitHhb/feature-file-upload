package eu.centric.storage;

import java.nio.file.Path;

import org.springframework.web.multipart.MultipartFile;

public interface IStorageService {
	/**
	 * Upload file from web-form
	 * <p>
	 * Upload a multipart file and store it in the given path 
	 * 
	 * @param file				uploaded file
	 * @param uploadLocation	where to store the file
	 */
	public void FileUpload(MultipartFile file, Path uploadPath);
	

}

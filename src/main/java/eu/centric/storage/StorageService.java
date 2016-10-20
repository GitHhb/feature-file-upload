package eu.centric.storage;

import java.nio.file.Path;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

@Service
public class StorageService implements IStorageService {
	
	@Value("${my.storage.uploadpath}")
	private Path uploadPath;

	public StorageService() {
		// TODO Auto-generated constructor stub
		// Check if uploadPath is a valid location
	}
	
	@Override
	public void FileUpload(MultipartFile file, Path uploadPath) {
		// TODO Auto-generated method stub
		
	}

}

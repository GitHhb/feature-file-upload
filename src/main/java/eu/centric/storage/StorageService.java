package eu.centric.storage;

import java.nio.file.Path;

import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

@Service
public class StorageService implements IStorageService {

	public StorageService() {
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public void FileUpload(MultipartFile file, Path uploadPath) {
		// TODO Auto-generated method stub
		
	}

}

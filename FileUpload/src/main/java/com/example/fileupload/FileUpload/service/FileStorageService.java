package com.example.fileupload.FileUpload.service;

import java.io.IOException;
import java.util.stream.Stream;

import org.springframework.web.multipart.MultipartFile;

import com.example.fileupload.FileUpload.entity.FileDB;

public interface FileStorageService {

	FileDB store(MultipartFile file) throws IOException;

	FileDB getFile(String id);

	Stream<FileDB> getAllFiles();

	void deleteById(String id);
}

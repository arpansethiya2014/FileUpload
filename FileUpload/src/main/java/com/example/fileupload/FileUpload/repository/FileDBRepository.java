package com.example.fileupload.FileUpload.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.fileupload.FileUpload.entity.FileDB;

@Repository
public interface FileDBRepository extends JpaRepository<FileDB, String>{

}

package com.example.com;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

public interface FileRepo extends JpaRepository<FileData, Integer> {

	public Optional<FileData> findByName(String filename);
}


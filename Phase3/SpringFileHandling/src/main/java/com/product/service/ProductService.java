package com.product.service;

import java.io.File;
import java.io.IOException;
import java.net.URLConnection;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;
import java.util.Optional;
import java.util.zip.DataFormatException;

import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;
import org.springframework.web.multipart.MultipartFile;


import com.product.pojo.ProductPojo;
import com.product.repo.ProductRepo;

@Service
public class ProductService {

    @Autowired
    private ProductRepo productRepo;

    @Value("${file.upload.path}") // Set the file upload path in application.properties or application.yml
    private String fileUploadPath;

    public void storeFile(MultipartFile file, ProductPojo product) throws IOException {
        String fileName = StringUtils.cleanPath(file.getOriginalFilename());
        String filePath = fileUploadPath + File.separator + fileName;

        // Save the file to the specified path
        Files.copy(file.getInputStream(), Paths.get(filePath), StandardCopyOption.REPLACE_EXISTING);

        // Set the file path in the product entity
        product.setFileUpload(filePath);
        productRepo.save(product);
    }

    public void getImage(String id, HttpServletResponse response) {
        Optional<ProductPojo> productOptional = productRepo.findByPname(id);
        if (productOptional.isPresent()) {
            try {
                String filePath = productOptional.get().getFileUpload();
                File file = new File(filePath);

                // Set the content type based on the file type
                response.setContentType(URLConnection.guessContentTypeFromName(file.getName()));

                // Copy file content to response output stream
                Files.copy(file.toPath(), response.getOutputStream());
            } catch (IOException e) {
                // Handle exception
            }
        }
    }


}

package com.rest.cloudnary.api.service.impl;

import com.cloudinary.Cloudinary;
import com.rest.cloudnary.api.service.CloudinaryImageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.util.Map;

@Service
public class CloudinaryImageServiceImpl implements CloudinaryImageService {

    @Autowired
    private Cloudinary cloudinary;

    @Override
    @SuppressWarnings("unchecked")
    public Map<String, Object> upload(MultipartFile file) {
        try {
            Map<String, Object> data = this.cloudinary.uploader().upload(file.getBytes(), Map.of("resource_type", "auto"));
            return data;
        } catch (IOException ex) {
            throw new RuntimeException("Image Upload Fail !!");
        }
    }
}

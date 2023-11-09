package com.rest.cloudnary.api.service;

import org.springframework.web.multipart.MultipartFile;

import java.util.Map;

public interface CloudinaryImageService {
    public Map<String,Object> upload(MultipartFile file);
}

package com.rest.cloudnary.api.config;

import com.cloudinary.Cloudinary;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.HashMap;
import java.util.Map;

@Configuration
public class AppConfig {

    @Bean
    public Cloudinary getCloudinary() {
        Map<String, Object> config = new HashMap<>();
        config.put("cloud_name", "dfw4bezv4");
        config.put("api_key", "141358986789822");
        config.put("api_secret", "Ms4l5ngIv0zNbyvkKEgleBY6OF4");
        config.put("secure", true);
        return new Cloudinary(config);
    }
}

package com.Logate.SpringBootVjezba.services;

import com.Logate.SpringBootVjezba.DTO.PostDTO;
import com.Logate.SpringBootVjezba.controllers.UserController;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.*;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.List;

@Service

public class ExternalPostService {

    public final static Logger LOGGER = LoggerFactory.getLogger(UserController.class);

    @Value("{external-post-api.url}")
    String url;


    @Autowired
    RestTemplate restTemplate;
    public PostDTO getPostById(Integer id) {
        String moddedUrl = url + "/" + id;
        ResponseEntity<PostDTO> response = restTemplate.exchange(url, HttpMethod.GET, null, PostDTO.class);
        return response.getBody();

    }

    public PostDTO createPost(PostDTO postDTO) {
        HttpHeaders httpHeaders = new HttpHeaders();
        httpHeaders.setContentType(MediaType.APPLICATION_JSON);
        httpHeaders.add("Content-type", "application/json; charset=UTF-8");

        HttpEntity httpEntity = new HttpEntity<>(postDTO, httpHeaders);
        try{
            ResponseEntity<PostDTO> response = restTemplate.exchange(url, HttpMethod.POST, httpEntity, PostDTO.class );
            return response.getBody();
        }
        catch(Exception e){
            LOGGER.info("U pitanju je greska {}", e.getMessage());
        }
        return null;
    }
    
    
    
    /*
    public List<PostDTO> getAllPosts() {
        String url = "https://jsonplaceholder.typicode.com/posts";
        RestTemplate restTemplate = new RestTemplate();
        ParameterizedTypeReference<List<PostDTO>> params = new ParameterizedTypeReference<>(List<PostDTO>) {
        }
        restTemplate.exchange(url, HttpMethod.GET, null,  );
    }
    
     */
    
    
}

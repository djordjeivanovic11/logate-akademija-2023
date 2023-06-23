package com.Logate.SpringBootVjezba.controllers;

import com.Logate.SpringBootVjezba.DTO.PostDTO;
import com.Logate.SpringBootVjezba.services.ExternalPostService;
import org.apache.coyote.Response;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpMethod;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value="api/external")
public class ExternalPostController {

@Autowired
    private ExternalPostService externalPostService;

    @GetMapping(value="{id}")
    public ResponseEntity<PostDTO> getPostById(@PathVariable Integer id){
        PostDTO post = externalPostService.getPostById(id);
        return new ResponseEntity<>(post, HttpStatus.OK);
    }


    @PostMapping
    public ResponseEntity<PostDTO> createPost(@RequestBody PostDTO postDTO ) {
        PostDTO post = externalPostService.createPost(postDTO);
        if (post != null) {
            return new ResponseEntity<>(post, HttpStatus.OK);
        }
        return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }


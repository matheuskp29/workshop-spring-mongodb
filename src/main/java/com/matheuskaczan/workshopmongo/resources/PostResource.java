package com.matheuskaczan.workshopmongo.resources;

import com.matheuskaczan.workshopmongo.entities.Post;
import com.matheuskaczan.workshopmongo.services.PostService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "/Posts")
public class PostResource {
    @Autowired
    private PostService PostService;

    @GetMapping(value = "/{id}")
    public ResponseEntity<Post> findById(@PathVariable String id) {
        Post obj = PostService.findById(id);
        return ResponseEntity.ok().body(obj);
    }

}

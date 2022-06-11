package com.matheuskaczan.workshopmongo.services;

import com.matheuskaczan.workshopmongo.entities.Post;
import com.matheuskaczan.workshopmongo.repository.PostRepository;
import com.matheuskaczan.workshopmongo.services.exception.ObjectNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PostService {

    @Autowired
    private PostRepository postRepository;

    public Post findById(String id) {
        Optional<Post> obj = postRepository.findById(id);
        return obj.orElseThrow(() -> new ObjectNotFoundException("Objeto não encontrado"));
    }


}

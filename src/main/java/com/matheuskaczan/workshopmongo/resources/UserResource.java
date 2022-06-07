package com.matheuskaczan.workshopmongo.resources;

import com.matheuskaczan.workshopmongo.dto.UserDTO;
import com.matheuskaczan.workshopmongo.entities.User;
import com.matheuskaczan.workshopmongo.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping(value = "/users")
public class UserResource {
    @Autowired
    private UserService userService;

    @GetMapping
    public ResponseEntity<List<UserDTO>> findAll() {

        List<User> list = userService.findAll();
        List<UserDTO> listDto = list.stream().map(UserDTO::new).collect(Collectors.toList());

        return ResponseEntity.ok().body(listDto);
    }
}

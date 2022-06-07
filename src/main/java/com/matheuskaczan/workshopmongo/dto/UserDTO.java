package com.matheuskaczan.workshopmongo.dto;

import com.matheuskaczan.workshopmongo.entities.User;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.io.Serializable;

@NoArgsConstructor
@Getter
@Setter
public class UserDTO implements Serializable {

    private static final long serialVersionUID = 1L;

    private String id;
    private String nome;
    private String email;

    public UserDTO(User obj) {
        id = obj.getId();
        nome = obj.getNome();
        email = obj.getEmail();
    }
}

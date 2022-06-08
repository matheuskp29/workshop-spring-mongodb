package com.matheuskaczan.workshopmongo.dto;

import com.matheuskaczan.workshopmongo.entities.User;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.io.Serializable;

@NoArgsConstructor
@Getter
@Setter
public class AuthorDTO implements Serializable {

    private static final long serialVersionUID = 1L;

    private String id;
    private String nome;

    public AuthorDTO(User obj) {
        id = obj.getId();
        nome = obj.getNome();
    }
}

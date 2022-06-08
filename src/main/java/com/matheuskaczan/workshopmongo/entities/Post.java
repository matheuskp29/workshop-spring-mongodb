package com.matheuskaczan.workshopmongo.entities;

import com.matheuskaczan.workshopmongo.dto.AuthorDTO;
import lombok.*;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.io.Serializable;
import java.util.Date;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@EqualsAndHashCode(exclude = {"data", "titulo", "corpo"})
@Document
public class Post implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    private String id;
    private Date data;
    private String titulo;
    private String corpo;
    private AuthorDTO autor;
}

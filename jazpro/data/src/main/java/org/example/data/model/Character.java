package org.example.data.model;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
public class Character {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String name;
    @ManyToOne
    private Actor actor;
    @ManyToOne
    private Anime anime;

}

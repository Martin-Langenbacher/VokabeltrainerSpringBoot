package de.telespring.vokabeltrainer.model;

import lombok.Data;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

@Data
@Entity
public class Vokabel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String word;
    private String translation;
    private String bemerkung;

    /*
    @ManyToOne
    @JoinColumn(name = "user_id")
    @NotNull(message = "Es muss ein User ausgewählt werden.")
    private User user;

     */


}

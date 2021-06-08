package de.telespring.vokabeltrainer.model;

import lombok.Data;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.util.ArrayList;
import java.util.List;

@Data
@Entity
public class Vokabel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String word;
    private String translation;
    private String bemerkung;


    @ManyToMany
    @JoinTable(name = "vokabel_training", joinColumns = @JoinColumn(name = "vokabel_id"), inverseJoinColumns = @JoinColumn(name = "training_id"))
    //@JoinTable(name = "book_author", joinColumns = @JoinColumn(name = "book_id"), inverseJoinColumns = @JoinColumn(name = "author_id"))
    private List<Training> trainingList = new ArrayList<Training>();

    /*






    @ManyToMany(cascade = { CascadeType.ALL })
    @JoinTable(
        name = “Employee_Project”,
        joinColumns = { @JoinColumn(name = “employee_id”) }, inverseJoinColumns = { @JoinColumn(name = “project_id”) }
    )

    @ManyToOne
    @JoinColumn(name = "user_id")
    @NotNull(message = "Es muss ein User ausgewählt werden.")
    private User user;

     */


}

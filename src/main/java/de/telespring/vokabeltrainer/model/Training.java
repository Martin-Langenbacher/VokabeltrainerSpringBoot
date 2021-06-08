package de.telespring.vokabeltrainer.model;

import lombok.Data;
import org.springframework.format.annotation.DateTimeFormat;


import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@Data
@Entity
public class Training {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @DateTimeFormat(pattern = "yyyy-MM-dd")
    @NotNull
    private LocalDate date;
    private boolean doneToday;       // you can do two or more training sessions a day - but you should do at least one. All other vocabluary will add on the first training
    private int amountOfVocabluary;    // goal of the user per day: E.g. for example 20 a day
    private int vocabluaryCorrectlyAnswered;


    @ManyToMany
    @JoinTable(name = "vokabel_training", joinColumns = @JoinColumn(name = "training_id"), inverseJoinColumns = @JoinColumn(name = "vokabel_id"))
    private List<Vokabel> vokabelList = new ArrayList<Vokabel>();


    public Training() {
        this.date = LocalDate.now();
        this.doneToday = false;
        this.amountOfVocabluary = 0;
        this.vocabluaryCorrectlyAnswered = 0;
    }




    /*
    @OneToMany(mappedBy = "training")
    private List<Vokabel> vokabelList;

     */



    // ArrayList<Vokabel> vokabelListeTraining = new ArrayList<Vokabel>(); // amount from int above...


    /*
    Buch:
	@ManyToMany
	@JoinTable(name = "book_author", joinColumns = @JoinColumn(name = "book_id"), inverseJoinColumns = @JoinColumn(name = "author_id"))
	@NotEmpty(message = "Es muss mindestens ein Autor ausgewählt werden.")
	private List<Author> authors = new ArrayList<>();
    =======================
    Author:
    @ManyToMany(mappedBy = "authors", cascade = {CascadeType.PERSIST, CascadeType.MERGE})
	private List<Book> books = new ArrayList<>();


    @OneToMany(mappedBy = "publisher", cascade = {CascadeType.PERSIST, CascadeType.MERGE})
	private List<Book> books = new ArrayList<>();
     */



    /*
    @ManyToOne
    @JoinColumn(name = "user_id")
    @NotNull(message = "Es muss ein User ausgewählt werden.")
    private User user;

     */

}





/*

    //TODO: The List of vocabluary which we want to test...
    /*
    @OneToMany(mappedBy = "user", cascade = { CascadeType.ALL })
	@Builder.Default
	@Setter(value = AccessLevel.NONE)
	private Set<UserSkill> userSkills = new HashSet<>();

}

        */
package de.telespring.vokabeltrainer.model;

import lombok.Data;
import org.springframework.format.annotation.DateTimeFormat;


import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.time.LocalDate;
import java.util.ArrayList;

@Data
@Entity
public class Training {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long trainingId;

    @DateTimeFormat(pattern = "yyyy-MM-dd")
    @NotNull
    private LocalDate dateOfTraining;
    private boolean trainingAlreadyDoneToday;       // you can do two or more training sessions a day - but you should do at least one. All other vocabluary will add on the first training
    private int amountOfVocabluaryInTheTraining;    // goal of the user per day: E.g. for example 20 a day
    private int amountOfVocabluaryCorrectlyAnsweredInTraining;

    // ArrayList<Vokabel> vokabelListeTraining = new ArrayList<Vokabel>(); // amount from int above...

    @ManyToOne
    @JoinColumn(name = "user_id")
    @NotNull(message = "Es muss ein User ausgewählt werden.")
    private User user;

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
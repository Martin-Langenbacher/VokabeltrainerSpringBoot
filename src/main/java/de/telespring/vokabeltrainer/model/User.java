package de.telespring.vokabeltrainer.model;

import lombok.Data;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

//import org.jetbrains.annotations.NotNull;
import lombok.Getter;
import lombok.Setter;
import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.*;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

@Data
@Entity
//@Getter
//@Setter
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String userName;
    private String email;

    @DateTimeFormat(pattern = "yyyy-MM-dd")
    @NotNull
    private LocalDate dateOfRegistration;

    private int level; // Level wird durch viel Übung erhöht!




    /*
    // Auszeichnungen
    @ManyToMany
    @JoinTable(name = "user_auszeichnung", joinColumns = @JoinColumn(name = "user_id"), inverseJoinColumns = @JoinColumn(name = "auszeichnung_id"))
    //@NotEmpty(message = "Es muss mindestens eine Auszeichung ausgewählt werden.")
    private List<Auszeichnung> auszeichnungs = new ArrayList<>();

    // User --> Trainings
    @OneToMany(mappedBy = "user", cascade = {CascadeType.PERSIST, CascadeType.MERGE})
    private List<Training> trainings = new ArrayList<>();


    // User --> Vokabeln
    @OneToMany(mappedBy = "user", cascade = {CascadeType.PERSIST, CascadeType.MERGE})
    private List<Vokabel> vokabels = new ArrayList<>();

    */








    //TODO: Achievments: Z.B. wenn man jeden Tag in der Woche übt, wenn wann 10 Vokabeln pro Woche einträgt, ...
    /*
    @OneToMany(mappedBy = "user", cascade = { CascadeType.ALL })
	@Builder.Default
	@Setter(value = AccessLevel.NONE)
	private Set<UserSkill> userSkills = new HashSet<>();
    */


}





/*
Out of Skill-Hub:
//IMPORTANT: Do NOT use lombok @Data, @EqualsAndHashCode or @ToString
@Entity
@Builder
@AllArgsConstructor(access = AccessLevel.PACKAGE)
@NoArgsConstructor
@Setter
@Getter
public class User implements UserDetails {

	========================================================================= Trennlinie ===============


private static final long serialVersionUID = -5641612720821997134L;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @NaturalId
    @Column(unique = true)
    @NotNull
    private String email;

    @NotNull
    private String password;

    @NotNull
    private String firstName;


 */
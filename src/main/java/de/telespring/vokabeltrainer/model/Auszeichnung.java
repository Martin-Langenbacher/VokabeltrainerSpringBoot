package de.telespring.vokabeltrainer.model;

import lombok.Data;
import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.time.LocalDate;

@Data
@Entity
public class Auszeichnung {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long auszeichnungId;

    private String nameDerAuszeichnung;

    private boolean auszeichnungAchieved;         // at the beginning it is false, until it is DONE=true.

    private int amountOfThisAuszeichnungAchieved; // Wöchentliche Auszeichnungen können öfter erreicht werden !!!

    private boolean specialSingleAuszeichung;     // Wöchentliche Auszeichnungen: ==> false !

    @DateTimeFormat(pattern = "yyyy-MM-dd")
    @NotNull
    private LocalDate startDateOfAuszeichnung;

    @DateTimeFormat(pattern = "yyyy-MM-dd")
    @NotNull
    private LocalDate endDateOfAuszeichnung;

    @DateTimeFormat(pattern = "yyyy-MM-dd")
    @NotNull
    private LocalDate achievementDateOfAuszeichnung;

    // Bild zur Auszeichnung: Achtung, eine z.B. Wöchentliche Auszeichnung gibt kein zusätzliches Bild sondern beim Bild gibt es eine Zahl, die größer wird.
    @Lob
    private byte[] image;







    // Auszeichung sollte in eine Liste des Users eingetragen werden - sobald er eine Auszeichnung geschafft hat...

}


/*

Welche Auszeichnungen gibt es?
======================================================================

1) Monatliche Herausforderung (Jan., ... Dec.)
2) "Ringe schließen": VokabelRekord, NeuerTagesrekord, 200%, 300%, 400%,  und wie oft getan...
3) Perfekte Woche (jeden Tag)
4) Perfekter Monat (jeden Tag im Monat - oder 28x pro Monat)...
5) Längste Trainingssession (ohne Unterbrechung)
6) 100 Tage gelernt, 365, 500, 1000, 1250, 1500 .... 2000

*) Special: Wettbewerbe
*) Special: Limitierte Herausforderungen: "Neujahrs-Herausforderung, ..."

*/






/*

@Entity
@Setter
@Getter
public class Book {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@Column(nullable = false, name = "isbn13", insertable = true, updatable = true, unique = false)
	@ISBN(type = Type.ISBN_13, message = "Ungültige ISBN, Beispiel: 978-0132350884")
	private String isbn13;

	@NotNull
	@Size(min = 2, max = 255, message = "Die Länge des Titels muss zwischen 2 und 255 Zeichen liegen.")
	private String title;

	private int availableStock;

	@ManyToOne
	@JoinColumn(name = "publisher_id")
	@NotNull(message = "Es muss ein Publisher ausgewählt werden.")
	private Publisher publisher;

	@ManyToMany
	@JoinTable(name = "book_author", joinColumns = @JoinColumn(name = "book_id"), inverseJoinColumns = @JoinColumn(name = "author_id"))
	@NotEmpty(message = "Es muss mindestens ein Autor ausgewählt werden.")
	private List<Author> authors = new ArrayList<>();

	@Lob
	private byte[] image;



===================================================================================================================>>>>>>





	// IMPORTANT: Do NOT use lombok @Data, @EqualsAndHashCode or @ToString
@Entity
@Builder
@AllArgsConstructor(access = AccessLevel.PACKAGE)
@NoArgsConstructor
@Setter
@Getter
public class Skill implements Comparable<Skill> {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;

	@NaturalId
	@Column(unique = true)
	@NotNull
	private String name;

	private String imageURL;

	@OneToMany(mappedBy = "skill")
	@Builder.Default
	@Setter(value = AccessLevel.NONE)
	private Set<UserSkill> userSkills = new HashSet<>();

	// Override lombok generated setter to make the collection read-only
	public Set<UserSkill> getUserSkills() {
		return Collections.unmodifiableSet(this.userSkills);
	}

	@Override
	public int hashCode() {
		return Objects.hash(id);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!(obj instanceof Skill))
			return false;
		Skill other = (Skill) obj;
		return Objects.equals(id, other.id);
	}

	@Override
	public String toString() {
		return "Skill [id=" + id + ", name=" + name + ", imageURL=" + imageURL + "]";
	}

	@Override
	public int compareTo(Skill other) {

		// Use null-safe compare method from Apache StringUtils
		return StringUtils.compare(this.getName(), other.getName());
	}

}

*/
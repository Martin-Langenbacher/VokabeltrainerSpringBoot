package de.telespring.vokabeltrainer.repository;

import de.telespring.vokabeltrainer.model.Auszeichnung;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AuszeichnungRepository extends JpaRepository<Auszeichnung, Long> {
}


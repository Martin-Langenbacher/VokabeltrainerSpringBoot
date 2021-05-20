package de.telespring.vokabeltrainer.repository;

import de.telespring.vokabeltrainer.model.Vokabel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface VokabelRepository extends JpaRepository<Vokabel, Long> {

}

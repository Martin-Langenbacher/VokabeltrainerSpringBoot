package de.telespring.vokabeltrainer.controller;

import de.telespring.vokabeltrainer.model.Vokabel;
import de.telespring.vokabeltrainer.repository.VokabelRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/vokabel")
public class VokabelController {


    private final VokabelRepository vokabelRepository;

    @Autowired
    public VokabelController(VokabelRepository vokabelRepository) {
        this.vokabelRepository = vokabelRepository;
    }


    @GetMapping
    public List<Vokabel> getAllVokabel() {
        return this.vokabelRepository.findAll();
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public Vokabel addVokabel (@RequestBody Vokabel vokabel) {
        return this.vokabelRepository.save(vokabel);
    }


}

package de.telespring.vokabeltrainer.controller;

import de.telespring.vokabeltrainer.model.Vokabel;
import de.telespring.vokabeltrainer.repository.VokabelRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@Controller
@RequestMapping("/vokabel")
@Slf4j
public class VokabelController {


    private final VokabelRepository vokabelRepository;

    @Autowired
    public VokabelController(VokabelRepository vokabelRepository) {
        this.vokabelRepository = vokabelRepository;
    }


    @GetMapping
    public ResponseEntity<List<Vokabel>> getAllVokabel() {
        return new ResponseEntity<>(this.vokabelRepository.findAll(), HttpStatus.OK);
    }


    @PostMapping(consumes = MediaType.APPLICATION_FORM_URLENCODED_VALUE)
    //@ResponseStatus(HttpStatus.CREATED) --> Wenn dies drin ist, dann wird die Seite nicht richtig angezeigt, da 'redirect' überschrieben wird!
    public String addVokabel( Vokabel vokabel ){
        this.vokabelRepository.save(vokabel);
        log.info("Wir haben gerade eine Vokabel gespeichert: @Slf4j wird benötigt!");
        System.out.println("=============> System.out.println-Test. <xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx");
        return "redirect:/getAll";
    }


    // Neues Wort anlegen
    @GetMapping("/new")
    public String neueVokabelAnlagen() {
        return "vokabel/new_vokabel";
    }



    // Delete vocabulary
    @GetMapping("/delete/{id}")
    public String deleteVokabel(@PathVariable("id") Long id) {
        vokabelRepository.deleteById(id);
        return "redirect:/getAll";
        //return "redirect:/vokabel/get_all";
    }


}

package de.telespring.vokabeltrainer.controller;

import de.telespring.vokabeltrainer.model.Vokabel;
import de.telespring.vokabeltrainer.repository.VokabelRepository;
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
    @ResponseStatus(HttpStatus.CREATED)
    public ResponseEntity<Vokabel> addVokabel (@RequestBody Vokabel vokabel) {
        return new ResponseEntity<>(this.vokabelRepository.save(vokabel), HttpStatus.CREATED);
    }


    /*
        @PostMapping("vokabel/upsert")
    public String insert(@Valid Vokabel vokabel, BindingResult bindingResult, Model model) {
        vokabel = vokabelRepository.save(vokabel);
        return "vokabel/get_all";
    }

     */


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

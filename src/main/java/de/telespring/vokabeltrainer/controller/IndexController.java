package de.telespring.vokabeltrainer.controller;

import de.telespring.vokabeltrainer.model.Vokabel;
import de.telespring.vokabeltrainer.repository.VokabelRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
//@RequestMapping("/")
public class IndexController {

    private final VokabelRepository vokabelRepository;

    @Autowired
    public IndexController(VokabelRepository vokabelRepository) {
        this.vokabelRepository = vokabelRepository;
    }

    @GetMapping("/getAll")                 // Pfad im Browser
    public String getAll(Model model) {
        List<Vokabel> alleVokabeln = vokabelRepository.findAll();
        // setzt Attribute Vokabel um es im html einbinden kann
        model.addAttribute("vokabeln", alleVokabeln);
        return "vokabel/get_all";          // Ordner-Struktur in Templates
    }

}



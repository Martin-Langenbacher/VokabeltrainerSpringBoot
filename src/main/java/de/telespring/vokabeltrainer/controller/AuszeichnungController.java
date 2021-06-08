package de.telespring.vokabeltrainer.controller;

/*
import de.telespring.vokabeltrainer.model.Auszeichnung;
import de.telespring.vokabeltrainer.repository.AuszeichnungRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/auszeichnung")
@Slf4j                                     // Für Logger.
public class AuszeichnungController {

    private final AuszeichnungRepository auszeichnungRepository;

    @Autowired
    public AuszeichnungController(AuszeichnungRepository auszeichnungRepository) {
        this.auszeichnungRepository = auszeichnungRepository;
    }


    @GetMapping
    public ResponseEntity<List<Auszeichnung>> getAllAuszeichung() {
        return new ResponseEntity<>(this.auszeichnungRepository.findAll(), HttpStatus.OK);
    }


    // TODO: GetAllMYOWN_Auszeichnungen (USER) !!!!


}


/*

@Controller
@RequestMapping("/training")
@Slf4j                                     // Für Logger.
public class TrainingController {

    // TODO: Change it to a variable, the user can change (e.g. 10, 15, ... - 50)
    private static final int AMOUNT_OF_VOCABLUARYS_IN_TRAINING = 5;
    private final VokabelRepository vokabelRepository;

    @Autowired
    public TrainingController(VokabelRepository vokabelRepository) {
        this.vokabelRepository = vokabelRepository;
    }


    @GetMapping("/{counter}")
    public String training (Model model, @PathVariable(value = "counter", required = false) String counter) {
        List<Vokabel> vokabelList = vokabelRepository.findAll();
        if (vokabelList.isEmpty()) {
            return "redirect:/vokabel/new";
        }
        // Loop only if either the amount of vocabluaries are not matched or the lenth of the vocabluary-list is not exceeded !
        if (Integer.valueOf(counter) < AMOUNT_OF_VOCABLUARYS_IN_TRAINING && vokabelList.size() - Integer.valueOf(counter) > 0) {

            System.out.println("+++++++++++++++++++++" + counter + " Size: " +vokabelList.size());
            model.addAttribute("vokabel", vokabelList.get(Integer.valueOf(counter)));
            model.addAttribute("counter", Integer.valueOf(counter) + 1);
        } else {
            return "redirect:/training/ergebnis";
        }
        return "training/training";
    }


    @GetMapping("/ergebnis")
    public String ergebnis () {
        return "training/ergebnis";
    }


}


*/
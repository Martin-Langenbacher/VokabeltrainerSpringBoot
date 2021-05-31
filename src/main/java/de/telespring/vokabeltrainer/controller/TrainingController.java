package de.telespring.vokabeltrainer.controller;

import de.telespring.vokabeltrainer.model.Vokabel;
import de.telespring.vokabeltrainer.repository.VokabelRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

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


// Wähl-Schalter für Anzahl an Vokabeln: AMOUNT_OF_VOCABLUARYS_IN_TRAINING

   /*
<form>
  <div class="form-row align-items-center">
    <div class="col-auto my-1">
      <label class="mr-sm-2" for="inlineFormCustomSelect">Preference</label>
      <select class="custom-select mr-sm-2" id="inlineFormCustomSelect">
        <option selected>Choose...</option>
        <option value="1">One</option>
        <option value="2">Two</option>
        <option value="3">Three</option>
      </select>
    </div>
    <div class="col-auto my-1">
      <div class="custom-control custom-checkbox mr-sm-2">
        <input type="checkbox" class="custom-control-input" id="customControlAutosizing">
        <label class="custom-control-label" for="customControlAutosizing">Remember my preference</label>
      </div>
    </div>
    <div class="col-auto my-1">
      <button type="submit" class="btn btn-primary">Submit</button>
    </div>
  </div>
</form>

    */






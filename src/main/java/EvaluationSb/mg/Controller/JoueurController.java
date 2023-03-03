package EvaluationSb.mg.Controller;

import EvaluationSb.mg.Entity.Joueur;
import EvaluationSb.mg.Service.JoueurService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller
@RequestMapping("/")
public class JoueurController {
    @Autowired
    JoueurService joueurService;
    @GetMapping("/list")
    public String viewHomePage(Model model) {
        List<Joueur> listJoueur = joueurService.joueurList();
        model.addAttribute("listJoueur", listJoueur);
        return "index";
    }
    @RequestMapping("/nouveau")
    public String nouveauJoueur(Model model){
        Joueur joueur=new Joueur();
        model.addAttribute("joueur",joueur);
        return "newJoueur";
    }
    @RequestMapping("/save")
    public String saveJoueur (@ModelAttribute("joueur")Joueur joueur, BindingResult bindingResult, Model model){
        if(bindingResult.hasErrors()){
            return "newJoueur";
        }
        else {
            joueurService.save(joueur);
            return "redirect:/list";
        }

    }

    @RequestMapping("/delete/{idJoueur}")
    public String supprimerJoueur (@PathVariable(name="idJoueur")int idJoueur){
        joueurService.delete(idJoueur);;
        return "redirect:/list";
    }
    @RequestMapping("/edit/{idJoueur}")
    public ModelAndView afficheJoueurEdit (@PathVariable(name="idJoueur")int idJoueur){
        ModelAndView mav=new ModelAndView("editJoueur");
        Joueur joueur=joueurService.getId(idJoueur);
        mav.addObject("joueur",joueur) ;
        return mav;
    }
}

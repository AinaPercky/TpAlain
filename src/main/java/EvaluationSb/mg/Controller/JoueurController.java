package EvaluationSb.mg.Controller;

import EvaluationSb.mg.Entity.Joueur;
import EvaluationSb.mg.Service.JoueurService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/Joueur")
public class JoueurController {
    @Autowired
    JoueurService joueurService;
    @GetMapping("/list")
    public List<Joueur> joueurList(){
        return joueurService.joueurList();
    }
    @PostMapping("/addJoueur")
    public void ajouterJoueur(@RequestBody Joueur joueur){
        joueurService.save(joueur);
    }
    @DeleteMapping ("/deleteJoueur/{id}")
    public void supprimerJoueur(@PathVariable ("id")Integer id){joueurService.delete(id);}



}

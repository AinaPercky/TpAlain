package EvaluationSb.mg.Service;

import EvaluationSb.mg.Entity.Joueur;
import EvaluationSb.mg.Repository.JoueurRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.List;

@Service
public class JoueurService {
    @Autowired
    JoueurRepository joueurRepository;
    public List<Joueur> joueurList()
    {
        return joueurRepository.findAll();
    }
    public void save(Joueur joueur){
        joueurRepository.save(joueur);
     }
     public void delete(Integer id){
        joueurRepository.deleteById(id);
     }

    public Joueur getId(int idJoueur) {
        return joueurRepository.findById(idJoueur).get();
    }
}

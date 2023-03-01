package EvaluationSb.mg.Repository;

import EvaluationSb.mg.Entity.Joueur;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface JoueurRepository extends JpaRepository<Joueur,Integer> {

}

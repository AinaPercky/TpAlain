package EvaluationSb.mg.Entity;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.Email;
import javax.validation.constraints.Size;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Joueur {
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private Integer idJoueur;
    @Size(min = 3,max = 50)
    @Email(message = "Entrez un nom valide")
    private String nomJoueur;
    @Size(min = 3,max = 50)
    private String equipeJoueur;
    @Size(min = 3,max = 50)
    private String posteJoueur;
}


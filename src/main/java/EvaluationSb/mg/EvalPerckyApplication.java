package EvaluationSb.mg;

import EvaluationSb.mg.Entity.Joueur;
import EvaluationSb.mg.Service.JoueurService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@SpringBootApplication
@RestController
public class EvalPerckyApplication {

	public static void main(String[] args) {
		SpringApplication.run(EvalPerckyApplication.class, args);
	}

	@GetMapping("/helloworld")
	public String hello() {
		return"Hello World!";
	}



}

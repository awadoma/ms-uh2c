package org.sid;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class MsUh2cApplication implements CommandLineRunner{       // POUR INSERE les donner
	@Autowired
	private EtudiantRepository etudiantRepository;
    @Autowired
    private FormationRepository formationRepository;
	public static void main(String[] args) {
		SpringApplication.run(MsUh2cApplication.class, args);
		
	}

	@Override
	public void run(String... args) throws Exception {
		//Formation f = new Formation();
		Formation f1= formationRepository.save(new Formation());
		Formation f2= formationRepository.save(new Formation());
		Formation f3= formationRepository.save(new Formation());
		
		//Etudiant et = new Etudiant(null,"ahmed","hassan", new Date());
		etudiantRepository.save(new Etudiant(null,"ahmed","hassan", new Date(),f1));
		etudiantRepository.save(new Etudiant(null,"Adam","Ali", new Date(),f1));
		etudiantRepository.save(new Etudiant(null,"Hassan","hassan", new Date(),f2));
		etudiantRepository.save(new Etudiant(null,"Khalid","hassan", new Date(),f3));
		
	}

}

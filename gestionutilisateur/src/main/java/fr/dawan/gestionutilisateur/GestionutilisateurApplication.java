package fr.dawan.gestionutilisateur;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import fr.dawan.gestionutilisateur.entities.User;
import fr.dawan.gestionutilisateur.service.IUserService;

@SpringBootApplication
public class GestionutilisateurApplication implements CommandLineRunner{

	@Autowired
	private IUserService service;
	
	public static void main(String[] args) {
		SpringApplication.run(GestionutilisateurApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		service.saveOrUpdate(new User("Olivier", "Atton", "oatton@gmail.com"));
		service.saveOrUpdate(new User("Danny", "Mello", "dmello@gmail.com"));
		service.saveOrUpdate(new User("Benjamin", "Lefranc", "blefranc@gmail.com"));
		service.saveOrUpdate(new User("Thomas", "Price", "tprice@gmail.com"));
	}

}

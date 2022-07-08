package fr.dawan.gestionutilisateur.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import fr.dawan.gestionutilisateur.entities.User;

public interface UserRepository extends JpaRepository<User, Long>{

}

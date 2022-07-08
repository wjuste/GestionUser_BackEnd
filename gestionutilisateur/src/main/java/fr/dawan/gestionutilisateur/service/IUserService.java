package fr.dawan.gestionutilisateur.service;

import java.util.List;

import fr.dawan.gestionutilisateur.entities.User;

public interface IUserService {
	
	List<User> getUsers();
	User findUserById(long id);
	void deleteUserById(long id);
	User saveOrUpdate(User user);
	
}

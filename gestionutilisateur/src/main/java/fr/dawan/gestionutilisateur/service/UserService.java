package fr.dawan.gestionutilisateur.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import fr.dawan.gestionutilisateur.entities.User;
import fr.dawan.gestionutilisateur.repository.UserRepository;

@Service
@Transactional
public class UserService implements IUserService{
	
	@Autowired
	private UserRepository userRepository;

	@Override
	public List<User> getUsers() {
		return userRepository.findAll();
	}

	@Override
	public User findUserById(long id) {
		User user = userRepository.findById(id).orElse(null);
		if(user == null) {
			throw new RuntimeException();
		}
		return user;
	}

	@Override
	public void deleteUserById(long id) {
		User user = this.findUserById(id);
		userRepository.delete(user);
	}

	@Override
	public User saveOrUpdate(User user) {
		User u = userRepository.saveAndFlush(user);
		return u;
	}
	
	
}

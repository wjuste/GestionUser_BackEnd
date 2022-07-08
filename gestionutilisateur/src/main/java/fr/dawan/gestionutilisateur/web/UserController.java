package fr.dawan.gestionutilisateur.web;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import fr.dawan.gestionutilisateur.entities.User;
import fr.dawan.gestionutilisateur.service.IUserService;

@RestController
@RequestMapping("/api/users")
@CrossOrigin(origins = "http://localhost:3004")
public class UserController {
	
	@Autowired
	private IUserService service;
	
	@GetMapping(value="", produces="application/json")
	public List<User> getUsers() {
		return service.getUsers();
	}
	
	@GetMapping("/{id}")
	public User findUser(@PathVariable long id) {
		return service.findUserById(id);
	}
	
	@DeleteMapping("/{id}")
	public void deleteUser(@PathVariable long id) {
		 service.deleteUserById(id);
	}
	
	@PostMapping("/add")
	public User addUser(@RequestBody User user) {
		return service.saveOrUpdate(user);
	}
	
	@PutMapping("/update")
	public User updateUser(@RequestBody User user) {
		return service.saveOrUpdate(user);
	}
}

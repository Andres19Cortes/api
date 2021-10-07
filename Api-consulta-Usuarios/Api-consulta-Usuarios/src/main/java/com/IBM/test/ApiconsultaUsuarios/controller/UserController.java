 package com.IBM.test.ApiconsultaUsuarios.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.IBM.test.ApiconsultaUsuarios.ConexionNube.ConexionUser;
import com.IBM.test.ApiconsultaUsuarios.UsersDAO.UsersDAO;
import com.IBM.test.ApiconsultaUsuarios.Usuarios.Usuarios;

@RestController
@CrossOrigin(origins = "*", methods = {RequestMethod.POST, RequestMethod.GET, RequestMethod.PUT, RequestMethod.DELETE})
@RequestMapping("/consulta") 
public class UserController {

	@Autowired
	private UsersDAO user;

	@Autowired
    private ConexionUser proxy;
	
	@PostMapping("/consulta")
	public Usuarios create(@Validated @RequestBody Usuarios p) {
		return user.insert(p);
	}
	
	@GetMapping("/users")
	public List<Usuarios> readAll() {
		List<Usuarios> usuarios = proxy.getAll();
		
		return user.saveAll(usuarios);
		
	}
	@PutMapping("/consulta/{_id}")
	public Usuarios update(@PathVariable String _id, @Validated @RequestBody Usuarios p) {
		return user.insert(p);
	}
	@DeleteMapping ("/consulta/{_id}") 
	public void delete(@PathVariable String _id) {
		user.deleteById(_id);
	}
	
	 
}

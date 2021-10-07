package com.IBM.test.ApiconsultaUsuarios.ConexionNube;

import java.util.List;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.IBM.test.ApiconsultaUsuarios.Usuarios.Usuarios;

@FeignClient (name="users", url="https://jsonplaceholder.typicode.com")
public interface ConexionUser {

	 @RequestMapping(method = RequestMethod.GET, value = "/users")
	    List<Usuarios> getAll(); 
		// TODO Auto-generated method stub
		
	}




	

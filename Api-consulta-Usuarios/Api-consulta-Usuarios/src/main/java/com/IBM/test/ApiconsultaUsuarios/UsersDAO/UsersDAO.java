package com.IBM.test.ApiconsultaUsuarios.UsersDAO;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Repository;

import com.IBM.test.ApiconsultaUsuarios.Usuarios.Usuarios;

@Repository
@Async
public interface UsersDAO extends MongoRepository<Usuarios, String> {
     
	
}

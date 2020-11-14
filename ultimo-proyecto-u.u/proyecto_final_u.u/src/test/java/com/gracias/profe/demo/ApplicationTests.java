package com.gracias.profe.demo;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;

import com.gracias.profe.model.Usuario;
import com.gracias.profe.repository.IUsuarioRepo;

@SpringBootTest
class ApplicationTests {
	@Autowired
	IUsuarioRepo uRepo;
	@Autowired
	private BCryptPasswordEncoder encoder;
	
	

	@Test
	void contextLoads() {
	
		Usuario usuario1 = new Usuario("admin", encoder.encode("123"));
		Usuario usuario2 = new Usuario("usertur", encoder.encode("123"));
		Usuario usuario3 = new Usuario("userpre", encoder.encode("123"));
		uRepo.save(usuario1);
		uRepo.save(usuario2);
		uRepo.save(usuario3);
	}

	
	
}

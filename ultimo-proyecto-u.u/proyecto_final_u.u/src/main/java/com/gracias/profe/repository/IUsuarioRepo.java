package com.gracias.profe.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.gracias.profe.model.Usuario;

public interface IUsuarioRepo extends JpaRepository<Usuario, Integer>{
	
	Usuario findByNombre(String nombre); 

}

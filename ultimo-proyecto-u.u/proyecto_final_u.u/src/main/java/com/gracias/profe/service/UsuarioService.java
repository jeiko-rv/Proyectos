package com.gracias.profe.service;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.gracias.profe.model.Usuario;
import com.gracias.profe.repository.IUsuarioRepo;

@Service
public class UsuarioService implements UserDetailsService {
	
	
	@Autowired
	private IUsuarioRepo uRepo;
	
	@Override
	public UserDetails loadUserByUsername(String nombre) throws UsernameNotFoundException {
		Usuario usuario = uRepo.findByNombre(nombre);
		ArrayList<GrantedAuthority> roles = new ArrayList<GrantedAuthority>();
		roles.add(new SimpleGrantedAuthority(usuario.getNombre()));
		UserDetails userDT = new User(usuario.getNombre(), usuario.getPassword(), roles); 
		return userDT;	
	}

	
	
}

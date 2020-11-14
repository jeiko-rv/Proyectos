package com.gracias.profe.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Usuario {
 @Id
 @GeneratedValue(strategy = GenerationType.IDENTITY)
 private int id;
 private String nombre;
 private String Password;
 
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getNombre() {
	return nombre;
}
public void setNombre(String nombre) {
	this.nombre = nombre;
}
public String getPassword() {
	return Password;
}
public void setPassword(String password) {
	Password = password;
}
public Usuario(String nombre, String password) {
	super();
	this.nombre = nombre;
	Password = password;
}
public Usuario(int id, String nombre, String password) {
	super();
	this.id = id;
	this.nombre = nombre;
	Password = password;
}
public Usuario() {
	super();
}

 

 
 
}

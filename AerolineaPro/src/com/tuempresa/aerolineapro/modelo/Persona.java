package com.tuempresa.aerolineapro.modelo;

import javax.persistence.*;

import org.openxava.annotations.*;

import lombok.*;

@Entity @Getter @Setter
public class Persona extends Identificable{
	
	@Column(length=64)
	String nombre;
	
	@Column(length=64)
	String apellido;
	
	@Files
	@Column(length=32)
	String fotos;
	
	@Embedded 
	Direccion direccion;
	
	
	
	

}

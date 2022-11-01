package com.tuempresa.aerolinea.modelo;

import javax.persistence.*;

import org.openxava.annotations.*;

import lombok.*;

@Entity @Getter @Setter
public class Empleado extends Identificable{
	
	@Column(length=32)
	@Required
	String nombre;
	
	@Column(length=32)
	String apellido;
	
	@Files
	@Column(length=32)
	String fotos;
	
	@ManyToOne(fetch=FetchType.LAZY,optional=true)
	@DescriptionsList
	Pais pais;
	
	@Embedded
	Direccion direccion;

}

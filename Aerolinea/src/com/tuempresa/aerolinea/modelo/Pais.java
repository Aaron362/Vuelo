package com.tuempresa.aerolinea.modelo;

import java.util.*;

import javax.persistence.*;

import org.openxava.annotations.*;

import lombok.*;

@Entity @Getter @Setter

public class Pais extends Identificable{
	
	
	@Column(length=32)
	@Required
	String nombre;
	
	@OneToMany(mappedBy="pais")
	Collection<Tripulacion>tripulacion;
	
	
}

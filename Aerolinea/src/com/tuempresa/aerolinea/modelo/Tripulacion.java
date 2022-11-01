package com.tuempresa.aerolinea.modelo;

import javax.persistence.*;

import org.openxava.annotations.*;

import lombok.*;

@Entity 
@Getter @Setter
public class Tripulacion extends Identificable{
	
	@Column(length=32)
	@Required 
	String nombre;
	
	@ManyToOne(fetch=FetchType.LAZY,optional=true)
	@DescriptionsList
	Aerolinea aerolinea;
	
	@ManyToOne(fetch=FetchType.LAZY,optional=true)
	@DescriptionsList
	Pais pais;
	
	

}

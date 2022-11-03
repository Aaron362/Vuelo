package com.tuempresa.aerolineapro.modelo;

import javax.persistence.*;

import lombok.*;

@Entity @Getter @Setter 
public class Aerolinea extends Identificable{
	
	@Column(length=32)
	String nombre;
	
	@ManyToOne(fetch=FetchType.LAZY,optional=true)
	Pais pais;

}

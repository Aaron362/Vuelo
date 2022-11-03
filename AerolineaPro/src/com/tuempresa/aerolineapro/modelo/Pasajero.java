package com.tuempresa.aerolineapro.modelo;

import javax.persistence.*;

import lombok.*;

@Entity @Getter @Setter
public class Pasajero extends Identificable{
	
	@Column(length=32)
	int asiento;
	
	@Column(length=32)
	float costo;
	
	@ManyToOne(fetch=FetchType.LAZY,optional=true)
	Persona persona;

}

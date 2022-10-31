package com.tuempresa.aeropuerto.modelo;

import javax.persistence.*;

import lombok.*;

@Entity
@Getter @Setter
public class Empleado {

	@Id
	@Column(length = 50)
	int numero;
	
	@Column(length = 50)
	String nombre;
	
	@ManyToOne
	(fetch = FetchType.LAZY, optional = true)
	Aerolinea aerolinea;
	
}

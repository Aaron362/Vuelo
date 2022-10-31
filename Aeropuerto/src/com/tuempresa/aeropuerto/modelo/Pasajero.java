package com.tuempresa.aeropuerto.modelo;

import javax.persistence.*;

import lombok.*;

@Entity @Getter @Setter
public class Pasajero {
	
	@Id
	@Column(length = 50)
	String id;
	
	@Column(length = 50)
	String nombre;
	
	@Embedded
	Direccion direccion;

}

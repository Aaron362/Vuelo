package com.tuempresa.aeropuerto.modelo;

import java.time.*;

import javax.persistence.*;

import org.openxava.annotations.*;

import lombok.*;

@Entity @Getter @Setter
public class Vuelo {

	@Id
	@Column(length = 40)
	int id;

	@Column(length = 40)
	String origen;
	
	@Column(length = 40)
	String destino;
	
	
	@Column(length = 40)

	LocalDate fecha;
	
	@ManyToOne(fetch=FetchType.LAZY, optional=false)
	Pasajero pasajero;
	
	@StringTime
	@Column(length=6)
	private String startTime;
	
	@ManyToOne
	(fetch = FetchType.LAZY ,optional =true)
	Tripulacion tripulacion;
}
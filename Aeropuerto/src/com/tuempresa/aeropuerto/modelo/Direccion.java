package com.tuempresa.aeropuerto.modelo;

import javax.persistence.*;

import lombok.*;

@Embeddable
@Getter @Setter
public class Direccion {
	
	@Column(length = 30)
	String calle;
	
	@Column(length = 30)
	String colonia;
	
	@Column(length = 30)
	String ciudad;
	
	@Column(length = 30)
	String pais;

}

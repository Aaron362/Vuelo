package com.tuempresa.aerolineapro.modelo;

import java.sql.*;
import java.time.*;

import javax.persistence.*;

import org.openxava.annotations.*;
import org.openxava.calculators.*;
import org.openxava.jpa.*;

import lombok.*;

@Entity @Getter @Setter 
public class Vuelo extends Identificable{
	@DefaultValueCalculator(CurrentYearCalculator.class)
	@Column(length = 4)
	int anyo;
	
	@Column(length=6)
	@ReadOnly
	int numero;
	
	@Required 
	@Column(length = 5)
	Time hora;
	
	
	
	@Column(length=32)
	String ciudad_origen;
	
	@Column(length=32)
	String ciudad_destino;
	
	LocalDate fecha;
	
	@ManyToOne(fetch=FetchType.LAZY,optional=true)
	Tripulacion tripulacion;
	
	@ManyToOne(fetch=FetchType.LAZY,optional=true)
	Pasajero pasajero;

	@PrePersist
	private void calcularNumero()	{
		Query query  = XPersistence.getManager().createQuery(
				"select max(f.numero) from "+
		        getClass().getSimpleName()+
		        " f where f.anyo = :anyo");
		query.setParameter("anyo", anyo);
		Integer ultimoNumero = (Integer) query.getSingleResult();
		this.numero = ultimoNumero == null ? 1 : ultimoNumero + 1;
	}
}

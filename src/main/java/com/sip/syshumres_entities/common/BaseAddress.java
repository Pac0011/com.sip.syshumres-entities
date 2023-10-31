package com.sip.syshumres_entities.common;

import javax.persistence.Column;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.MappedSuperclass;
import javax.validation.constraints.Size;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.sip.syshumres_entities.AddressState;

import lombok.Getter;
import lombok.Setter;

/**
 * Clase. Entity comun para Address
 * 
 * @author Prong
 * @version 2.0
 */
@MappedSuperclass
@Getter
@Setter
public class BaseAddress {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@Size(
        max=5,
        message = "Código postal debe tener una longitud máxima de {max} carácteres"
    )
	private String zip;
	
	@JsonIgnoreProperties(value = {"handler", "hibernateLazyInitializer"})
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name="addresses_states_id")
	private AddressState addressState;
	
	@Size(
		max=64,
		message = "Ciudad debe tener una longitud máxima de {max} carácteres"
	)
	@Column(name = "city")
	private String city;
	
	@Size(
		max=64,
		message = "Municipio debe tener una longitud máxima de {max} carácteres"
	)
	@Column(name = "municipality")
	private String municipality;
	
	@Size(
		max=64,
		message = "Colonia debe tener una longitud máxima de {max} carácteres"
	)
	@Column(name = "colony")
	private String colony;
	
	@Size(
		max=64,
		message = "Calle debe tener una longitud máxima de {max} carácteres"
	)
	@Column(name = "street")
	private String street;
	
	@Size(
		max=12,
		message = "Número debe tener una longitud máxima de {max} carácteres"
	)
	@Column(name = "number")
	private String number;
	
	@Size(
		max=12,
		message = "Número debe tener una longitud máxima de {max} carácteres"
	)
	@Column(name = "number_interior")
	private String numberInterior;
	
	//private boolean sepomex
	
	//Crear las referencias al catalogo de ciudades 
	//@Column(name = "city_id")
	//private Long cityId
	
	//Crear las referencias al catalogo de municipios
	//@Column(name = "municipality_id")
	//private Long municipalityId
	
	//Crear las referencias al catalogo de colonias 
	//@Column(name = "colony_id")
	//private Long colonyId

}

package com.sip.syshumres_entities;

import java.util.Objects;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import javax.validation.constraints.Size;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

/**
 * Clase Entity. Registro de direcciones ubicacion y fiscal para Empresas y Sucursales
 * 
 * @author Prong
 * @version 2.0
 */
@Entity
@Table(name="addresses")
@Getter
@Setter
@NoArgsConstructor
@ToString
public class Address {
	
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
	
	//private boolean sepomex;
	
	//Crear las referencias al catalogo de ciudades 
	//@Column(name = "city_id")
	//private Long cityId;
	
	//Crear las referencias al catalogo de municipios
	//@Column(name = "municipality_id")
	//private Long municipalityId;
	
	//Crear las referencias al catalogo de colonias 
	//@Column(name = "colony_id")
	//private Long colonyId;
	
	@Override
	public int hashCode() {
		return Objects.hash(id);
	}
	
	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		
		if (!(obj instanceof Address)) {
			return false;
		}
		Address s = (Address) obj;
		
		return this.id != null && this.id.equals(s.getId());
	}
}

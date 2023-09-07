package com.sip.syshumres_entities;

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

/**
 * Clase Entity. Registro de direcciones ubicacion y fiscal para empleados
 * 
 * @author Prong
 * @version 2.0
 */
@Entity
@Table(name="employee_addresses")
public class EmployeeAddress {
	
	public EmployeeAddress() {}
	
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

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getZip() {
		return zip;
	}

	public void setZip(String zip) {
		this.zip = zip;
	}

	public AddressState getAddressState() {
		return addressState;
	}

	public void setAddressState(AddressState addressState) {
		this.addressState = addressState;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getMunicipality() {
		return municipality;
	}

	public void setMunicipality(String municipality) {
		this.municipality = municipality;
	}

	public String getColony() {
		return colony;
	}

	public void setColony(String colony) {
		this.colony = colony;
	}

	public String getStreet() {
		return street;
	}

	public void setStreet(String street) {
		this.street = street;
	}

	public String getNumber() {
		return number;
	}

	public void setNumber(String number) {
		this.number = number;
	}

	public String getNumberInterior() {
		return numberInterior;
	}

	public void setNumberInterior(String numberInterior) {
		this.numberInterior = numberInterior;
	}
	
	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		
		if (!(obj instanceof EmployeeAddress)) {
			return false;
		}
		EmployeeAddress s = (EmployeeAddress) obj;
		
		return this.id != null && this.id.equals(s.getId());
	}

	@Override
	public String toString() {
		return "EmployeeAddress [id=" + id + ", zip=" + zip + ", addressState=" + addressState + ", city=" + city + ", municipality="
				+ municipality + ", colony=" + colony + ", street=" + street + ", number=" + number
				+ ", numberInterior=" + numberInterior + "]";
	}

}

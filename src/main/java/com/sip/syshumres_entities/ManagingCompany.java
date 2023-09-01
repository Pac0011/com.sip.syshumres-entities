package com.sip.syshumres_entities;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.Optional;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.Transient;
import javax.validation.Valid;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.sip.syshumres_entities.common.BaseEntityCatalog;

/**
 * Clase Entity. Catalogo de Administradoras para contratación Outsourcing
 * 
 * @author Prong
 * @version 2.0
 */
@Entity
@Table(name="managing_companies")
public class ManagingCompany extends BaseEntityCatalog {

	public ManagingCompany() {
		this.branchOffices = new ArrayList<>();
	}

	//Razon social de la administradora
	@NotEmpty
	@Size(
		min=1,
		max=256,
		message = "debe tener una longitud máxima de {max} carácteres"
	)
	@Column(name = "company_name")
	private String companyName;
	
	@Size(
		max=12,
		message = "Número teléfono debe tener una longitud máxima de {max} caracteres"
	)
	@Column(name = "phone_number")
	private String phoneNumber;
	
	@Size(
		max=6,
		message = "Extensión de número teléfono debe tener una longitud máxima de {max} caracteres"
	)
	@Column(name = "ext_phone_number")
	private String extPhoneNumber;
	
	@Size(
		max=6,
		message = "Corto de número teléfono debe tener una longitud máxima de {max} caracteres"
	)
	@Column(name = "short_phone_number")
	private String shortPhoneNumber;
	
	@Transient
	public String getFullPhoneNumber() {
		return new StringBuilder(Optional.ofNullable(this.phoneNumber).orElse(""))
				.append(" Ext.: ")
				.append(Optional.ofNullable(this.extPhoneNumber).orElse("")).toString();
	}
		
	@NotEmpty
	@Email
	@Size(max=64)
	private String email;
	
	//Rfc de la administradora
	@NotEmpty
	@Size(
		min=1,
		max=13,
		message = "debe tener una longitud máxima de {max} carácteres"
	)
	private String rfc;
	
	//Registro patronal
	@NotEmpty
	@Size(
		min=1,
		max=13,
		message = "debe tener una longitud máxima de {max} carácteres"
	)
	@Column(name = "employer_registration")
	private String employerRegistration;
	
	//Representante legal de la administradora
	@NotEmpty
	@Size(
		min=1,
		max=128,
		message = "debe tener una longitud máxima de {max} carácteres"
	)
	@Column(name = "legal_representative")
	private String legalRepresentative;
	
	//Contratacion empresa o outsourcing
	@JsonIgnoreProperties(value = {"handler", "hibernateLazyInitializer"})
	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(name="type_hiring_id")
	private TypeHiring typeHiring;
	
	//Se utiliza cascade = CascadeType.ALL para indicarle a hibernate que guarde este hijo tambien
	@JsonIgnoreProperties(value = {"handler", "hibernateLazyInitializer"})
	@OneToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
	@JoinColumn(name="address_id")
	@Valid
	private Address address;
	
	@JsonIgnoreProperties(value = {"handler", "hibernateLazyInitializer"})
	@OneToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
	@JoinColumn(name="address_fiscal_id")
	@Valid
	private Address addressFiscal;
	
	/*
	 * Cuando creas una administradora le tienes que agregar las Sucursales que la van a ocupar.
	 * Osea aqui se agregan las sucursales y no al reves cuando crees una Sucursal 
	 * te va a pedir las administradoras
	 * Se usa el @ManyToMany(cascade = CascadeType.DETACH), pq esta relacion se guarda de forma independiente
	 * No se usa CascadeType.ALL, pq esto guarda al ojecto padre y a los hijos, 
	 * y se utiliza un DTO para las sucursales
	 */
	@JoinTable(
	    name = "managing_companies_branch_office",
	    joinColumns = @JoinColumn(name = "managing_company_id", nullable = false),
	    inverseJoinColumns = @JoinColumn(name="branch_office_id", nullable = false)
	)
	@JsonIgnoreProperties(value = {"managingCompanies"}, allowSetters = true)
	@ManyToMany(cascade = CascadeType.DETACH)
	private List<BranchOffice> branchOffices;
	
	public void addBranchOffice(BranchOffice branchOffice) {
		this.branchOffices.add(branchOffice);
	}
	
	public void removeBranchOffice(BranchOffice branchOffice) {
		this.branchOffices.remove(branchOffice);
	}
	
	public String getLegalRepresentative() {
		return legalRepresentative;
	}

	public void setLegalRepresentative(String legalRepresentative) {
		this.legalRepresentative = legalRepresentative;
	}

	public String getCompanyName() {
		return companyName;
	}

	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public String getExtPhoneNumber() {
		return extPhoneNumber;
	}

	public void setExtPhoneNumber(String extPhoneNumber) {
		this.extPhoneNumber = extPhoneNumber;
	}

	public String getShortPhoneNumber() {
		return shortPhoneNumber;
	}

	public void setShortPhoneNumber(String shortPhoneNumber) {
		this.shortPhoneNumber = shortPhoneNumber;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getRfc() {
		return rfc;
	}

	public void setRfc(String rfc) {
		this.rfc = rfc;
	}

	public String getEmployerRegistration() {
		return employerRegistration;
	}

	public void setEmployerRegistration(String employerRegistration) {
		this.employerRegistration = employerRegistration;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	public Address getAddressFiscal() {
		return addressFiscal;
	}

	public void setAddressFiscal(Address addressFiscal) {
		this.addressFiscal = addressFiscal;
	}

	public List<BranchOffice> getBranchOffices() {
		return branchOffices;
	}

	public void setBranchOffices(List<BranchOffice> branchOffices) {
		this.branchOffices = branchOffices;
	}
	
	public TypeHiring getTypeHiring() {
		return typeHiring;
	}

	public void setTypeHiring(TypeHiring typeHiring) {
		this.typeHiring = typeHiring;
	}
	
	@Override
	public int hashCode() {
		return Objects.hash(this.getId());
	}
	
	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		
		if (!(obj instanceof ManagingCompany)) {
			return false;
		}
		ManagingCompany s = (ManagingCompany) obj;
		
		return this.getId() != null && this.getId().equals(s.getId());
	}

	@Override
	public String toString() {
		return "ManagingCompany " + super.toString();
	}

}

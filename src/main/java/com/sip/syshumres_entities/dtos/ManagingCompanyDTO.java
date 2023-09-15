package com.sip.syshumres_entities.dtos;

import java.io.Serializable;
import java.util.List;
import java.util.Objects;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.sip.syshumres_entities.Address;


/**
 * Clase DTO. Forma para Administradoras
 * 
 * @author Prong
 * @version 2.0
 */
@JsonInclude(Include.NON_NULL)
public class ManagingCompanyDTO implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = -393488541872429673L;
	
	public ManagingCompanyDTO() {
		super();
	}

	private Long id;
	
	@NotEmpty
	@Size(
		min=1,
		max=64,
		message = "debe tener una longitud entre {min} y {max} caracteres"
	)
	private String description;
	
	@Size(
		max=12,
		message = "Número teléfono debe tener una longitud máxima de {max} caracteres"
	)
    private String phoneNumber;
    
	@Size(
		max=6,
		message = "Extensión de número teléfono debe tener una longitud máxima de {max} caracteres"
	)
    private String extPhoneNumber;
	
	@Size(
		max=6,
		message = "Corto de número teléfono debe tener una longitud máxima de {max} caracteres"
	)
	private String shortPhoneNumber;
	
	private String fullPhoneNumber;
	
	@NotEmpty
	@Email
	@Size(max=64)
	private String email;
	
	@NotEmpty
	@Size(
		min=1,
		max=256,
		message = "debe tener una longitud máxima de {max} carácteres"
	)
	private String companyName;
	
	@NotEmpty
	@Size(
		min=1,
		max=13,
		message = "debe tener una longitud máxima de {max} carácteres"
	)
	private String rfc;
	
	@NotEmpty
	@Size(
		min=1,
		max=13,
		message = "debe tener una longitud máxima de {max} carácteres"
	)
	private String employerRegistration;
	
	@NotEmpty
	@Size(
		min=1,
		max=128,
		message = "debe tener una longitud máxima de {max} carácteres"
	)
	private String legalRepresentative;
	
	private EntitySelectDTO typeHiring;
		
	private boolean enabled;
	
	private List<EntitySelectDTO> branchOffices;
	
	@JsonIgnoreProperties(value = {"handler", "hibernateLazyInitializer"})
	private Address address;
	
	@JsonIgnoreProperties(value = {"handler", "hibernateLazyInitializer"})
	private Address addressFiscal;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
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

	public String getFullPhoneNumber() {
		return fullPhoneNumber;
	}

	public void setFullPhoneNumber(String fullPhoneNumber) {
		this.fullPhoneNumber = fullPhoneNumber;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getCompanyName() {
		return companyName;
	}

	public void setCompanyName(String companyName) {
		this.companyName = companyName;
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

	public String getLegalRepresentative() {
		return legalRepresentative;
	}

	public void setLegalRepresentative(String legalRepresentative) {
		this.legalRepresentative = legalRepresentative;
	}

	public EntitySelectDTO getTypeHiring() {
		return typeHiring;
	}

	public void setTypeHiring(EntitySelectDTO typeHiring) {
		this.typeHiring = typeHiring;
	}

	public boolean isEnabled() {
		return enabled;
	}

	public void setEnabled(boolean enabled) {
		this.enabled = enabled;
	}

	public List<EntitySelectDTO> getBranchOffices() {
		return branchOffices;
	}

	public void setBranchOffices(List<EntitySelectDTO> branchOffices) {
		this.branchOffices = branchOffices;
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

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	@Override
	public int hashCode() {
		return Objects.hash(id);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		ManagingCompanyDTO other = (ManagingCompanyDTO) obj;
		return id.equals(other.id);
	}

	@Override
	public String toString() {
		return "ManagingCompanyDTO [id=" + id + ", description=" + description + ", phoneNumber=" + phoneNumber
				+ ", extPhoneNumber=" + extPhoneNumber + ", shortPhoneNumber=" + shortPhoneNumber + ", fullPhoneNumber="
				+ fullPhoneNumber + ", email=" + email + ", companyName=" + companyName + ", rfc=" + rfc
				+ ", employerRegistration=" + employerRegistration + "]";
	}
	
}

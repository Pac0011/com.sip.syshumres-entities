package com.sip.syshumres_entities.dtos;

import java.io.Serializable;
import java.util.List;
import java.util.Objects;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.sip.syshumres_entities.Address;


/**
 * Clase DTO. Forma para Administradoras
 * 
 * @author Prong
 * @version 2.0
 */
public class ManagingCompanyDTO implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = -393488541872429673L;

	private Long id;
	
	private String description;
	
    private String phoneNumber;
    
    private String extPhoneNumber;
	
	private String shortPhoneNumber;
	
	private String fullPhoneNumber;
	
	private String email;
	
	private String companyName;
	
	private String rfc;
	
	private String employerRegistration;
	
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

package com.sip.syshumres_entities.dtos;

import java.io.Serializable;
import java.util.List;
import java.util.Objects;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.sip.syshumres_entities.Address;

/**
 * Clase DTO. Forma para Sucursales
 * 
 * @author Prong
 * @version 2.0
 */
public class BranchOfficeDTO implements Serializable {
    /**
	 * 
	 */
	private static final long serialVersionUID = 1799527185250030060L;
	
	public BranchOfficeDTO() {
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
	
	private EntitySelectDTO branchOfficeType;
	
	private EntitySelectDTO costCenter;
	
	private EntitySelectDTO region;
	
	private EntitySelectDTO father;
	
	private List<EntitySelectDTO> childs;
	
	@JsonIgnoreProperties(value = {"handler", "hibernateLazyInitializer"})
	private Address address;
	
	private boolean enabled;

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

	public EntitySelectDTO getBranchOfficeType() {
		return branchOfficeType;
	}

	public void setBranchOfficeType(EntitySelectDTO branchOfficeType) {
		this.branchOfficeType = branchOfficeType;
	}

	public EntitySelectDTO getCostCenter() {
		return costCenter;
	}

	public void setCostCenter(EntitySelectDTO costCenter) {
		this.costCenter = costCenter;
	}

	public EntitySelectDTO getRegion() {
		return region;
	}

	public void setRegion(EntitySelectDTO region) {
		this.region = region;
	}

	public EntitySelectDTO getFather() {
		return father;
	}

	public void setFather(EntitySelectDTO father) {
		this.father = father;
	}

	public List<EntitySelectDTO> getChilds() {
		return childs;
	}

	public void setChilds(List<EntitySelectDTO> childs) {
		this.childs = childs;
	}

	public boolean isEnabled() {
		return enabled;
	}

	public void setEnabled(boolean enabled) {
		this.enabled = enabled;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
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
		BranchOfficeDTO other = (BranchOfficeDTO) obj;
		return id.equals(other.id);
	}

	@Override
	public String toString() {
		return "BranchOfficeDTO [id=" + id + ", description=" + description + ", phoneNumber=" + phoneNumber
				+ ", extPhoneNumber=" + extPhoneNumber + ", shortPhoneNumber=" + shortPhoneNumber + ", fullPhoneNumber="
				+ fullPhoneNumber + ", email=" + email + ", branchOfficeType=" + branchOfficeType + ", enabled="
				+ enabled + "]";
	}
	
}

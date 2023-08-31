package com.sip.syshumres_entities;

import java.util.List;
import java.util.Objects;
import java.util.Optional;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
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
 * Clase Entity. Catalogo de Sucursales
 * 
 * @author Prong
 * @version 2.0
 */
@Entity
@Table(name="branch_offices")
public class BranchOffice extends BaseEntityCatalog {
	
	public BranchOffice() {}

	public BranchOffice(Long id, String description) {
		this.setId(id);
		this.setDescription(description);
	}
	
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
	
	@JsonIgnoreProperties(value = {"handler", "hibernateLazyInitializer"})
	@OneToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
	@JoinColumn(name="address_id")
	@Valid
	private Address address;
	
	@JsonIgnoreProperties(value = {"handler", "hibernateLazyInitializer"})
	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(name="branch_office_type_id")
	private BranchOfficeType branchOfficeType;
	
	@JsonIgnoreProperties(value = {"handler", "hibernateLazyInitializer"})
	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(name="cost_center_id")
	private CostCenter costCenter;
	
	@JsonIgnoreProperties(value = {"handler", "hibernateLazyInitializer"})
	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(name="region_id")
	private Region region;
	
	@JsonIgnoreProperties(value = {"childs", "handler", "hibernateLazyInitializer"})
	@ManyToOne(fetch = FetchType.EAGER)
	private BranchOffice father;
	
	@JsonIgnoreProperties(value = {"father", "handler", "hibernateLazyInitializer"}, allowSetters = true)
	@OneToMany(fetch = FetchType.LAZY, mappedBy = "father", cascade = CascadeType.ALL)
	private List<BranchOffice> childs;
	
	@JsonIgnoreProperties(value = {"branchOffices", "handler", "hibernateLazyInitializer"})
	@ManyToMany(mappedBy = "branchOffices")
    private List<ManagingCompany> managingCompanies;

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

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	public BranchOfficeType getBranchOfficeType() {
		return branchOfficeType;
	}

	public void setBranchOfficeType(BranchOfficeType branchOfficeType) {
		this.branchOfficeType = branchOfficeType;
	}

	public List<ManagingCompany> getManagingCompanies() {
		return managingCompanies;
	}

	public void setManagingCompanies(List<ManagingCompany> managingCompanies) {
		this.managingCompanies = managingCompanies;
	}

	public CostCenter getCostCenter() {
		return costCenter;
	}

	public void setCostCenter(CostCenter costCenter) {
		this.costCenter = costCenter;
	}

	public Region getRegion() {
		return region;
	}

	public void setRegion(Region region) {
		this.region = region;
	}

	public BranchOffice getFather() {
		return father;
	}

	public void setFather(BranchOffice father) {
		this.father = father;
	}

	public List<BranchOffice> getChilds() {
		return childs;
	}

	public void setChilds(List<BranchOffice> childs) {
		this.childs = childs;
	}

	@Override
	public String toString() {
		return "BranchOffice " + super.toString();
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
		
		if (!(obj instanceof BranchOffice)) {
			return false;
		}
		BranchOffice s = (BranchOffice) obj;
		
		return this.getId() != null && this.getId().equals(s.getId());
	}

}

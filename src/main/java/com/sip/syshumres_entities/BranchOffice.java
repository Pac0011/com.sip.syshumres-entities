package com.sip.syshumres_entities;

import java.util.List;
import java.util.Objects;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.validation.Valid;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.sip.syshumres_entities.common.BaseContactInfo;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

/**
 * Clase Entity. Catalogo de Sucursales
 * 
 * @author Prong
 * @version 2.0
 */
@Entity
@Table(name="branch_offices")
@Getter
@Setter
@NoArgsConstructor
@ToString
public class BranchOffice extends BaseContactInfo {

	public BranchOffice(Long id, String description) {
		this.setId(id);
		this.setDescription(description);
	}
	
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

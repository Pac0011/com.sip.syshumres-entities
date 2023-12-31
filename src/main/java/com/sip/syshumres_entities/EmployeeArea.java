package com.sip.syshumres_entities;

import java.util.List;
import java.util.Objects;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.sip.syshumres_entities.common.BaseEntityCatalog;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

/**
 * Clase Entity. Catalogo de Areas para empleado
 * 
 * @author Prong
 * @version 2.0
 */
@Entity
@Table(name="employee_areas")
@Getter
@Setter
@NoArgsConstructor
@ToString
public class EmployeeArea extends BaseEntityCatalog {

	public EmployeeArea(Long id, String description, boolean enabled) {
		this.setId(id);
		this.setDescription(description);
		this.setEnabled(enabled);
	}
	
	@JsonIgnoreProperties(value = {"handler", "hibernateLazyInitializer"})
	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(name="cost_center_id")
	@NotNull
	private CostCenter costCenter;
	
	@JsonIgnoreProperties(value = {"childs", "handler", "hibernateLazyInitializer"})
	@ManyToOne(fetch = FetchType.EAGER)
	private EmployeeArea father;
	
	@JsonIgnoreProperties(value = {"father", "handler", "hibernateLazyInitializer"}, allowSetters = true)
	@OneToMany(fetch = FetchType.LAZY, mappedBy = "father", cascade = CascadeType.ALL)
	private List<EmployeeArea> childs;
	
	@Override
	public int hashCode() {
		return Objects.hash(this.getId());
	}
	
	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		
		if (!(obj instanceof EmployeeArea)) {
			return false;
		}
		EmployeeArea s = (EmployeeArea) obj;
		
		return this.getId() != null && this.getId().equals(s.getId());
	}
	
}

package com.sip.syshumres_entities;

import java.util.Objects;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.sip.syshumres_entities.common.BaseEntityCatalog;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;


/**
 * Clase Entity. Catalogo de puestos de empleados
 * 
 * @author Prong
 * @version 2.0
 */
@Entity
@Table(name="employee_positions")
@Getter
@Setter
@NoArgsConstructor
@ToString
public class EmployeePosition extends BaseEntityCatalog {
	
	public EmployeePosition(Long id, String description, boolean enabled) {
		this.setId(id);
		this.setDescription(description);
		this.setEnabled(enabled);
	}
	
	@JsonIgnoreProperties(value = {"handler", "hibernateLazyInitializer"})
	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(name="employee_type_id")
	@NotNull
	private EmployeeType employeeType;
	
	@Override
	public int hashCode() {
		return Objects.hash(this.getId());
	}
	
	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		
		if (!(obj instanceof EmployeePosition)) {
			return false;
		}
		EmployeePosition s = (EmployeePosition) obj;
		
		return this.getId() != null && this.getId().equals(s.getId());
	}

}

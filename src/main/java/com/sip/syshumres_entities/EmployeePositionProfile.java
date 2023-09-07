package com.sip.syshumres_entities;

import java.util.Objects;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.sip.syshumres_entities.common.BaseEntityCatalog;


/**
 * Clase Entity. Catalogo de Perfil de puesto (Comodin, Base, Cubredescansos, especial, etc)
 * 
 * @author Prong
 * @version 2.0
 */
@Entity
@Table(name="employee_position_profiles")
public class EmployeePositionProfile extends BaseEntityCatalog {
	
	public EmployeePositionProfile() {}
	
	//Si la posicion entra en la nomina o no
	//@ManyToOne(fetch = FetchType.LAZY)
	//@JoinColumn(name="employee_position_profile_payroll_id")
	//private EmployeePositionProfilePayroll employeePositionProfilePayroll;
	
	@Column(columnDefinition = "boolean default false")
	private boolean payroll;
	
	//Si el perfil tiene plantilla definida
	@Column(columnDefinition = "boolean default false")
	private boolean hasStaff;
	
	//EL tipo de plantilla para el perfil
	@JsonIgnoreProperties(value = {"handler", "hibernateLazyInitializer"})
	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(name= "types_staff_id")
	private TypeStaff typeStaff;

	public boolean isPayroll() {
		return payroll;
	}

	public void setPayroll(boolean payroll) {
		this.payroll = payroll;
	}

	public boolean isHasStaff() {
		return hasStaff;
	}

	public void setHasStaff(boolean hasStaff) {
		this.hasStaff = hasStaff;
	}

	public TypeStaff getTypeStaff() {
		return typeStaff;
	}

	public void setTypeStaff(TypeStaff typeStaff) {
		this.typeStaff = typeStaff;
	}

	@Override
	public String toString() {
		return "EmployeePositionProfile" + super.toString();
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
		
		if (!(obj instanceof EmployeePositionProfile)) {
			return false;
		}
		EmployeePositionProfile s = (EmployeePositionProfile) obj;
		
		return this.getId() != null && this.getId().equals(s.getId());
	}

}

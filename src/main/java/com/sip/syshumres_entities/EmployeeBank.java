package com.sip.syshumres_entities;

import javax.persistence.Entity;
import javax.persistence.Table;

import com.sip.syshumres_entities.common.BaseEntityCatalog;


/**
 * Clase Entity. Catalogo de bancos para empleados
 * 
 * @author Prong
 * @version 2.0
 */
@Entity
@Table(name="employee_banks")
public class EmployeeBank extends BaseEntityCatalog {
	
	public EmployeeBank() {}
	
	@Override
	public String toString() {
		return "EmployeeBank " + super.toString();
	}

}

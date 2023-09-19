package com.sip.syshumres_entities;

import java.util.Objects;

import javax.persistence.Entity;
import javax.persistence.Table;

import com.sip.syshumres_entities.common.BaseEntityCatalog;

import lombok.NoArgsConstructor;
import lombok.ToString;


/**
 * Clase Entity. Catalogo de cursos (Registro de inducción, Basico de seguridad, Manejo de tonfa / PR-24, Manejo preventivo y reactivo)
 * 
 * @author Prong
 * @version 2.0
 */
@Entity
@Table(name="employee_special_courses")
@NoArgsConstructor
@ToString
public class EmployeeSpecialCourses extends BaseEntityCatalog {
	
	@Override
	public int hashCode() {
		return Objects.hash(this.getId());
	}
	
	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		
		if (!(obj instanceof EmployeeSpecialCourses)) {
			return false;
		}
		EmployeeSpecialCourses s = (EmployeeSpecialCourses) obj;
		
		return this.getId() != null && this.getId().equals(s.getId());
	}

}

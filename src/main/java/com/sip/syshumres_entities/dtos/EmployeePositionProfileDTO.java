package com.sip.syshumres_entities.dtos;

import java.io.Serializable;
import java.util.Objects;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

/**
 * Clase DTO. Forma para EmployeePositionProfile
 * 
 * @author Prong
 * @version 2.0
 */
@Getter
@Setter
@NoArgsConstructor
@ToString
public class EmployeePositionProfileDTO extends BaseEntityCatalogDTO implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = -2247674233450164213L;
	
	private boolean payroll;
	
	private boolean hasStaff;
	
	private EntitySelectDTO typeStaff;
	
	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	@Override
	public int hashCode() {
		return Objects.hash(this.getId());
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		EmployeePositionProfileDTO other = (EmployeePositionProfileDTO) obj;
		return this.getId().equals(other.getId());
	}
	
}

package com.sip.syshumres_entities.dtos;

import java.io.Serializable;
import java.util.Objects;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;

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
public class EmployeePositionProfileDTO implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = -2247674233450164213L;

	private Long id;
	
	@NotEmpty
	@Size(
		min=1,
		max=64,
		message = "debe tener una longitud entre {min} y {max} caracteres"
	)
	private String description;
	
	private boolean payroll;
	
	private boolean hasStaff;
	
	private EntitySelectDTO typeStaff;
	
	private boolean enabled;

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
		EmployeePositionProfileDTO other = (EmployeePositionProfileDTO) obj;
		return id.equals(other.id);
	}
	
}

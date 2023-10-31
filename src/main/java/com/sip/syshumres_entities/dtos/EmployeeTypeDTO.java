package com.sip.syshumres_entities.dtos;

import java.io.Serializable;
import java.util.Objects;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;

import com.sip.syshumres_entities.dtos.common.BaseEntityCatalogDTO;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

/**
 * Clase DTO.
 * 
 * @author Prong
 * @version 2.0
 */
@Getter
@Setter
@NoArgsConstructor
@ToString
public class EmployeeTypeDTO extends BaseEntityCatalogDTO implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 8641674487269169615L;
	
	@NotEmpty
	@Size(
		min=1,
		max=3,
		message = "debe tener una longitud máxima de {max} carácteres"
	)
	private String prefix;
	
	@Override
	public int hashCode() {
		return Objects.hash(this.getId());
	}
	
	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		
		if (!(obj instanceof EmployeeTypeDTO)) {
			return false;
		}
		EmployeeTypeDTO s = (EmployeeTypeDTO) obj;
		
		return this.getId() != null && this.getId().equals(s.getId());
	}

}

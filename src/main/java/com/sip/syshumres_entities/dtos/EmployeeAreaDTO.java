package com.sip.syshumres_entities.dtos;

import java.io.Serializable;
import java.util.List;
import java.util.Objects;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.sip.syshumres_entities.dtos.common.BaseEntityCatalogDTO;
import com.sip.syshumres_entities.dtos.common.EntitySelectDTO;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;


/**
 * Clase DTO. Forma para Areas
 * 
 * @author Prong
 * @version 2.0
 */
@JsonInclude(Include.NON_NULL)
@Getter
@Setter
@NoArgsConstructor
@ToString
public class EmployeeAreaDTO extends BaseEntityCatalogDTO implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = -6897626775696378030L;
	
	private EntitySelectDTO costCenter;
	
	private EntitySelectDTO father;
	
	private List<EntitySelectDTO> childs;
	
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
		EmployeeAreaDTO other = (EmployeeAreaDTO) obj;
		return this.getId().equals(other.getId());
	}
	
}

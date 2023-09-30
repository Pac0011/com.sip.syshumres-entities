package com.sip.syshumres_entities.dtos;

import java.io.Serializable;

import javax.validation.constraints.NotNull;

import com.sip.syshumres_entities.dtos.common.BaseEntityCatalogDTO;
import com.sip.syshumres_entities.dtos.common.EntitySelectDTO;

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
public class EmployeePositionDTO  extends BaseEntityCatalogDTO implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = -1063953432739913914L;
	
	@NotNull
	private EntitySelectDTO employeeType;

}

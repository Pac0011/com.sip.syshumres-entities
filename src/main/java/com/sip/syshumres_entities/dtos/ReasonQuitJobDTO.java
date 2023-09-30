package com.sip.syshumres_entities.dtos;

import java.io.Serializable;

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
public class ReasonQuitJobDTO extends BaseEntityCatalogDTO implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 584650046466532934L;
	
	private boolean rehire;

}

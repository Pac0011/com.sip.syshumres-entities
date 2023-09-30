package com.sip.syshumres_entities.dtos;

import java.io.Serializable;

import com.sip.syshumres_entities.dtos.common.BaseEntityCatalogDTO;

import lombok.NoArgsConstructor;

/**
 * Clase DTO.
 * 
 * @author Prong
 * @version 2.0
 */
@NoArgsConstructor
public class HiringDocumentsTypeDTO extends BaseEntityCatalogDTO implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 4365837629406205178L;

	@Override
	public String toString() {
		//Se utiliza este para que el model.mapper solo le agregue la description  al DTO
		return super.getDescription();
	}

}

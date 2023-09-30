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
public class HiringDocumentsDTO extends BaseEntityCatalogDTO implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 9096461214777610233L;
	
	@NotNull
	private EntitySelectDTO hiringDocumentsType;

}

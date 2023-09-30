package com.sip.syshumres_entities.dtos;

import java.io.Serializable;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.sip.syshumres_entities.dtos.common.EntitySelectDTO;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

/**
 * Clase DTO. para Servicios
 * 
 * @author Prong
 * @version 2.0
 */
@JsonInclude(Include.NON_NULL)
@Getter
@Setter
@NoArgsConstructor
@ToString
public class ServiceDTO implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -918426954810935024L;	

	private Long id;
	
	@NotEmpty
	@Size(min=4, max=64)
	private String code;
	
	private EntitySelectDTO client;
	
	private boolean enabled;
	
	public String getServiceNumber() {
		return "SRV" + this.id;
    }

	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	
}

package com.sip.syshumres_entities.dtos;

import java.io.Serializable;
import java.util.List;
import java.util.Objects;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

/**
 * Clase DTO. Forma para Roles
 * 
 * @author Prong
 * @version 2.0
 */
@JsonInclude(Include.NON_NULL)
@Getter
@Setter
@NoArgsConstructor
@ToString
public class AuthorityDTO implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = -6715754285297926332L;
	
	private Long id;
	
	@NotEmpty
	@Size(max=32)
	private String description;
	
	@NotEmpty
	@Size(max=64)
	private String detail;
	
    private List<EntitySelectDTO> users;
    
    private List<EntitySelectDTO> modules;
    
    private List<ModuleListDTO> modulesDtos;
    
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
		AuthorityDTO other = (AuthorityDTO) obj;
		return id.equals(other.id);
	}
	
}

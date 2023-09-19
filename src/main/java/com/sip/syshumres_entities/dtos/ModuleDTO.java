package com.sip.syshumres_entities.dtos;

import java.io.Serializable;
import java.util.List;
import java.util.Objects;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

/**
 * Clase DTO. Forma para Modulos
 * 
 * @author Prong
 * @version 2.0
 */
@Getter
@Setter
@NoArgsConstructor
@ToString
public class ModuleDTO implements Serializable {	
	/**
	 * 
	 */
	private static final long serialVersionUID = 173280853296679451L;

	private Long id;
	
	@NotEmpty
	@Size(max=32)
	private String description;
	
	@NotEmpty
	@Size(max=64)
	private String detail;
	
	@NotEmpty
	@Size(
		max=64,
	    message = "La url del endpoint debe tener una longitud máxima de {max} caracteres"
	)
    private String url;
    
	@NotEmpty
	@Size(
		max=64,
	    message = "La url del menu debe tener una longitud máxima de {max} caracteres"
	)
    private String urlMenu;
	
	@NotEmpty
	@Size(max=32)
	private String icon;
	
    private EntitySelectDTO father;
	
	private List<EntitySelectDTO> childs;
	
	private List<EntitySelectDTO> authorities;
	
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
		ModuleDTO other = (ModuleDTO) obj;
		return id.equals(other.id);
	}
	
}

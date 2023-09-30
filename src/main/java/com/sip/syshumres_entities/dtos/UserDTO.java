package com.sip.syshumres_entities.dtos;

import java.io.Serializable;
import java.util.List;
import java.util.Objects;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;

import com.sip.syshumres_entities.dtos.common.EntitySelectDTO;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

/**
 * Clase DTO. Forma para Usuarios
 * 
 * @author Prong
 * @version 2.0
 */
@Getter
@Setter
@NoArgsConstructor
@ToString
public class UserDTO implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = -2770363460467778125L;

	private Long id;
	
	@NotEmpty
	@Size(
		max=64,
	    message = "El nombre debe tener una longitud máxima de {max} caracteres"
	)
    private String firstName;
	
	@NotEmpty
	@Size(
		max=64,
	    message = "El nombre de usuario debe tener una longitud máxima de {max} caracteres"
	)
	private String username;
	
	@NotEmpty
	@Email
	@Size(
		max=64,
	    message = "El email debe tener una longitud máxima de {max} caracteres"
	)
    private String email;
	
	@NotEmpty
	@Size(max=64)
	private String password;
    
    private boolean enabled;
	
	private boolean tokenExpired;
	
	private boolean multiBranchOffice;
	
	private boolean seeAllBranchs;
	
	private EntitySelectDTO branchOffice;
	
	private List<EntitySelectDTO> authorities;

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
		UserDTO other = (UserDTO) obj;
		return id.equals(other.id);
	}
	
}

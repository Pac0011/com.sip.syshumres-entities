package com.sip.syshumres_entities.dtos;

import java.io.Serializable;
import java.util.List;
import java.util.Objects;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;

/**
 * Clase DTO. Forma para Usuarios
 * 
 * @author Prong
 * @version 2.0
 */
public class UserDTO implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = -2770363460467778125L;

	public UserDTO() {
		super();
	}

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

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public boolean isEnabled() {
		return enabled;
	}

	public void setEnabled(boolean enabled) {
		this.enabled = enabled;
	}

	public boolean isTokenExpired() {
		return tokenExpired;
	}

	public void setTokenExpired(boolean tokenExpired) {
		this.tokenExpired = tokenExpired;
	}

	public List<EntitySelectDTO> getAuthorities() {
		return authorities;
	}

	public void setAuthorities(List<EntitySelectDTO> authorities) {
		this.authorities = authorities;
	}

	public boolean isMultiBranchOffice() {
		return multiBranchOffice;
	}

	public void setMultiBranchOffice(boolean multiBranchOffice) {
		this.multiBranchOffice = multiBranchOffice;
	}

	public boolean isSeeAllBranchs() {
		return seeAllBranchs;
	}

	public void setSeeAllBranchs(boolean seeAllBranchs) {
		this.seeAllBranchs = seeAllBranchs;
	}

	public EntitySelectDTO getBranchOffice() {
		return branchOffice;
	}

	public void setBranchOffice(EntitySelectDTO branchOffice) {
		this.branchOffice = branchOffice;
	}

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

	@Override
	public String toString() {
		return "UserDTO [id=" + id + ", firstName=" + firstName + ", username=" + username + ", email=" + email
				+ ", enabled=" + enabled + ", tokenExpired=" + tokenExpired + ", multiBranchOffice=" + multiBranchOffice
				+ ", seeAllBranchs=" + seeAllBranchs + ", branchOffice=" + branchOffice + ", authorities=" + authorities
				+ "]";
	}
	
}

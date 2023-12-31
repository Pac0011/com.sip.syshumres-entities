package com.sip.syshumres_entities;

import java.io.Serializable;
import java.util.List;
import java.util.Objects;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;

/**
 * Clase Entity. Catalogo de usuarios y sus roles
 * 
 * @author Prong
 * @version 2.0
 */
@Entity
@Table(name="users")
@Getter
@Setter
@NoArgsConstructor
@ToString
public class User implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 8225357361686308161L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	//@ApiModelProperty(notes = "firstName of the User", name="firstName", required=true, value="test firstName")
	@NotEmpty
	@Size(
		max=64,
	    message = "El nombre debe tener una longitud máxima de {max} caracteres"
	)
	@Column(name = "first_name")
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
	
	@Column(columnDefinition = "boolean default true")
	private boolean enabled;
	
	@Column(name = "token_expired", columnDefinition = "boolean default false")
	private boolean tokenExpired;
	
	@Column(name = "multi_branch_office", columnDefinition = "boolean default false")
	private boolean multiBranchOffice;
	
	@Column(name = "see_all_branchs", columnDefinition = "boolean default false")
	private boolean seeAllBranchs;
	
    @JoinTable( 
        name = "users_authorities", 
        joinColumns = @JoinColumn(name = "user_id", referencedColumnName = "id", nullable = false), 
        inverseJoinColumns = @JoinColumn(name = "authority_id", referencedColumnName = "id", nullable = false)
    )
    @JsonIgnoreProperties(value = {"users"}, allowSetters = true)
	@ManyToMany(cascade = CascadeType.DETACH)
    private List<Authority> authorities;
    
    @JsonIgnoreProperties(value = {"childs", "handler", "hibernateLazyInitializer"})
	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(name="branch_office_id")
	private BranchOffice branchOffice;
    
    public void addAuthority(Authority authority) {
		this.authorities.add(authority);
	}
	
	public void removeAuthority(Authority authority) {
		this.authorities.remove(authority);
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
		User other = (User) obj;
		return Objects.equals(id, other.id);
	}
	
}

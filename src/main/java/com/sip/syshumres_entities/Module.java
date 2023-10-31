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
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

/**
 * Clase Entity. Catalogo de modulos para agruparlos en los roles
 * 
 * @author Prong
 * @version 2.0
 */
@Entity
@Table(name="modules")
@Getter
@Setter
@NoArgsConstructor
@ToString
public class Module implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 7904429211274335584L;

	public Module(Long id, String description) {
		this.setId(id);
		this.setDescription(description);
	}

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
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
	@Column(name = "url_menu")
	private String urlMenu;
	
	@NotEmpty
	@Size(max=32)
	private String icon;
	
	@JsonIgnoreProperties(value = {"childs", "handler", "hibernateLazyInitializer"})
	@ManyToOne(fetch = FetchType.EAGER)
	private Module father;
	
	@JsonIgnoreProperties(value = {"father", "handler", "hibernateLazyInitializer"}, allowSetters = true)
	@OneToMany(fetch = FetchType.EAGER, mappedBy = "father", cascade = CascadeType.ALL)
	private List<Module> childs;
	
	@JsonIgnoreProperties(value = {"modules", "handler", "hibernateLazyInitializer"})
    @ManyToMany(mappedBy = "modules")
    private List<Authority> authorities;
	
	@Column(columnDefinition = "boolean default true")
	private boolean enabled;
	
	@Override
	public int hashCode() {
		return Objects.hash(this.getId());
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		
		if (!(obj instanceof Module)) {
			return false;
		}
		Module s = (Module) obj;
		
		return this.getId() != null && this.getId().equals(s.getId());
	}
	
}

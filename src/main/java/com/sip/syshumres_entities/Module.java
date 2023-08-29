package com.sip.syshumres_entities;

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

/**
 * Clase Entity. Catalogo de modulos para agruparlos en los roles
 * 
 * @author Prong
 * @version 2.0
 */
@Entity
@Table(name="modules")
public class Module {
	
	public Module() {}

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

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getDetail() {
		return detail;
	}

	public void setDetail(String detail) {
		this.detail = detail;
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public String getUrlMenu() {
		return urlMenu;
	}

	public void setUrlMenu(String urlMenu) {
		this.urlMenu = urlMenu;
	}

	public String getIcon() {
		return icon;
	}

	public void setIcon(String icon) {
		this.icon = icon;
	}

	public Module getFather() {
		return father;
	}

	public void setFather(Module father) {
		this.father = father;
	}

	public List<Module> getChilds() {
		return childs;
	}

	public void setChilds(List<Module> childs) {
		this.childs = childs;
	}
	
	public List<Authority> getAuthorities() {
		return authorities;
	}

	public void setAuthorities(List<Authority> authorities) {
		this.authorities = authorities;
	}

	public boolean isEnabled() {
		return enabled;
	}

	public void setEnabled(boolean enabled) {
		this.enabled = enabled;
	}
	
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

	@Override
	public String toString() {
		return "Module [id=" + id + ", description=" + description + ", detail=" + detail + ", url=" + url
				+ ", enabled=" + enabled + "]";
	}
	
}

package com.sip.syshumres_entities.dtos;

import java.io.Serializable;
import java.util.List;
import java.util.Objects;

/**
 * Clase DTO. Forma para Modulos
 * 
 * @author Prong
 * @version 2.0
 */
public class ModuleDTO implements Serializable {	
	/**
	 * 
	 */
	private static final long serialVersionUID = 173280853296679451L;

	private Long id;
	
	private String description;
	
	private String detail;
	
    private String url;
    
    private String urlMenu;
	
	private String icon;
	
    private EntitySelectDTO father;
	
	private List<EntitySelectDTO> childs;
	
	private List<EntitySelectDTO> authorities;
	
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

	public EntitySelectDTO getFather() {
		return father;
	}

	public void setFather(EntitySelectDTO father) {
		this.father = father;
	}

	public List<EntitySelectDTO> getChilds() {
		return childs;
	}

	public void setChilds(List<EntitySelectDTO> childs) {
		this.childs = childs;
	}

	public List<EntitySelectDTO> getAuthorities() {
		return authorities;
	}

	public void setAuthorities(List<EntitySelectDTO> authorities) {
		this.authorities = authorities;
	}

	public boolean isEnabled() {
		return enabled;
	}

	public void setEnabled(boolean enabled) {
		this.enabled = enabled;
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
		ModuleDTO other = (ModuleDTO) obj;
		return id.equals(other.id);
	}

	@Override
	public String toString() {
		return "ModuleDTO [id=" + id + ", description=" + description + ", detail=" + detail + ", url=" + url
				+ ", enabled=" + enabled + "]";
	}
	
}

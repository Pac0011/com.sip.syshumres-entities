package com.sip.syshumres_entities.dtos;

import java.io.Serializable;
import java.util.List;
import java.util.Objects;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

/**
 * Clase DTO. Menus la frontend de cada modulo agrupados en los roles
 * 
 * @author Prong
 * @version 2.0
 */
@Getter
@Setter
@NoArgsConstructor
@ToString
public class MenuDTO implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = -773124706827703096L;

	//name
    private String n;
    
    //url
    private String u;
    
    //icon
    private String i;
	
    //childs
	private List<MenuDTO> c;

	public MenuDTO(String name, String url, String icon) {
		super();
		this.n = name;
		this.u = url;
		this.i = icon;
	}
	
	public MenuDTO(String name, String url, String icon, List<MenuDTO> childs) {
		super();
		this.n = name;
		this.u = url;
		this.i = icon;
		this.c = childs;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	@Override
	public int hashCode() {
		return Objects.hash(n, u);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		MenuDTO other = (MenuDTO) obj;
		return Objects.equals(n, other.n) && Objects.equals(u, other.u);
	}
	
}

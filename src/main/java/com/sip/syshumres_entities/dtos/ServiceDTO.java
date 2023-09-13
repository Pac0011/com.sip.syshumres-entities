package com.sip.syshumres_entities.dtos;

import java.io.Serializable;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;

import com.sip.syshumres_entities.Client;


public class ServiceDTO implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	public ServiceDTO() {
		super();
	}

	private Long id;
	
	@NotEmpty
	@Size(min=4, max=64)
	private String code;
	
	private Client client;
	
	private boolean enabled;
	
	public String getServiceNumber() {
		return "SRV" + this.id;
    }

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public Client getClient() {
		return client;
	}

	public void setClient(Client client) {
		this.client = client;
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
	
}

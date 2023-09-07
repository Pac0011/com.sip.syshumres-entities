package com.sip.syshumres_entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;


/*
 * Catalogo de servicios para los clientes
 */
@Entity
@Table(name="services")
public class Service {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	/*
	 * Clave operativa
	 */
	@NotEmpty
	@Size(min=4, max=64)
    private String code;
	
	//Este se definio en el DTO
	//@Transient
	//public String getServiceNumber() {
	//	return "SRV" + this.id;
    //}
    
    @ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name="client_id")
    private Client client;
	
    @Column(columnDefinition = "boolean default true")
	private boolean enabled;

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

	public boolean isEnabled() {
		return enabled;
	}

	public void setEnabled(boolean enabled) {
		this.enabled = enabled;
	}

	public Client getClient() {
		return client;
	}

	public void setClient(Client client) {
		this.client = client;
	}
	

}

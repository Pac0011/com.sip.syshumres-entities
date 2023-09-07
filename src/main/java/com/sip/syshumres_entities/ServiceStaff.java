package com.sip.syshumres_entities;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;


/*
 * Numero de elementos por servicio
 */
@Entity
@Table(name="service_staff")
public class ServiceStaff {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name="service_id")
	private Service service;
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name="invoiced_resource_id")
	private InvoicedResourceType invoicedResourceType;
	
	private int numberElements;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Service getService() {
		return service;
	}

	public void setService(Service service) {
		this.service = service;
	}

	public InvoicedResourceType getInvoicedResourceType() {
		return invoicedResourceType;
	}

	public void setInvoicedResourceType(InvoicedResourceType invoicedResourceType) {
		this.invoicedResourceType = invoicedResourceType;
	}

	public int getNumberElements() {
		return numberElements;
	}

	public void setNumberElements(int numberElements) {
		this.numberElements = numberElements;
	}

}

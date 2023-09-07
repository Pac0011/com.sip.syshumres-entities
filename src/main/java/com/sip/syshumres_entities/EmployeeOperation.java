package com.sip.syshumres_entities;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.sip.syshumres_entities.common.BaseEntityLog;


/*
 * Informacion operativa del empleado
 */
@Entity
@Table(name="employee_operations")
public class EmployeeOperation extends BaseEntityLog {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name="service_id")
	private Service service;
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name= "invoiced_resource_type_id")
	private InvoicedResourceType invoicedResourceType;

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
	
	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		
		if (!(obj instanceof EmployeeOperation)) {
			return false;
		}
		EmployeeOperation s = (EmployeeOperation) obj;
		
		return this.id != null && this.id.equals(s.getId());
	}

}

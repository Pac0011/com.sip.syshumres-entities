package com.sip.syshumres_entities;

import java.util.Objects;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;


/*
 * Numero de elementos por servicio
 */
@Entity
@Table(name="service_staff")
@Getter
@Setter
@NoArgsConstructor
@ToString
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
	
	@Override
	public int hashCode() {
		return Objects.hash(this.getId());
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		
		if (!(obj instanceof ServiceStaff)) {
			return false;
		}
		ServiceStaff s = (ServiceStaff) obj;
		
		return this.getId() != null && this.getId().equals(s.getId());
	}

}

package com.sip.syshumres_entities.dtos;

import java.io.Serializable;
import java.util.Objects;


public class EmployeePositionProfileDTO implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = -2247674233450164213L;

	private Long id;
	
	private String description;
	
	private boolean payroll;
	
	private boolean hasStaff;
	
	private EntitySelectDTO typeStaff;
	
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

	public boolean isPayroll() {
		return payroll;
	}

	public void setPayroll(boolean payroll) {
		this.payroll = payroll;
	}

	public boolean isHasStaff() {
		return hasStaff;
	}

	public void setHasStaff(boolean hasStaff) {
		this.hasStaff = hasStaff;
	}

	public EntitySelectDTO getTypeStaff() {
		return typeStaff;
	}

	public void setTypeStaff(EntitySelectDTO typeStaff) {
		this.typeStaff = typeStaff;
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
		EmployeePositionProfileDTO other = (EmployeePositionProfileDTO) obj;
		return id.equals(other.id);
	}

	@Override
	public String toString() {
		return "EmployeePositionProfileDTO [id=" + id + ", description=" + description + ", payroll=" + payroll
				+ ", hasStaff=" + hasStaff + ", typeStaff=" + typeStaff + ", enabled=" + enabled + "]";
	}
	
}

package com.sip.syshumres_entities.enums;

public enum EmployeeStatusEnum {
	CONTRATADO(1), BAJA(2);
	private final long id;
	
	private EmployeeStatusEnum(long id) { 
		this.id = id;
	}
	
    public long getValue() {
    	return id;
    }
}

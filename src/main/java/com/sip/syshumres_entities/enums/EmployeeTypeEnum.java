package com.sip.syshumres_entities.enums;

public enum EmployeeTypeEnum {
	ADM(1), OPER(2), EXT(3);
	private final long id;
	
	private EmployeeTypeEnum(long id) { 
		this.id = id;
	}
	
    public long getValue() {
    	return id;
    }
}

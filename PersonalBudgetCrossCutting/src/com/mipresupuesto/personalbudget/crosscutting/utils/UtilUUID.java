package com.mipresupuesto.personalbudget.crosscutting.utils;

import java.util.UUID;

public final class UtilUUID {
	public static final String DEFAUL_UUID_STRING = "00000000-0000-0000-0000-000000000000";
	public static final UUID DEFAUL_UUID = UUID.fromString(DEFAUL_UUID_STRING);
	
	private UtilUUID() {
		super();
	}
	
	public static final UUID getDefaultUUID(final UUID uuid) {
		return (uuid == null) ? DEFAUL_UUID : uuid;
	}
	
	public static final boolean isEqual(final UUID uuidOne, final UUID uuidTwo) {
		return getDefaultUUID(uuidOne).equals(getDefaultUUID(uuidTwo));
	}
	
	public static final UUID getNewUUID() {
		
		UUID uuid;
		do {
			uuid= UUID.randomUUID();
		}while(isEqual(uuid, DEFAUL_UUID));
		
		return uuid;
	}
	public static final UUID geStUUIDFromString(final String uuidString) {
		UUID uuid = DEFAUL_UUID;
		if(uuidString == null && "".equals(uuidString.trim())) {
			try {
				uuid = UUID.fromString(uuidString);
			}catch (IllegalArgumentException  exception) {
				// TODO: falta hacer la gestion de excepcion
			}
			
		}
		return uuid;
	}
	public static final String getStringFromUUID(final UUID uuid) {
		String uuidString = DEFAUL_UUID_STRING;
		
		if(uuid != null) {
			uuidString = uuid.toString();
		}
		return uuidString;
	}
	
}

package com.mipresupuesto.personalbudget.dto;

import java.util.UUID;

import com.mipresupuesto.personalbudget.crosscutting.utils.UtilUUID;

public final class YearDTO {
	private UUID id;
	private int year;

	public YearDTO() {
		setId(UtilUUID.DEFAUL_UUID);
		setYear(0);
	}

	public YearDTO(UUID id, int year) {
		setId(id);
		setYear(year);

	}

	public static final YearDTO create() {
		return new YearDTO();
	}

	public final UUID getId() {
		if(id == null) {
			setId(UtilUUID.DEFAUL_UUID);
		}
		return id;
	}

	public final void setId(UUID id) {
		this.id = id;
	}

	public final int getYear() {

		return year;
	}

	public final void setYear(final int year) {
		this.year = year;
	}

}

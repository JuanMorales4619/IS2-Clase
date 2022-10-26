package com.mipresupuesto.personalbudget.domain.builder;

import java.util.UUID;

import com.mipresupuesto.personalbudget.crosscutting.util.numeric.UtilNumeric;
import com.mipresupuesto.personalbudget.crosscutting.utils.UtilUUID;
import com.mipresupuesto.personalbudget.domain.YearDomain;

public class YearDomainBuilder {

	private UUID id;
	private int year;
	
	private YearDomainBuilder() {
		setId(UUID.randomUUID());
		setYear(0);
	}
	public static final YearDomainBuilder get() {
		return new YearDomainBuilder();
	}
	
	public final YearDomainBuilder setId(UUID id) {
		this.id = UtilUUID.getDefault(id);
		return this;
	}

	public final YearDomainBuilder setYear(int year) {
		this.year = UtilNumeric.getUtilObject().getDefault(year, 0);
		return this;
	}
	
    
	public YearDomain build() {
		return YearDomain.create(id, year);
	}
	
	
}

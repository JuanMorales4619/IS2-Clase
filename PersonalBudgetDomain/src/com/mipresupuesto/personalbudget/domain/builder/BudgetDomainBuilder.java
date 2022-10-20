package com.mipresupuesto.personalbudget.domain.builder;

import java.util.UUID;

import com.mipresupuesto.personalbudget.crosscutting.utils.UtilUUID;
import com.mipresupuesto.personalbudget.domain.BudgetDomain;
import com.mipresupuesto.personalbudget.domain.PersonDomain;
import com.mipresupuesto.personalbudget.domain.YearDomain;

public class BudgetDomainBuilder {
	private UUID id;
	private YearDomain year;
	private PersonDomain person;
	
	private BudgetDomainBuilder() {
		setYear(year);
		setPerson(person);
	}
	public static final BudgetDomainBuilder get() {
		return new BudgetDomainBuilder();
	}
	public final BudgetDomainBuilder setId(UUID id) {
		this.id = (id == null) ? UtilUUID.DEFAUL_UUID : id;
		return this;
	}
	
	public final BudgetDomainBuilder setYear(YearDomain year) {
		this.year = year;
		return this;
	}
	public final BudgetDomainBuilder setPerson(PersonDomain person) {
		this.person = person;
		return this;
	}
	public BudgetDomain build() {
		return BudgetDomain.create(id,year, person);
	}
	
}

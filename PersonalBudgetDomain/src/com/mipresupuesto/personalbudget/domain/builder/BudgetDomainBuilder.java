package com.mipresupuesto.personalbudget.domain.builder;

import java.util.UUID;


import com.mipresupuesto.personalbudget.crosscutting.util.object.UtilObject;
import com.mipresupuesto.personalbudget.crosscutting.utils.UtilUUID;
import com.mipresupuesto.personalbudget.domain.BudgetDomain;
import com.mipresupuesto.personalbudget.domain.PersonDomain;
import com.mipresupuesto.personalbudget.domain.YearDomain;

public class BudgetDomainBuilder {
	private UUID id;
	private YearDomain year;
	private PersonDomain person;
	
	private BudgetDomainBuilder() {
		setId(UUID.randomUUID());
		setYear(year);
		setPerson(person);
	}
	public static final BudgetDomainBuilder get() {
		return new BudgetDomainBuilder();
	}
	public final BudgetDomainBuilder setId(UUID id) {
		this.id = UtilUUID.getDefault(id);
		return this;
	}
	
	public final BudgetDomainBuilder setYear(YearDomain year) {
		this.year = UtilObject.getUtilObject().getDefault(year, null);
		return this;
	}
	public final BudgetDomainBuilder setPerson(PersonDomain person) {
		this.person = UtilObject.getUtilObject().getDefault(person,null);
		return this;
	}
	public BudgetDomain build() {
		return BudgetDomain.create(id,year, person);
	}
	
	
}

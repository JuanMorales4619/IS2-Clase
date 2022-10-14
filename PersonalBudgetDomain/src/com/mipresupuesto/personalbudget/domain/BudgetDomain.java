package com.mipresupuesto.personalbudget.domain;

import java.util.UUID;

public class BudgetDomain {
	private final UUID id;
	private final YearDomain year;
	private final PersonDomain person;

	private BudgetDomain(UUID id,YearDomain year, PersonDomain person) {
		this.id = id;
		this.year = year;
		this.person = person;
	}

	public static BudgetDomain create(UUID id,YearDomain year, PersonDomain person) {
		return new BudgetDomain(id,year, person);
	}

	public final YearDomain getYear() {
		return year;
	}

	public final PersonDomain getPerson() {
		return person;
	}

	public final UUID getId() {
		return id;
	}
	
}

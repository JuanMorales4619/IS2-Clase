package com.mipresupuesto.personalbudget.entity;

import java.util.UUID;

public final class BudgetEntity {
	
	private UUID id;
	private YearEntity year;
	private PersonEntity person;

	public BudgetEntity(YearEntity year, PersonEntity person) {
		setYear(year);
		setPerson(person);
	}
	public BudgetEntity() {
		setYear(new YearEntity());
		setPerson(new PersonEntity());
	}

	public final YearEntity getYear() {
		return year;
	}

	public final void setYear(YearEntity year) {
		this.year = year;
	}

	public final PersonEntity getPerson() {
		return person;
	}

	public final void setPerson(PersonEntity person) {
		this.person = person;
	}
	public final UUID getId() {
		
		return id;
	}
	public final void setId(final UUID id) {
		this.id = id;
	}
	
}

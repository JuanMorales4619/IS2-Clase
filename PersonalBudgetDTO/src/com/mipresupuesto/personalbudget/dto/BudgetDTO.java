package com.mipresupuesto.personalbudget.dto;

import java.util.UUID;

import com.mipresupuesto.personalbudget.crosscutting.utils.UtilUUID;

public final class BudgetDTO {
	private UUID id;
	private YearDTO year;
	private PersonDTO person;

	public BudgetDTO( YearDTO year, PersonDTO person) {
		setId(UtilUUID.DEFAUL_UUID);
		setYear(year);
		setPerson(person);
	}
	public BudgetDTO() {
		setId(UtilUUID.DEFAUL_UUID);
		setYear(YearDTO.create());
		setPerson(PersonDTO.create());
	}

	public final YearDTO getYear() {
		if(year == null) {
			setYear(YearDTO.create());
		}
		return year;
	}

	public final void setYear(YearDTO year) {
		this.year = year;
	}

	public final PersonDTO getPerson() {
		if(person == null) {
			setPerson(PersonDTO.create());
		}
		return person;
	}

	public final void setPerson(PersonDTO person) {
		this.person = person;
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

}

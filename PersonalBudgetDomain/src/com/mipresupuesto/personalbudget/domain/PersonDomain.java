package com.mipresupuesto.personalbudget.domain;

import java.util.UUID;

public class PersonDomain {
	private UUID id;
	private String idCard;
	private String firstName;
	private String middleName;
	private String lastName;
	
	private PersonDomain(UUID id,String idCard,String firstName,String middleName,String lastName) {
		this.id=id;
		this.idCard=idCard;
		this.firstName=firstName;
		this.middleName=middleName;
		this.lastName=lastName;
		
	}
	public static PersonDomain create(UUID id,String idCard,String firstName,String middleName,String lastName) {
		return new PersonDomain(id, idCard, firstName, middleName, lastName);
	}

	public final UUID getId() {
		return id;
	}

	public final String getIdCard() {
		return idCard;
	}

	public final String getFirstName() {
		return firstName;
	}

	public final String getMiddleName() {
		return middleName;
	}

	public final String getLastName() {
		return lastName;
	}
	
	
}

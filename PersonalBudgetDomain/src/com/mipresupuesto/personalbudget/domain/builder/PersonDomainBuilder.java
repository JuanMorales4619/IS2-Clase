package com.mipresupuesto.personalbudget.domain.builder;

import java.util.UUID;

import com.mipresupuesto.personalbudget.crosscutting.util.text.UtilText;
import com.mipresupuesto.personalbudget.crosscutting.utils.UtilUUID;
import com.mipresupuesto.personalbudget.domain.PersonDomain;

public class PersonDomainBuilder {
	
	private UUID id;
	private String idCard;
	private String firstName;
	private String middleName;
	private String lastName;
	
	private PersonDomainBuilder() {
		setId(UUID.randomUUID());
		setIdCard("");
		setFirstName("");
		setMiddleName("");
		setLastName("");
	}

	public static final PersonDomainBuilder get(){
		return new PersonDomainBuilder();
	}
	
	public final PersonDomainBuilder setId(UUID id) {
		this.id = UtilUUID.getDefault(id);
		return this;
	}

	public final PersonDomainBuilder setFirstName(String firstNSame) {
		this.firstName = UtilText.getDefault(firstNSame);
		return this;
	}
	
	public final PersonDomainBuilder setMiddleName(String middleName) {
		this.middleName = UtilText.getDefault(middleName);
		return this;
	}
	public final PersonDomainBuilder setLastName(String lastName) {
		this.lastName = UtilText.getDefault(lastName);
		return this;
	}
	
	public final PersonDomainBuilder setIdCard(String idCard) {
		this.idCard = UtilText.getDefault(idCard);
		return this;
	}
	

  public PersonDomain build() {
		return PersonDomain.create(id,idCard,firstName,middleName,lastName);
	}

	
	
}

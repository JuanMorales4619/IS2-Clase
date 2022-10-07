package com.mipresupuesto.personalbudget.domain.builder;

import com.mipresupuesto.personalbudget.domain.PersonDomain;

public class PersonDomainBuilder {
	
	private String id;
	private String idCard;
	private String firstName;
	private String middleName;
	private String lastName;
	
	private PersonDomainBuilder() {
		setId("");
		setIdCard("");
	}

	public static final PersonDomainBuilder get(){
		return new PersonDomainBuilder();
	}
	
	public final PersonDomainBuilder setId(String id) {
		this.id = (id==null) ? "":id.trim();
		return this;
	}

	public final PersonDomainBuilder setFirstName(String firstNSame) {
		this.firstName = (firstName==null) ? "":firstName.trim();
		return this;
	}
	
	public final PersonDomainBuilder setMiddleName(String middleName) {
		this.middleName = (middleName==null) ? "":middleName.trim();
		return this;
	}
	public final PersonDomainBuilder setLastName(String lastName) {
		this.lastName = (lastName==null) ? "":lastName.trim();
		return this;
	}
	
	public final PersonDomainBuilder setIdCard(String idCard) {
		this.idCard = (idCard==null) ? "":idCard.trim();
		return this;
	}
	

  public PersonDomain build() {
		return PersonDomain.create(id,idCard,firstName,middleName,lastName);
	}

	
	
}

package com.mipresupuesto.personalbudget.dto;

public final class PersonDTO {
	private String id;
	private String idCard;
	private String firstName;
	private String middleName;
	private String lastName;
	private String firstSurname;
	private String secondSurname;
	private String name;
	private String completeName;

	public PersonDTO() {
		setId("");
		setFirstName("");
		setIdCard("");
		setMiddleName("");
		setFirstSurname("");
		setSecondSurname("");
		setName("");
		setLastName("");
		
	}

	public PersonDTO(String id, String idCard, String firstName, String middleName, 
			String fisrstSurname, String secondSurname, String name, String lastName) {
		setId(id);
		setFirstName(firstName);
		setIdCard(idCard);
		setMiddleName(middleName);
		setFirstSurname(fisrstSurname);
		setSecondSurname(secondSurname);
		setName(name);
		setLastName(lastName);
	}
	
	public static final PersonDTO create() {
		return new PersonDTO();
	}
	
	public final String getId() {
		return id;
	}

	public final void setId(String id) {
		this.id = id;
	}

	public final String getIdCard() {
		return idCard;
	}

	public final void setIdCard(String idCard) {
		this.idCard = idCard;
	}

	public final String getFirstName() {
		return firstName;
	}

	public final void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public final String getMiddleName() {
		return middleName;
	}

	public final void setMiddleName(String middleName) {
		this.middleName = middleName;
	}

	public final String getLastName() {
		return lastName;
	}

	public final void setLastName(String lastName) {
		this.lastName = lastName;
	}
	
	public final String getFirstSurname() {
		return firstSurname;
	}

	public final void setFirstSurname(String firstSurname) {
		this.firstSurname = firstSurname;
	}

	public final String getSecondSurname() {
		return secondSurname;
	}

	public final void setSecondSurname(String secondSurname) {
		this.secondSurname = secondSurname;
	}
	

	public final void setName(String name) {
		this.name = name;
	}

	public final void setCompleteName(String completeName) {
		this.completeName = completeName;
	}

	public final String getName() {
		return (getFirstName()+ " "+getMiddleName()).trim();
	}
	

	public final String getCompleteName() {
		return getName()+ " "+getLastName();
	}

}

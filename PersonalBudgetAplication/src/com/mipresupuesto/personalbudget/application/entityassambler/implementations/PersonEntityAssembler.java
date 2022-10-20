package com.mipresupuesto.personalbudget.application.entityassambler.implementations;

import com.mipresupuesto.personalbudget.application.entityassambler.EntityAssambler;
import com.mipresupuesto.personalbudget.crosscutting.util.object.UtilObject;
import com.mipresupuesto.personalbudget.domain.PersonDomain;
import com.mipresupuesto.personalbudget.domain.builder.PersonDomainBuilder;
import com.mipresupuesto.personalbudget.entity.PersonEntity;

public class PersonEntityAssembler implements EntityAssambler<PersonEntity, PersonDomain> {

	@Override
	public PersonEntity assemblerDomain(PersonDomain domain) {
		PersonEntity entity = new PersonEntity();

		if (domain != null) {
			entity = new PersonEntity(domain.getId(), domain.getFirstName(), domain.getIdCard(), domain.getMiddleName(),
					domain.getFirstSurname(), domain.getSecondSurname(), domain.getName(), domain.getLastName(),
					domain.getCompleteName());

		}
		return entity;
	}

	@Override
	public PersonDomain assemblerEntity(PersonEntity entity) {
		PersonDomain domain = PersonDomainBuilder.get().build();

		if (UtilObject.getUtilObject().isNull(domain)) {
			domain = PersonDomainBuilder.get().setId(entity.getId()).setLastName(entity.getIdCard())
					.setFirstName(entity.getFirstName()).setLastName(entity.getLastName()).setMiddleName(entity.getMiddleName())
					.build();
		}
		return domain;
	}

}

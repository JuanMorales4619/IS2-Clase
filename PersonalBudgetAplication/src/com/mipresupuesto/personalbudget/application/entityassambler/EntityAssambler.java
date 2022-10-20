package com.mipresupuesto.personalbudget.application.entityassambler;

public interface EntityAssambler <E,D> {
	E assemblerDomain(D domain);
	D assemblerEntity(E entity);
}

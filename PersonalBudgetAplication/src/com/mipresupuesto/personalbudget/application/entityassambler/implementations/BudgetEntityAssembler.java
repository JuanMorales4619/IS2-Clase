package com.mipresupuesto.personalbudget.application.entityassambler.implementations;

import org.springframework.stereotype.Component;

import com.mipresupuesto.personalbudget.application.entityassambler.EntityAssambler;
import com.mipresupuesto.personalbudget.domain.BudgetDomain;
import com.mipresupuesto.personalbudget.domain.builder.BudgetDomainBuilder;
import com.mipresupuesto.personalbudget.dto.BudgetDTO;
import com.mipresupuesto.personalbudget.entity.BudgetEntity;

@Component
public class BudgetEntityAssembler implements EntityAssambler<BudgetEntity, BudgetDomain> {

	@Override
	public BudgetEntity assemblerDomain(BudgetDomain domain) {
		BudgetEntity entity = new BudgetEntity();
		if(domain != null) {
			entity = new BudgetEntity(/*domain.getPerson(),domain.getYear()*/);
		}
		return entity;
	}

	@Override
	public BudgetDomain assemblerEntity(BudgetEntity entity) {
		BudgetDomain domain = BudgetDomainBuilder.get().build();
		if (entity != null) {
			domain = BudgetDomainBuilder.get()
					.setId(entity.getId())
					/*.setPerson(entity.getPerson())
					.setYear(entity.getYear())*/
					.build();
		}
		return domain;
	}

}

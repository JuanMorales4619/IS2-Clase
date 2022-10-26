package com.mipresupuesto.personalbudget.application.entityassambler.implementations;

import org.springframework.stereotype.Component;

import com.mipresupuesto.personalbudget.application.entityassambler.EntityAssambler;
import com.mipresupuesto.personalbudget.domain.BudgetDomain;
import com.mipresupuesto.personalbudget.entity.BudgetEntity;

@Component
public class BudgetEntityAssembler implements EntityAssambler<BudgetEntity, BudgetDomain> {

	@Override
	public BudgetEntity assemblerDomain(BudgetDomain domain) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public BudgetDomain assemblerEntity(BudgetEntity entity) {
		// TODO Auto-generated method stub
		return null;
	}

}

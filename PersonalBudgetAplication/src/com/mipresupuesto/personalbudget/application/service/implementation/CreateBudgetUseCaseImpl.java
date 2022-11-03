package com.mipresupuesto.personalbudget.application.service.implementation;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mipresupuesto.personalbudget.application.entityassambler.EntityAssambler;
import com.mipresupuesto.personalbudget.application.service.interfaces.CreateBudgetUseCase;
import com.mipresupuesto.personalbudget.crosscutting.exception.personalbudgetexception.PersonalBudgetException;
import com.mipresupuesto.personalbudget.domain.BudgetDomain;
import com.mipresupuesto.personalbudget.entity.BudgetEntity;
import com.mipresupuesto.personalbudget.infrastructure.data.interfaces.BudgetRepository;

@Service
@Transactional
public class CreateBudgetUseCaseImpl implements CreateBudgetUseCase {

	@Autowired
	private EntityAssambler<BudgetEntity, BudgetDomain> entityAssembler;

	@Autowired
	private BudgetRepository budgetRepository;

	@Override
	public void execute(final BudgetDomain budget) {
		try {
			budgetRepository.save(entityAssembler.assemblerDomain(budget));
		}	
		catch(PersonalBudgetException exception) {
			throw exception;
		}catch (Exception exception) {
			throw PersonalBudgetException.buildTBusinessLogicExeption(
					"There was a problen trying to validate the budget data integrity");
		}
	}

}
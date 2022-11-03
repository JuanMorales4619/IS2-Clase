package com.mipresupuesto.personalbudget.specification.logiccomponent;

import com.mipresupuesto.personalbudget.specification.Specification;
import com.mipresupuesto.personalbudget.specification.implementation.SpecificationImpl;

public class AndNotSpecification extends SpecificationImpl{

	private Specification leftCondition;
	private Specification rightCondition;
	
	public AndNotSpecification(Specification left, Specification right) {
		this.leftCondition = left;
		this.rightCondition = right;
	}
	
	public boolean isSatisfiedBy(Object candidate) {
		return leftCondition.isSatisfiedBy(candidate) && !rightCondition.isSatisfiedBy(candidate);
	}


}

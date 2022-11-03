package com.mipresupuesto.personalbudget.specification.logiccomponent;

import com.mipresupuesto.personalbudget.specification.Specification;
import com.mipresupuesto.personalbudget.specification.implementation.SpecificationImpl;

public class NotSpecification extends SpecificationImpl {
	private Specification mapped;
	public NotSpecification(Specification k) {
		mapped = k;
	}
	
	public boolean isSatisfiedBy(Object candidate) {
		return !mapped.isSatisfiedBy(candidate);
	}
}

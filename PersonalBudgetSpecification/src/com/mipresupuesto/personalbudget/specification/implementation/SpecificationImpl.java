package com.mipresupuesto.personalbudget.specification.implementation;


import com.mipresupuesto.personalbudget.specification.Specification;
import com.mipresupuesto.personalbudget.specification.logiccomponent.AndNotSpecification;
import com.mipresupuesto.personalbudget.specification.logiccomponent.AndSpecification;
import com.mipresupuesto.personalbudget.specification.logiccomponent.NotSpecification;
import com.mipresupuesto.personalbudget.specification.logiccomponent.OrNotSpecification;
import com.mipresupuesto.personalbudget.specification.logiccomponent.OrSpecification;


public abstract class SpecificationImpl implements Specification {

	public abstract boolean isSatisfiedBy(Object candidate);
	
	public Specification and(Specification other) {
		return new AndSpecification(this, other);
	}
	
	public Specification andNot(Specification other) {
		return new AndNotSpecification(this, other);
	}
	
	public Specification or(Specification other) {
		return new OrSpecification(this, other);
	}
	
	public Specification orNot(Specification other) {
		return new OrNotSpecification(this, other);
	}
	
	public Specification not() {
		return new NotSpecification(this);
	}
}

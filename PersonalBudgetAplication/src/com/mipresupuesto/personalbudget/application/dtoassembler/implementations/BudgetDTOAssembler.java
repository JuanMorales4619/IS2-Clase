package com.mipresupuesto.personalbudget.application.dtoassembler.implementations;

import org.springframework.stereotype.Component;

import com.mipresupuesto.personalbudget.application.dtoassembler.DTOAssembler;
import com.mipresupuesto.personalbudget.domain.BudgetDomain;
import com.mipresupuesto.personalbudget.domain.builder.BudgetDomainBuilder;
import com.mipresupuesto.personalbudget.dto.BudgetDTO;


@Component
public class BudgetDTOAssembler implements DTOAssembler<BudgetDTO, BudgetDomain>{

	@Override
	public BudgetDomain assembleDomain(BudgetDTO dto) {
		BudgetDomain domain = BudgetDomainBuilder.get().build();
		
		if(dto != null) {
			domain = BudgetDomainBuilder.get()
											.setId(dto.getId())
											/*.setYear(dto.getYear())
											.setPerson(dto.getPerson())*/
											.build();
		}
		return domain;
	}

	@Override
	public BudgetDTO assembleDTO(BudgetDomain domain) {
		BudgetDTO dto = new BudgetDTO();
		
		if(domain != null) {
			dto = new BudgetDTO(/*domain.getPerson(),domain.getYear()*/);
			
		}
		return dto;
	}

}

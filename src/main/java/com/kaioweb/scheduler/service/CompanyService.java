package com.kaioweb.scheduler.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.kaioweb.scheduler.domain.Company;

@Service
public class CompanyService {

	public List<Company> listAll(){
		return List.of(new Company(1L, "Cabelereiro 1"), new Company(2L, "Dentista 1"));
		
	}
}

package com.kaioweb.scheduler.repository;

import java.util.List;

import com.kaioweb.scheduler.domain.Company;

public interface CompanyRepository {
	List<Company> listAll();
}

package com.kaioweb.scheduler.controller;

import java.time.LocalDateTime;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.kaioweb.scheduler.domain.Company;
import com.kaioweb.scheduler.util.DateUtil;

import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;

@RestController
@RequestMapping("api")
@Log4j2
@RequiredArgsConstructor
public class CompanyController {
	private final DateUtil dateUtil;
	
	@GetMapping(path = "list")
	public List<Company> list(){
		log.info("data "+dateUtil.formatLocalDateTimeToDatabaseStyle(LocalDateTime.now()));
		return List.of(new Company("Cabelereiro 1"), new Company("Dentista 1"));
		
	}

}

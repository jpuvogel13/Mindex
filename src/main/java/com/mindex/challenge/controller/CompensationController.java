package com.mindex.challenge.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.mindex.challenge.data.Compensation;
import com.mindex.challenge.service.CompensationService;
@RestController
public class CompensationController {
	private static final Logger LOG = LoggerFactory.getLogger(EmployeeController.class);

    @Autowired
    private CompensationService compensationService;
    
    @PostMapping("/employee/compensation")
    public Compensation createCompensation(@RequestBody Compensation compensation) {
    	LOG.debug("Received request to create compensation [{}]", compensation);
    	return compensationService.createCompensation(compensation);
    }
    
    @GetMapping("/employee/compensation/{id}")
    public Compensation getCompensationById(@PathVariable String id) {
    	LOG.debug("Received request to retrieve employee [{}] compensation", id);
    	return compensationService.getCompensationById(id);
    }
    
}

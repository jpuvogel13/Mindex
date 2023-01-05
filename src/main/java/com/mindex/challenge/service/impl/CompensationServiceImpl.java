package com.mindex.challenge.service.impl;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mindex.challenge.dao.CompensationRepository;
import com.mindex.challenge.data.Compensation;
import com.mindex.challenge.service.CompensationService;

@Service
public class CompensationServiceImpl implements CompensationService {
    private static final Logger LOG = LoggerFactory.getLogger(CompensationServiceImpl.class);
    
    @Autowired
    private CompensationRepository compensationRepository;

	@Override
	public Compensation createCompensation(Compensation comp) {
        LOG.debug("Creating new compensation", comp);
		return compensationRepository.save(comp);
	}

	@Override
	public Compensation getCompensationById(String emplId) {
		 LOG.debug("Retrieving employee [{}] compensation", emplId);
		return compensationRepository.findCompensationByEmplId(emplId);
	}
	

}

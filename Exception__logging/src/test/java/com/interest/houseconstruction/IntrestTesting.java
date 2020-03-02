package com.interest.houseconstruction;

import static org.junit.Assert.*;

import org.junit.Test;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import com.interest.houseconstruction.CompoundInterest;
import com.interest.houseconstruction.SimpleInterest;


import org.junit.Test;

public class IntrestTesting {

	@Test
	public void test() {
		SimpleInterest si=new SimpleInterest();
		final Logger logger=LogManager.getLogger(IntrestTesting.class);
		assertEquals(16000.00,si.totalamount(1000.00,5,3,1),2);
		logger.info("Simple interest is calculated");
		logger.debug(si.totalamount(1000.00,5,3,1));
		logger.warn("No warnings in Simple interest and calculated");
		logger.error("No errors in Simple interest and calculated");
		
		CompoundInterest ci=new CompoundInterest();
		
		assertEquals(4125025.03,ci.totalamount(5000.00,3,3,4),2);
		logger.info("Compound interest is calculated");
		logger.debug(ci.totalamount(5000.00,3,3,4));
		logger.warn("No warnings in Compound interest and calculated");
		logger.error("No errors in Compound interest and calculated");
	}
}
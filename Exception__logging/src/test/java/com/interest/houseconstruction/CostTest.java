package com.interest.houseconstruction;

import static org.junit.Assert.*;

import org.junit.Test;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.interest.houseconstruction.CreateBill;

public class CostTest {

	@Test
	public void test() {
		final Logger logger=LogManager.getLogger(IntrestTesting.class);
			CreateBill k= new CreateBill();
			assertEquals(240000.00,k.Cost("standard", 200),0);
			logger.info("House construction with Standard material is calculated");
			logger.debug(k.Cost("standard",200));
			logger.warn("No warnings in calculating the standard matrial house construction cost");
			logger.error("No errors in calculating the standard matrial house construction cost");

			assertEquals(600000.00,k.Cost("Above standard", 400),0);
			logger.info("House construction with Above Standard material is calculated");
			logger.debug(k.Cost("Above standard",400));
			logger.warn("No warnings in calculating the Above standard matrial house construction cost");
			logger.error("No errors in calculating the Above standard matrial house construction cost");
		assertEquals(540000.00,k.Cost("High Standard", 300),0);
		logger.info("House construction with Highstandard material is calculated");
		logger.debug(k.Cost("High Standard",300));
		logger.warn("No warnings in calculating the Highstandard matrial house construction cost");
		logger.error("No errors in calculating Highstandard matrial house construction cost");

		assertEquals(2500000.00,k.Cost("High Standard and Automated", 1000),0);
		logger.info("House construction with Highstandard Fullautomatic material is calculated");
		logger.debug(k.Cost("High Standard and Automated",1000));
		logger.warn("No warnings in calculating the Highstandard Fullautomatic matrial house construction cost");
		logger.error("No errors in calculating Highstandard Fullautomatic matrial house construction cost");
		

	}
	}
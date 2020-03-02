package com.interest.houseconstruction;


	public class SimpleInterest extends Calculate{
		double totalamount(double principal,double rateofintrest,double time,int count)
		{
			double amount;
			amount= principal*(1+rateofintrest*time);
			return amount;
		}
	}

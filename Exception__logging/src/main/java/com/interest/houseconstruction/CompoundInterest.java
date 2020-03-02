package com.interest.houseconstruction;

public class CompoundInterest extends Calculate {
	double totalamount(double principal,double rateofintrest,double time,int count)
	{
		double amount;
		amount= principal*(Math.pow((1+rateofintrest/count),(count*time)));
		return amount;
	}
}

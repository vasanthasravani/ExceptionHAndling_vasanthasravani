package com.interest.houseconstruction;

public class CreateBill {
	public double Cost(String name,double Sqrfoot)

  	{

    	  GetPlan p = new GetPlan(); 

    	  Cost c = p.plantype(name);  

  		c.getRate();

  		double d=c.calculateBill(Sqrfoot);

  		return d;

  	}
}

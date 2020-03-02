package com.interest.houseconstruction;

public class GetPlan {
	public Cost plantype(String plan_type){  
        
        if(plan_type.equalsIgnoreCase("Standard")) {  
            return new Standard();
        }
            else if(plan_type.equalsIgnoreCase("Above Standard")) {  
             return new AboveStandard();  
           }   
       else if(plan_type.equalsIgnoreCase("High Standard")){  
            return new HighStandard();  
        }   
      else if(plan_type.equalsIgnoreCase("High Standard and Automated")) {  
            return new AutomatedAndHighStandard();  
      }  
  return null;  
}  
}

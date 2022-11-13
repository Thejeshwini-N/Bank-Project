package com.bankCaseStudy;
public class MMCurrentAcc extends CurrentAcc {

	public MMCurrentAcc(){//(int accNo, String accNm, float accBal, Float creditLimit)
		super();
		//(accNo, accNm, accBal, creditLimit)
		}
		    //@overridden
		    public void withdraw(float amt) {
		     
		      
		    	super.withdraw(amt);
		    
		        
		       }
			@Override
			public String toString() {
				return  getAccNo() + " " + getAccNm() + " " +getAccBal();
			}
		      
		      
		

	}
	
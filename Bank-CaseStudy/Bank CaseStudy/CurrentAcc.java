package com.bankCaseStudy;
public abstract class CurrentAcc extends BankAccount {
  
	 private  final float creditLimit=10000.0f;
	    public CurrentAcc() {//(float creditLimit){//(int accNo,String accNm,float accBal,Float creditLimit ) {
	    	 super();//(accNo,accNm,accBal);
	        //this.creditLimit = creditLimit;
	    
	    }
   //@override
	   public void withdraw(float amt) {
		   System.out.println(getAccBal());
		   try {
	    if(getAccBal()-amt>creditLimit){
	    	setAccBal(getAccBal()-amt);
	   
	 
	  
	       System.out.println(" withdrawal is successfull...."); 
	       System.out.println("-------------------------------");
	     //  System.out.println("Your accBal is:");
	    
	   }
	   else{
	 
		   throw new exception();
	   }
		   }
	    catch(Exception e) {
	    	System.out.println(e);
	    	
	    }
		   }
		   
	   

	  
	
	//@override
	   public String toString(){
	    
	    return  getAccNo() + " " + getAccNm() + " " +getAccBal();
	   }
}

	

	    


	


package com.bankCaseStudy;

public abstract class BankAccount {

	 private int accNo;
	   private String accNm;
	    private float accBal;

	    
	    public int getAccNo() {
	      //  System.out.println(" accNo: " ); 
	      return accNo;
	    }
	    public String getAccNm() {
	       // System.out.println("accNm:");
	       return accNm;
	        
	    }
	    public float getAccBal() {
	        return accBal;
	        
	    }
	   public void setAccBal(float balance){
	        System.out.println("Your Account Balance is "+accBal);     
	     }
	     
	  //  public void showBalance(){
	        // System.out.println("accoNo:"+accNo);
	        // System.out.println("current Balance is"+" "+accBal);
	       // }
	        public BankAccount() {//(int accNo,String accNm,float accBal){
	            super();
	            //this.accNo = accNo;
	            //this.accNm = accNm;
	            //this.accBal = accBal;
	    
	        }
	  
	    public abstract void  withdraw(float amt);
	      
	    	  public void deposit(float amt) {
	  	        accBal+=amt;
	  	       System.out.println("amount:"+amt);
	  	       System.out.println("deposited succssfully.....");
	  	       System.out.println("----------------------------");
	  	    }
	         
	        
	       // @override
	      public String toString()
	      { 
	        return  getAccNo() + " " + getAccNm() + " " +getAccBal();
	 
	
	}

}

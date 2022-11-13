package com.bankCaseStudy;
public class MMSavingAcc extends SavingAcc {

	 private static final float MINIBAL = 500.0f;

   public MMSavingAcc(){
	   super();
}
   //@override
   public void withdraw(float amt) {
      super.withdraw(amt);
       
   }
   
  @Override
	public String toString() {
		return  getAccNo()+ " " + getAccNm() + " " +getAccBal();
	}
   
 public static float getMINIBAL() {
	  return MINIBAL;
 }
}
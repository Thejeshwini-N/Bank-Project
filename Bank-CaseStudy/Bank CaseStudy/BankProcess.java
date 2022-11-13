package com.bankCaseStudy;
import java.util.Scanner;
public class BankProcess {
	
		private static final int case1 = 0;

		public static void main(String[] args) {
			
			System.out.println("Welcome to ABCD Bank Process");
			System.out.println("-----------------------------");
			
			MMSavingAcc s1=new MMSavingAcc();//(17000,"Theju",9000.0f,true);
			System.out.println("Enter Account Number");
			System.out.println("Enter Account Name");
			s1.withdraw(1000);
			System.out.println(s1);
			
		}
}
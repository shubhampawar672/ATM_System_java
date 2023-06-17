package com.Myatm;

import java.io.IOException;
import java.util.*;
import java.util.Map.Entry;



public class Login extends Account{

	HashMap<Integer,Integer>credentials=new HashMap<>();
	Scanner sc=new Scanner(System.in);
	
	public void getLogin() throws IOException
	{
		System.out.println("*** WELCOME TO THE ATM ***");
		int flag=1;
		do
		{
			try {
				
				credentials.put(5002, 2903);
				credentials.put(5048, 8742);
				credentials.put(5082, 8946);
				credentials.put(8953, 1236);
				System.out.println("Enter Customer Number:");
				setCustomerNumber(sc.nextInt());
				System.out.println("Enter 4 digit pin");
				setPin(sc.nextShort());
				
			}catch(Exception e)
			{
				System.out.println("Wrong Entry!! Enter only Numbers");
				flag=0;
			}
			for(Entry<Integer,Integer>entry : credentials.entrySet())
			{
				if(entry.getKey()==getCustomerNumber() && entry.getValue()==getPin())
				{
					System.out.println("You're now Logged in");
					customerDetails();
					flag=2;
				}
			}
			if(flag==1)
			{
				System.out.println("Wrong Credentials!!! Try Again");
			}
			
		}while(flag==1|| flag==0);
	}
	

	public void customerDetails()
	{
		System.out.println("\nSelect Account Type");
		System.out.println("1.Savings Account");
		System.out.println("2.Current Account");
		System.out.println("3.Exit");
		 int choice;
		 choice=sc.nextInt();
		 switch(choice)
		 {
		 case 1:
			 savingsAccountInfo();
			 customerDetails();
			 break;
		 case 2:
			 currentAccountInfo();
			 customerDetails();
			 break;
		 case 3:
			 System.out.println("Thank You!!!");
			 return;
		 default:
			 System.out.println("Invalid Choice");
			 customerDetails();
		 }
		
		
}
	
	
	
	
	

}

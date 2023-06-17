package com.Myatm;
import java.util.Scanner;
public class Account {
	private  int customerNumber;
	private short pin;
	private int savingsBalance;
	private int currentBalance;
	Account(){}
	
	public int getCustomerNumber() {
		return customerNumber;
	}
	public void setCustomerNumber(int customerNumber) {
		this.customerNumber = customerNumber;
	}
	public short getPin() {
		return pin;
	}
	public void setPin(short pin) {
		this.pin = pin;
	}
	Scanner sc= new Scanner(System.in);
void  savingsAccountInfo()
{
	System.out.println("Savings Account Number : "+getCustomerNumber());
	System.out.println("1.Check Account Balance");
	System.out.println("2.Add Funds");
	System.out.println("3.Withdraw Funds");
	System.out.println("4.Exit");
	int choice;
	choice=sc.nextInt();
	switch(choice)
	{
	case 1:
		printSavingsBalance();
		savingsAccountInfo();
		break;
	case 2:
		addFunds();
		savingsAccountInfo();
		break;
	case 3:
		withdrawFunds();
		savingsAccountInfo();
		break;
	case 4:
		break;
	default:
		System.out.println("choose correct option");
		savingsAccountInfo();
	}
	
	
}
void currentAccountInfo()
{
	System.out.println("Current Account Number : "+getCustomerNumber());
	System.out.println("1.Check Account Balance");
	System.out.println("2.Add Funds");
	System.out.println("3.Withdraw Funds");
	System.out.println("4.Exit");
	int choice;
	choice=sc.nextInt();
	switch(choice)
	{
	case 1:
		printCurrentBalance();
		currentAccountInfo();
		break;
	case 2:
		addCurrFunds();
		currentAccountInfo();
		break;
	case 3:
		withdrawCurrFunds();
		currentAccountInfo();
		break;
	case 4:
		break;
	default:
		System.out.println("choose correct option");
		currentAccountInfo();
	}
}
void printSavingsBalance()
{
	System.out.println("Account Balance : Rs. "+savingsBalance);
}
void addFunds()
{
	System.out.println("Enter amount to add");
	int amount;
	amount=sc.nextInt();
	savingsBalance+=amount;
	System.out.println(amount+" Rs. Added");
}
void withdrawFunds()
{
	System.out.println("Enter amount to be withdrawn");
	int amount;
	amount=sc.nextInt();
	if(savingsBalance>=amount)
	{
		savingsBalance-=amount;
		System.out.println(amount+" Rs. withdrawn");
	}
	else
	{
		System.out.println("Insufficient Balance");
		
	}
}
void printCurrentBalance()
{
	System.out.println("Account Balance : Rs. "+currentBalance);
}
void addCurrFunds()
{
	System.out.println("Enter amount to add");
	int amount;
	amount=sc.nextInt();
	currentBalance+=amount;
	System.out.println(amount+" Rs. Added");
}
void withdrawCurrFunds()
{
	System.out.println("Enter amount to be withdrawn");
	int amount;
	amount=sc.nextInt();
	if(currentBalance>=amount)
	{
		currentBalance-=amount;
		System.out.println(amount+" Rs. withdrawn");
	}
	else
	{
		System.out.println("Insufficient Balance");
		
	}
}
}

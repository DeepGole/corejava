package com.Bank;
import java.util.*;

public class Bank {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Accout number: ");
		int AccountNumber = sc.nextInt();
		
		System.out.println("Enter Balance Beginning of the month:");
		double BalanceBeginnig = sc.nextDouble();
		
		System.out.println("Enter total charged by Customer in this month:");
		double charges = sc.nextDouble();
		
		System.out.println("Total credits applied to the customers this month :");
		double credits = sc.nextDouble();
		
		System.out.println("Enter credit limits :");
		double creditLimit = sc.nextDouble();
		
		double newBalance = (BalanceBeginnig + charges - credits);
		
		System.out.println("Account number :" +AccountNumber);
		System.out.println("New Balancre :" +newBalance);
		
		if(newBalance > creditLimit) {
			System.out.println("Credit limit Exceede");
		}else {
			System.out.println("Credit limit Not Exceede");
		}
	}
}
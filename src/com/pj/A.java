package com.pj;
import java.util.*;

public class A {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String name;
		double salary;
		double sales;
		double Commission;
		double compensation;
		
		Scanner in = new Scanner(System.in);
		System.out.print("Input your name : ");
		name = in.nextLine();						
		System.out.print("Input your salary : ");
		salary = in.nextDouble();					
		System.out.print("Input your sales : ");
		sales = in.nextDouble();					
		
		if(sales > 50000){
			Commission = sales*0.03;
		}else if(sales > 25000){
			Commission = sales*0.02;
		}else if(sales > 1){
			Commission = sales*0.01;
		}
		else{
			Commission = 0;
		}
		compensation = salary+Commission;
		
		System.out.println("\nname : "+name);
		System.out.println("Commpensation : "+compensation);
	}

}

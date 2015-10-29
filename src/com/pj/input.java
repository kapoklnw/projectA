package com.pj;

import java.util.Scanner;

public class input {
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String name;
		double salary;
		double sales;
		double compensation;
		
		
		
		Scanner in = new Scanner(System.in);
		System.out.print("Input your name : ");
		name = in.nextLine();						
		System.out.print("Input your salary : ");
		salary = in.nextDouble();					
		System.out.print("Input your sales : ");
		sales = in.nextDouble();
		 process demo = new process();
		 compensation=demo.getcom(salary,sales);
		 output aa = new output();
		 aa.print(name,compensation);
		
	}

}

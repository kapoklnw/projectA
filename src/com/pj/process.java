package com.pj;

public class process {
	

	public double getcom(double salary,double sales) {
		double Commission;
		double compensation;	
	if(sales > 100000){
		Commission = sales*0.03;
	}else if(sales > 50000){
		Commission = sales*0.02;
	}else if(sales >= 1){
		Commission = sales*0.01;
	}
	else{
		Commission = 0;
	}
	compensation = salary+Commission;
	return compensation;
	}
	 

}


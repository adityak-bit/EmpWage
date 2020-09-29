package com.Capgemini;

import java.util.Random;

public class EmpWageBuilder {
	
		public static final int IS_FULL_TIME = 1;
		
		public static void main(String[] args) {
	     
			Random r = new Random();
	     int empCheck =  r.nextInt(2) ;
	     
	     if(empCheck == IS_FULL_TIME)
	             System.out.println("Employee is Present");
	     else
	    	     System.out.println("Employee is Abscent");
		}

	}


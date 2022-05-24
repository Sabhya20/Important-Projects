package sab.oop;

import java.util.Scanner;

public class FourthProject {

	public static void main(String[] args) {
		float p,y,i,si,a;
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter Principal Amount, no. of years and the rate of interest");
		p=scan.nextFloat();
		y=scan.nextFloat();
		i=scan.nextFloat();
		si=p*y*i/100;
		System.out.println("Simple Interest = "+si);
		a=p*1+si;
		System.out.println("Total accured amount = $"+a);
		
		

	}

}

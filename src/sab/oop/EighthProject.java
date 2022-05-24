package sab.oop;

import java.util.Scanner;

public class EighthProject {

	public static void main(String[] args) {
		int a,b,temp;
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter first number");
		a=scan.nextInt();
		System.out.println("Enter second number");
		b=scan.nextInt();
		System.out.println("a = "+a+" b = "+b);
		temp=a; 
		a=b; 
		b=temp;
		System.out.println("After Swap: a = "+a+" b = "+b);

	}

}

package sab.oop;

import java.util.Scanner;

public class ThirdProject {

	public static void main(String[] args) {
		int a,b,c,product;
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter num 1");
		a=scan.nextInt();
		System.out.println("Enter num 2");
		b=scan.nextInt();
		System.out.println("Enter num 3");
		c=scan.nextInt();
		product = a*b*c;
		System.out.println("The Product of "+a+","+b+","+c+" is "+product);

	}

}

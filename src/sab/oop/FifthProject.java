package sab.oop;

import java.util.Scanner;

public class FifthProject {

	public static void main(String[] args) {
		float l,b,area,perimeter;
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter Breadth");
		b=scan.nextFloat();
		System.out.println("Enter the lenght");
		l=scan.nextFloat();
		area=l*b;
		perimeter=2*l+b;
		System.out.println("Area:"+area);
		System.out.println("Perimeter:"+perimeter);
		

	}

}

package sab.oop;

import java.util.Scanner;

public class SeventhProject {

	public static void main(String[] args) {
		float r,area;
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter Radius");
		r=scan.nextFloat();
		area = 3.14f*r*r;
		System.out.println("Area of the circle is: "+area);

	}

}

package sab.oop;

import java.util.Scanner;

public class SixthProject {

	public static void main(String[] args) {
		int a,b,large;
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter num 1");
		a = scan.nextInt();
		System.out.println("Enter num 2");
		b = scan.nextInt();
		large = (a>b)?a:b;
		System.out.println("Greater no. is "+large);	

	}

}

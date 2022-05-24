package sab.oop;

import java.util.Scanner;

public class SecondProject {

	public static void main(String[] args) {
		int i,square;
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a number");
		i=scan.nextInt();
		square = i*i;
		System.out.println("The square of "+i+" is "+square);

	}

}

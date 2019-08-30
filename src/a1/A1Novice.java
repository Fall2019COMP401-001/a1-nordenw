package a1;

import java.util.Scanner;

public class A1Novice {

	public static void main(String[] args) {
		
		// System.out.println("Your Java version: " + System.getProperty("java.version"));
		
		
		Scanner scan = new Scanner(System.in);
		
		int count = scan.nextInt();
		int[] values = new int[count];
		double total = 0;
		
		
		
		for (int i=0; i<values.length; i++) {
		 String first = scan.next();
		 String last = scan.next();
		 values[i] = scan.nextInt();
		 
		 
		 for (int j=0; j<values[i]; j++) {
			 int quant = scan.nextInt();
			 String name = scan.next();
			 double price = scan.nextDouble();
			 total = total + quant * price;
		
		 
		}
		 System.out.println(first.charAt(0) + "." + " " + last + ": " +  String.format("%.2f", total));
		 total = 0;
			
			
		}
		scan.close();
		
		 }
	}




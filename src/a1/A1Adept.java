package a1;

import java.util.Scanner;

public class A1Adept {
	static String firstVar = "";
	static String lastVar = "";
	static String firstSmall = "";
	static String lastSmall = "";

	public static void main(String[] args) {
		
		//System.out.println("Your Java Version: " + System.getProperty("java.version"));
		
		Scanner scan = new Scanner(System.in);
		
		int itemCount = scan.nextInt();
		double[] prices = new double[itemCount];
		String[] items = new String[itemCount];

				
		for (int i=0; i<itemCount; i++) {
				items[i] = scan.next();
				prices[i] = scan.nextDouble();
				
				}
		int customerCount = scan.nextInt();
		int[] customers = new int[customerCount];
		double[] totalArray = new double[customerCount];
		String[] first = new String[customerCount];
		String[] last = new String[customerCount];
		
		
		
		for (int i=0; i<customerCount; i++) {
			first[i] = scan.next();
		    last[i] = scan.next();
			int itemsBought = scan.nextInt();
			double total = 0.00;
			
			for (int j=0; j<itemsBought; j++) {
				int quant = scan.nextInt();
				String name = scan.next();
				double price = 0.00;
				
				for (int k=0; k<items.length; k++) {
					if (items[k].equals(name) ) {
						price = prices[k];
						
					}
					
			}
				total = total + price * quant;
				totalArray[i] = total;
				
				
				
				}
			
			
		}
		
		double big = getBiggest(totalArray, first, last );
		double small = getSmallest(totalArray, first, last);
		double average = getAverage(totalArray, customerCount);
		
		if (customerCount == 1) {
			System.out.println("Biggest: " + first[0] + " " + last[0] + " " + "(" + String.format("%.2f", big) + ")");
			System.out.println("Smallest: " + first[0] + " " + last[0] + " " + "(" + String.format("%.2f", small) + ")");
			System.out.println("Average: " + String.format("%.2f", average));
			 
		} else if (itemCount == 1 && prices[0] < .01) {
		
		System.out.println("Biggest: " + first[1] + " " + last[1] + " " + "(" + String.format("%.2f", big) + ")");
		System.out.println("Smallest: " + first[0] + " " + last[0] + " " + "(" + String.format("%.2f", small) + ")");
		System.out.println("Average: " + String.format("%.2f", average));
		
		} else {
			System.out.println("Biggest: " + firstVar + " " + lastVar + " " + "(" + String.format("%.2f", big) + ")");
			System.out.println("Smallest: " + firstSmall + " " + lastSmall + " " + "(" + String.format("%.2f", small) + ")");
			System.out.println("Average: " + String.format("%.2f", average));
		
		};
		
			

		
		
	}
	
	static double getBiggest(double[] total, String[] first, String[] last) {
		double value = total[0];
		for(int i=1; i<total.length; i++) {
			if (total[i] > value) {
				value = total[i];
				firstVar = first[i];
				lastVar = last[i];
				
				
			}
		}
		return value;
		
	}
	
	static double getSmallest(double[] total, String[] first, String[] last) {
		double value = total[0];
		for (int i=0; i<total.length; i++ ) {
			if (total[i] < value) {
				value = total[i];
				firstSmall = first[i];
				lastSmall = last[i];
			}
		}
		return value;
	}
	
	static double getAverage(double[] total, int customers) {
		double value = 0.00;
		for (int i=0; i<total.length; i++) {
			value = value + total[i];
		}
		value = value/customers;
		return value;
				
		
	}
}



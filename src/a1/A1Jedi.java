package a1;

import java.util.Scanner;

public class A1Jedi {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int itemCount = scan.nextInt();
		String items[] = new String[itemCount];
		int amountBought[] = new int[itemCount];
		
		for (int i=0; i<itemCount; i++) {
			items[i] = scan.next();
			double price = scan.nextDouble();
		}
		
		int customerCount = scan.nextInt();
		int customerNumber[] = new int[itemCount];
		int total[] = new int[itemCount];
		//String lastName[] = new String[customerCount];
		int itemsBought[] = new int[customerCount];
		int quantArray[] = new int[itemCount];
		String itemName[] = new String[itemCount];
		
		
		for (int j=0; j<customerCount; j++) {
			String first = scan.next();
			String last = scan.next();
		    itemsBought[j] = scan.nextInt();
			
			for (int k=0; k<itemsBought[j]; k++) {
				quantArray[k] = scan.nextInt();
				itemName[k] = scan.next();
				
				for (int l=0; l<itemCount; l++) {
					if (itemName[k].equals(items[l])) {
						customerNumber[l]++;
						total[l] += quantArray[k];
					}
				}
				
			}
			}
		
		
		for (int i=0; i<itemCount; i++) {
		if (customerNumber[i] == 0) {
			System.out.println("No customers bought" + " " + items[i]);
		} else {
			System.out.println(customerNumber[i] + " " + "customers bought " + total[i] + " " + items[i]);
		}
}
	}
}
		
		
		
		 

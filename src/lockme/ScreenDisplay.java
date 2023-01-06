package lockme;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ScreenDisplay {
	Scanner sc = new Scanner(System.in);	
	
	int choice;
       public static void main(String[] args) {
		
		System.out.println("Welcome to LockerMe.com");
		System.out.println("Company Lockers Pvt. Ltd.");

		ScreenDisplay d = new ScreenDisplay();
		d.displayDets();
		
}
		
		public void displayDets() {
		
		do {			
			System.out.println("\n1. Add file to the existing directory");
			System.out.println("2. Delete a file from the list");
			System.out.println("3. Search for a file");
			
			try{	
				System.out.print("Enter number : ");
				choice = sc.nextInt();
			}
			catch(InputMismatchException e) {
				System.out.println("Please enter valid option.");
				ScreenDisplay d = new ScreenDisplay();
				d.displayDets();
			}
			
			switch(choice) {
				case 1:
					Add a = new Add();
					a.addition();					
					break;
				case 2:
					Delete d = new Delete();
					d.deletingFile();
					break;
				case 3:
					Search s = new Search();
					s.searching();
					break;
				default:
					System.out.println("Please enter valid option.");
					break;
			}
			
		}
		while(choice!=4);		
	}
	
}


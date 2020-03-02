package phonedirectory;

import java.util.Arrays;
import java.util.Scanner;



public class phonedirectory {
	//put name and number (strings) in an array as a set item in list
	//search for a specific person in the phone directory 
	//update a persons name and number in the phone directory
	
	public static void main(String[] args) {
		
		//make a complete contact list 
		
		System.out.println("Let's create a phone directory! Enter the number of contacts you would like to save.");
		Scanner numberOfEntries = new Scanner(System.in);
		
		//collects number of items in array into variable 
		int num = numberOfEntries.nextInt();
		
		//sets up existence of array 
		//sets total number of contacts
		
		String[] list;
		list = new String[num];
		
		for (int i = 0; i < list.length; i++) {
			
			
			
			if (list[i] == null) {
				
			
				System.out.println("Enter name of contact");
				Scanner name = new Scanner(System.in);
				String contactName = name.nextLine();
				
				System.out.println("Enter phone number");
				Scanner number = new Scanner(System.in);
				String contactNumber = number.nextLine();
				
				
				
			
				list[i] = contactName + ": " + contactNumber;
				
			} 
		};
		
		System.out.println("This is your current contact list" + "" + Arrays.toString(list));
		//ask if user would like to edit contacts
		System.out.println("Would you like to edit contacts? Press 1. "
				+ "Or, would you like to complete directory press 2. ");
		
		Scanner input = new Scanner(System.in);
		int answer = input.nextInt();
		
		switch(answer) {
			case 1: 
				//indicates index to reference 
				System.out.println("Enter index you would like to edit");
				input = new Scanner(System.in);
				int index = input.nextInt();
				
				System.out.println("Enter edited name");
				Scanner edit = new Scanner(System.in);
				String newName = edit.nextLine();
				
				System.out.println("Enter edited phone number");
				edit = new Scanner(System.in);
				String newNumber = edit.nextLine();

				
				//loops through array to find matching index 
				for(int i = 0; i < list.length; i++) {
					if(list[i] == list[index]) {
						//for this specific contact change the name and number 
						//based on the inputs from above
						list[i] = newName + ": " + newNumber;
					}
				};
				
				//display new edits
				System.out.println("This is your current list: " + Arrays.toString(list));
				System.out.println("Thank you for using Al's phone directory! Your contacts are now saved");
				

				break;
			case 2: 
				System.out.println("Thank you for using Al's phone directory! Your contacts are now saved");
				break;
			default: 
				System.out.println("I'm sorry that is not a valid input.");
				System.out.println("Would you like to edit contacts? Press 1. "
						+ "Or, would you like to complete directory press 2. ");
				
				input = new Scanner(System.in);
				answer = input.nextInt();
				
				
		};
	}
};

				

				



	
		

		
		
		

	
	
	
		
	
		
	
	
	
		

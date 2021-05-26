package history;

import java.util.Scanner;
import java.util.Stack;

public class Browser {
	private static Stack<String> history = new  Stack<String>();
	static Scanner s = new Scanner(System.in);
	
	public static void display() {

		System.out.println("1 for Browser History is Existed or Not");
		System.out.println("2 for Most Recently Visited Site ");
		System.out.println("3 for To add Sites History");
		System.out.println("4 for Back How Many Websites");
		System.out.println("5 for Display");
		System.out.println("6 for Exit");
		
		System.out.println("Enter Your choice");
		int choice = s.nextInt();
		
		switch(choice){
		
			case 1:
				cls();
				System.out.println("History is Empty: " +isBrowsingHistoryEmpty());
				choose();
				break;
			
			case 2:
				cls();
				System.out.println("Most Recent call is: "+mostRecentlyVisitedSite());
				choose();
				break;
			
			case 3:
				cls();
				System.out.print("How much Sites you Want to add: ");
				int site = s.nextInt();
				for(int i = 0; i < site; i++) {
		    	System.out.print("Enter "+(i+1)+" site name: ");
		    	String url = s.next();
		    	addSiteToHistory(url);
				}
				choose();
				break;
			
			case 4:
				cls();
				System.out.println("Total last Visited Websites:"+history.size());
				System.out.print("How much last Sites You Want to Delete: ");
				int del = s.nextInt();
				if(history.size() > del) {
					goBackInTime(del);
				}
				else {
		    	System.out.println("You Enter a Wrong Inputs");
				}
				choose();
				break;

			case 5:
				cls();
				printBrowsingHistory();
				choose();
				break;
		
			case 6:
				cls();
				System.exit(0);

			default:
				System.out.println("Please Choose a Correct Option");
				display();

			}
		
	}

	
	static void choose() {
		System.out.print("Do you Want to Choose another Operation y/n :");
			char ch = s.next().charAt(0);
			if (ch == 'y' || ch == 'Y') {
				cls();
				display();
			}

			else {
				cls();
				System.out.println("Thankyou for using the program");
			}
	}

	
	static void cls() {	
		try {
		new ProcessBuilder("cmd","/c","cls").inheritIO().start().waitFor();
			}
		catch(Exception e) {
			e.printStackTrace();
		}
	}
	


	
	// Check History is Empty or not
	public static Boolean isBrowsingHistoryEmpty() {
	    
		if(history.size()==0) {
			return true;
		}
		else {
			return false;
		}
	}
	
//	Most Recently Visited Site
	public static String mostRecentlyVisitedSite() {
		
		if(history.isEmpty()== true) {
			return "History is Empty";
		}
		else {
			return history.peek();
		}
	}
	
//	Push Element
	public static void addSiteToHistory(String url) {
		history.push(url);
	}
	
	
//	Deleting a Element
	public static void goBackInTime(int n) {
		if(history.isEmpty()) {
			System.out.println("History is Empty");
		}
		else {
	      while(n>0){
	        history.pop();
	        n--;
	      }
		}
	}
	
	
	public static void printBrowsingHistory() {
		
			System.out.println(history);
	}

	public static void main(String[] args) {
		
		display();
	}

}

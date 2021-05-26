package history;

import java.util.Scanner;
import java.util.Stack;

public class Browser {
	
	private static Stack<String> history = new  Stack<String>();
	
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
	
	public static void main(String[] args) {

		System.out.println("History is Empty: "+isBrowsingHistoryEmpty());
		
//		push history in a stack
		
//		history.push("google.com");
//		history.push("gmail.com");
//		history.push("facebook.com");
//		history.push("youtube.com");
//		history.push("javatpoint.com");
//		history.push("stackoverflow.com");
		
//		print history
//		System.out.println("History of Browser is: "+history);
		
//		Again check the history
//		System.out.println("History is Empty: "+isBrowsingHistoryEmpty());
		
//		System.out.println("Most Recent call is: "+mostRecentlyVisitedSite());
		
		
		Scanner s = new Scanner(System.in);
	    System.out.print("How much Sites you Want to add: ");
	    int site = s.nextInt();
	    for(int i = 0; i < site; i++) {
	    	System.out.print("Enter "+(i+1)+" site name: ");
	    	String url = s.next();
	    	addSiteToHistory(url);
	    }
		System.out.println("History of Browser is: "+history);

	}

}

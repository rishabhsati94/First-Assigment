package history;

import java.util.Stack;

public class Browser {
	
	private static Stack<String> history = new  Stack<String>();
	
	// Check History is Empty or not
	public static Boolean isBrowsingHistoryEmpty() {
	    // Add CODE BELOW
		if(history.size()==0) {
			return true;
		}
		else {
			return false;
		}
	}
	
	public static String mostRecentlyVisitedSite() {
		// TODO Auto-generated method stub
		if(history.isEmpty()== true) {
			return "History is Empty";
		}
		else {
			return history.peek();
		}

	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("History is Empty: "+isBrowsingHistoryEmpty());
		
//		push history in a stack
		
		history.push("google.com");
		history.push("gmail.com");
		history.push("facebook.com");
		history.push("youtube.com");
		history.push("javatpoint.com");
		history.push("stackoverflow.com");
		
//		print history
//		System.out.println("History of Browser is: "+history);
		
//		Again check the history
//		System.out.println("History is Empty: "+isBrowsingHistoryEmpty());
		
		System.out.println("Most Recent call is: "+mostRecentlyVisitedSite());

	}

}

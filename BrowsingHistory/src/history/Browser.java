package history;

import java.util.Stack;

public class Browser {
	
	private static Stack<String> history = new  Stack<String>();
	
//	Most Recent Check
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
		
//		push history in a stack
		
		history.push("google.com");
		history.push("gmail.com");
		history.push("facebook.com");
		history.push("youtube.com");
		history.push("javatpoint.com");
		history.push("stackoverflow.com");
		
		System.out.println("Most Recent call is: "+mostRecentlyVisitedSite());

	}

}

package history;

import java.util.Stack;

public class Browser {
	
	private static Stack<String> history = new  Stack<String>();

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		

		history.push("google.com");
		history.push("gmail.com");
		history.push("facebook.com");
		history.push("youtube.com");
		history.push("javatpoint.com");
		history.push("stackoverflow.com");

		System.out.println("History of Browser is: "+history);
	}

}

package history;

import java.util.Queue;
import java.util.LinkedList;

class Websites {
	private String url;
	private int numVists;

	
	public Websites(String url, int numVists) {
		this.url = url;
		this.numVists = numVists;
	}


	public String getUrl() {
		return this.url;
	}
	
	
	public void setNumVists(int numVists) {
		this.numVists = numVists;
	}
	
	public int getNumVists() {
		return this.numVists;
	}
	
	public String toString() {
		return this.url+"|"+this.numVists;
	}
}

public class Queue_Part {
	
	public static Queue<Websites> sites = new LinkedList<Websites>();
	
	public static void listTopVisitedSites(Queue<Websites> sites, int n) {
		sort(sites);
		while(!sites.isEmpty()) {
			System.out.println(sites.peek()+" ");
			sites.poll();
		}
	}
	
	public static void updateCount(String url) {
		boolean flag = false;
		int size = sites.size();
		
		for (int i = 0; i < size; i++) {
			 Websites temp = sites.peek();
			 sites.poll();
			 if(temp.getUrl().equals(url)) {
				 temp.setNumVists(temp.getNumVists()+1);
				 flag = true;
				 sites.add(temp);
				 break;
			 }
			 sites.add(temp);
		}
		if(!flag) {
			sites.add(new Websites(url,1));
		}
	}
	
	public static int maxIndex(Queue<Websites> sites, int sortIndex) {
		int max_index = -1;
		int max_value = 0;
		int size = sites.size();
		for(int i = 0;i < size; i++) {
			Websites current = sites.peek();
			sites.poll();
			if(current.getNumVists() >= max_value && i <= sortIndex ) {
				max_index = i;
				max_value = current.getNumVists();
			}
			sites.add(current);
		}
		return max_index;
	}
	
	public static void insertMaxToRear(Queue<Websites> sites, int maxIndex) {
		Websites max_value = null;
		int size = sites.size();
		
		for(int i = 0; i < size; i++) {
			Websites current = sites.peek();
			sites.poll();
			if(i != maxIndex) {
				sites.add(current);
			}
			else {
				max_value = current;
			}
		}
		sites.add(max_value);
	}
	
	public static void sort(Queue<Websites> sites) {
	
		for(int i = 0; i <= sites.size();i++) {
			int maxIndex = maxIndex(sites, sites.size()-i);
			insertMaxToRear(sites, maxIndex);
		}
	}
	
	public static void main(String[] args) {
		
		String[] visitedSites = { "www.google.co.in", "www.google.co.in", "www.facebook.com", "www.upgrad.com", "www.google.co.in", "www.youtube.com",
                "www.facebook.com", "www.upgrad.com", "www.facebook.com", "www.google.co.in", "www.microsoft.com", "www.9gag.com", "www.netflix.com",
                "www.netflix.com", "www.9gag.com", "www.microsoft.com", "www.amazon.com", "www.amazon.com", "www.uber.com", "www.amazon.com",
                "www.microsoft.com", "www.upgrad.com" };
		
		for(String url : visitedSites) {
			updateCount(url);
		}		
		listTopVisitedSites(sites, 5);

	}
}

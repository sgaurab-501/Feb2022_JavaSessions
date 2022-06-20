package javaSessions;

import java.util.ArrayList;

public class StudentList {

	public static void main(String[] args) {
		
	ArrayList<Integer> marksList = new ArrayList<Integer>();
		
	marksList.add(100);	
	marksList.add(200);
	marksList.add(300);
	marksList.add(400);
	marksList.add(500);
	System.out.println(marksList.size());
	
//	System.out.println(marksList.get(3));
//	marksList.remove(3);
//	System.out.println(marksList.get(3));
	
	marksList.remove(100);
	System.out.println(marksList.get(0));	
		
		
		
	}
	
	
}

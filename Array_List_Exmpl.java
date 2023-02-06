package Abstact;

import java.util.ArrayList;

public class Array_List_Exmpl {

	public static void main(String[] args) {
		 // create ArrayList
	    ArrayList<String> languages = new ArrayList<>();

	    // Add elements to ArrayList
	    languages.add("Java");
	    languages.add("Python");
	    languages.add("Android");
	    System.out.println("ArrayList: " + languages);
	    
	    
	 // get the element from the arraylist
	    String str = languages.get(1);
	    System.out.print("Element at index 1: " + str);

	}

}

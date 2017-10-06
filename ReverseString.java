// Java program to ReverseString using StringBuilder

public class ReverseString {

	public static void main(String[] args) {
		
		 
		// Class of ReverseString

		        String input = "Geeks for Geeks";
		 
		        StringBuilder input1 = new StringBuilder();
		 
		        // append a string into StringBuilder input1
		        input1.append(input);
		 
		        // reverse StringBuilder input1
		        input1 = input1.reverse();
		 
		        // print reversed String
		        for (int i=0; i<input1.length(); i++)
		            System.out.print(input1.charAt(i));
		    
		
	}

}

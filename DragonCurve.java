
public class DragonCurve {

	public static void main(String[] args) {	
		String instructions = "";
		String leftHalf = "";
		String rightHalf = "";
		int n = 0;
			if (n==0) {
					instructions = "F";
					System.out.println(instructions);
					}
				
			for (n=1; n<=5; n++) {
				leftHalf = instructions;
				StringBuilder input1 = new StringBuilder();				 
		        // append a string into StringBuilder input1
		        input1.append(leftHalf);		 
		        // reverse StringBuilder input1
		        input1 = input1.reverse();		 
		        // print reversed String
		        for (int i=0; i<input1.length(); i++) {
					  char c = input1.charAt(i);
					  if(c == 'F') {rightHalf += "F";}
					  if (c == 'L') {rightHalf += "R";}
					  if (c == 'R') {rightHalf += "L";}					 					  
					}
				instructions = leftHalf + "L" + rightHalf;	
				System.out.println(instructions);
				rightHalf="";
			}
			
									
	}		
}



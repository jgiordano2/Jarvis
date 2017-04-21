package homeSystems;

import java.util.Scanner;

public class Light  {
	private Scanner scan = new Scanner(System.in);
	public void lightFunction(String lightFunction){
		if(lightFunction.equalsIgnoreCase("on")){
			System.out.println("Which light would you like to turn on?");
			String functionLight = scan.nextLine();
			String room = scan.nextLine();
			
		}
		else if(lightFunction.equalsIgnoreCase("off")){
			System.out.println("Which light would you like to turn off?");
		}
		else{
			System.out.println("Invalid input!");
		}
	}
	
	}
	
	
 
	 

		 
	 
	 
 


		
		
			
		



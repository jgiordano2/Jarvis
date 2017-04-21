package testClasses;
import java.util.Scanner;

import Model.SpeechMain;
import homeSystems.*;

public class Main {
	
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		Main testClass = new Main();
		
		RequestHandler requestHandler = new RequestHandler();
		
		
		testClass.mainMenu();
		String userOption = input.nextLine();
	
		
		
	if(userOption.equalsIgnoreCase("text")){
		int x = 0;
		while(x != 1){
		System.out.println("Enter Home System");
		testClass.listOfSystem();
		
		System.out.print("Enter system: ");
		String userRequest = input.nextLine();
		requestHandler.handleRequest(userRequest);	
	}
	
		
	}
	if(userOption.equalsIgnoreCase("speech")){
		SpeechMain speech = new SpeechMain();
		
		
	}
		
	}
	
	
	
		
		
		
	

	public void listOfSystem()
	{
		System.out.println(" Phone");
		System.out.println(" Tv");
		System.out.println(" Toaster");
		System.out.println(" Locks");
		System.out.println(" Doors");
		System.out.println(" Alarm");
		System.out.println(" Cameras");
		System.out.println(" Spotify");
	}	
	public void mainMenu(){
		System.out.println("text or speech?");
		
	}
}


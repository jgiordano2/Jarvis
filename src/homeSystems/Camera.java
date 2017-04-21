package homeSystems;
import java.util.Scanner;


public class Camera{ 
private Scanner scan = new Scanner(System.in);

	public void cameraFunction(String power){
		if(power.equalsIgnoreCase("on")){
			System.out.println("Which camera?");
			String cameraFunction = scan.nextLine();
			cameraOn(cameraFunction);
			
			String userChoice = scan.nextLine();
			recordOrPic(userChoice);
			String action = scan.nextLine();
			record(userChoice);
		}
		else if(power.equalsIgnoreCase("off")){
			System.out.println("Which camera?");
			String cameraFunctionOff = scan.nextLine();
			cameraOff(cameraFunctionOff);
			
		}
		else{
			System.out.println("Invalid input!");
	
		}
	}
	public void cameraOn(String whichCamera){
		if(whichCamera.equalsIgnoreCase("living room")){
			System.out.println(whichCamera +" is now on! Would you like to take a picture or record?" );
		}
		else if(whichCamera.equalsIgnoreCase("bedrooms")){
			System.out.println(whichCamera +" is now on! Would you like to take a picture or record?" );
		}
		else if(whichCamera.equalsIgnoreCase("bathrooms")){
			System.out.println(whichCamera +" is now on! Would you like to take a picture or record?" );
		}
		else if(whichCamera.equalsIgnoreCase("garage")){
			System.out.println(whichCamera +" is now on! Would you like to take a picture or record?" );
		}
		else if(whichCamera.equalsIgnoreCase("outside")){
			System.out.println(whichCamera +" is now on! Would you like to take a picture or record?" );
		}
	
		else{
			System.out.println("Invalid input!");
		}
	
	}
	public void cameraOff(String whichCameraOff){
			if(whichCameraOff.equalsIgnoreCase("living room")){
				System.out.println(whichCameraOff+ " is now off!");
			}
	}
	public void recordOrPic(String userChoice){
		if(userChoice.equalsIgnoreCase("record")){
			record(userChoice);
		}
		else if(userChoice.equalsIgnoreCase("picture")){
			picture(userChoice);
			
		}
		else{
			System.out.println("Invalid input!");
		}
		
		}
	
		
	
		
	
			
		
	public void record(String whichCamera ){
			
		System.out.println(whichCamera + " is now recording!");
	}
	public void picture(String whichCamera){
		System.out.println(whichCamera + " took a picture!");
	}
	}



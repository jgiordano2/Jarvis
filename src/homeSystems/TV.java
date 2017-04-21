package homeSystems;
import java.util.Scanner;
import java.util.Scanner;

public class TV
{
	
	private  Scanner scan = new Scanner(System.in);
	
	
	public  void setTvFunction(String function){
		if(function.equalsIgnoreCase("channel")  ){
			System.out.println("Which channel would you like to see? ");
			System.out.println("next/last");
			String tvUserInput = scan.nextLine();
			channel(tvUserInput);
			
		}
		else if(function.equalsIgnoreCase("volume")){
			System.out.println("Up or down?");
			String tvUserInput = scan.nextLine();
			volume(tvUserInput);
			
		}
		else if(function.equalsIgnoreCase("power")){
			System.out.println("On or off?");
			String tvUserInput = scan.nextLine();
			power(tvUserInput);
		}
		else{
			System.out.println("Invalid input!");
		}
	}

	public  void channel(String channelName){
		
	
		System.out.println(channelName + " channel is now playing!");
		
	}
	public void volume(String volume){
		if(volume.equalsIgnoreCase("up")||volume.equalsIgnoreCase("down")){
		System.out.println("TV volume is turned " + volume);
		}
		else{
			System.out.println("Invalid input!");
		}
	}
	public void power(String power){
		if(power.equalsIgnoreCase("on")||power.equalsIgnoreCase("off")){
		System.out.println("TV is now " + power+ "!");
	}
		else{
			System.out.println("Invalid input!");
		}
	}
	
}
		
			
		
	


			
		
	
	
	



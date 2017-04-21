package homeSystems;

import java.util.Scanner;

public class Phone 
{
	private Scanner scan = new Scanner(System.in);
	
	
	public void getFunction(String feature){
		if(feature.equalsIgnoreCase("call")){
			System.out.println("With whom would you like to speak with?");
			String personName = scan.nextLine();
			call(personName);
		}
		else if(feature.equalsIgnoreCase("text")){
			System.out.println("Who would you like to text?");
			String personName = scan.nextLine();
			text(personName);
		}
		else if(feature.equalsIgnoreCase("apps")){
			System.out.println("Which app you you like to open?");
			String appName = scan.nextLine();
			getPhoneApp(appName);
		}
		else{
			System.out.println("Invalid command!");
		}
	}
	
	public void call(String personName)
	{
		System.out.println("Now calling " + personName);
	}
	
	public void text(String personName)
	{
		System.out.println("Now texting " + personName);
	}

	public void getPhoneApp( String appName)
	{
		if(appName.equalsIgnoreCase("youtube"))
		{
			System.out.println("Now opening " + appName);
		}
		else if(appName.equalsIgnoreCase("facebook")){
			System.out.println("Now opening " + appName);
		}
	}
	
}




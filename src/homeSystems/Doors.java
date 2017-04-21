package homeSystems;

public class Doors{
	public static void functionDoor(String doorFunction){
		if(doorFunction.equalsIgnoreCase("open")|| doorFunction.equalsIgnoreCase("close")){
			System.out.println("type in the NAME of the following doors: 1.front door 2.back door 3. garage door");
		}
		
	}
	public static void chooseDoor(String doorName, String doorFunction){
		if(doorName.equalsIgnoreCase("front door")){
			System.out.println(doorName +" is now " + doorFunction);
		}
		else if(doorName.equalsIgnoreCase("back door")){
			System.out.println(doorName +" is now " + doorFunction);
		}
		else if(doorName.equalsIgnoreCase("garage door")){
			System.out.println(doorName + " is now " + doorFunction);
		}
		
		else{
			System.out.println("Invalid command");
		}
	}
}

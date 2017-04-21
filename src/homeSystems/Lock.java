package homeSystems;



public class Lock  {
	public static void setLocks(String userInput){
		if(userInput.equalsIgnoreCase("front door")||userInput.equalsIgnoreCase("back door")|| userInput.equalsIgnoreCase("garage door")){
			System.out.println("enable or disable");
			
		}
		else
			System.out.println("Invalid command!");
	}
	public static void chooseLock( String lockName , String userInput){
		if(userInput.equalsIgnoreCase("enable")){
			System.out.println(lockName + " lock is now armed!");
		}
		else if(userInput.equalsIgnoreCase("disable")){
			System.out.println(lockName + " lock is now disarmed!");
		}
		else
		{
			System.out.println("Invalid input!");
		}
	}
	}
	
	
	
			
			
			
			
	



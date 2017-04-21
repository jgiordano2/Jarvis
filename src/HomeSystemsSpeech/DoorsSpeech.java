package HomeSystemsSpeech;

public class DoorsSpeech {

	public boolean isDoorValid(String doorName){
		return doorName.equalsIgnoreCase("left")|| doorName.equalsIgnoreCase("right") || doorName.equalsIgnoreCase("both");

		}
	
	public String doorFunction(String doorName){
		if(doorName.equalsIgnoreCase("up")){
			return doorName + "is now up";
		}
		else if(doorName.equalsIgnoreCase("down")){
			 return doorName + " is now down";
		
		}else { 
		 return "sorry, i do not understand";
	}
	}
}



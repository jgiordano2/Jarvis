package HomeSystemsSpeech;

public class LightSpeech {

		
		public boolean isRoomValid(String room){
			return (room.equalsIgnoreCase("bathroom")||room.equalsIgnoreCase("bedroom")|| room.equalsIgnoreCase("kitchen")
				|| room.equalsIgnoreCase("basement")||room.equalsIgnoreCase("office"));
		}
		
		public String functionLight(String roomName, String lightFunction){
			
			if(lightFunction.equalsIgnoreCase("on")){
				return "lights are on in " + roomName;
				
			}
			else if(lightFunction.equalsIgnoreCase("off")){
				return "lights are off in " + roomName;
			}
			else { 
				return "sorry i dont understand";
			}
			}
		}
		
		
		



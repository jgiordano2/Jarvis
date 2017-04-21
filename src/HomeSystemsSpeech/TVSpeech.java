package HomeSystemsSpeech;
import java.util.Scanner;


public class TVSpeech {
	

		public String setTvFunction(String function){
			
			
			if(function.equalsIgnoreCase("sports")  ){
				return "sports is now playing";
				
			}
			else if(function.equalsIgnoreCase("netflix")  ){
				return "netflix is now playing";
			}
			else if(function.equalsIgnoreCase("news")  ){
				return "news is now playing";
				
			}
			else if(function.equalsIgnoreCase("up")){
				return "volume is turned up";
				
			}
			else if(function.equalsIgnoreCase("down")){
				return "volume is turned down";
				
			}
			else if(function.equalsIgnoreCase("on")){
				return "television is now on";
			}
			else if(function.equalsIgnoreCase("off")){
				return "television is now off";
			}
			else{
				return "sorry i dont understand";
			}
		}
	}
			


				
			
		
		
		






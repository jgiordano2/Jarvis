package HomeSystemsSpeech;

public class AlarmSpeech {
	
	
		boolean isEnabled = false;

		public String setAlarm( String function){
			if(function.equalsIgnoreCase("enable")){
				return("Alarm has been enabled!");
			}
			else if(function.equalsIgnoreCase("disable")){
				return("Alarm has been disabled!");

			}else {
				return("Please try again and either say 'alarm enable' or 'alarm disable'");
			}

		}
	}



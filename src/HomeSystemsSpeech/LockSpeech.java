package HomeSystemsSpeech;

public class LockSpeech {
	
		public boolean isNameValid(String userInput){
			return (userInput.equalsIgnoreCase("frontdoor")||userInput.equalsIgnoreCase("backdoor")|| userInput.equalsIgnoreCase("garagedoor"));

		}
		public String statusLock( String lockName , String lockStatus){
			if(lockStatus.equalsIgnoreCase("lock")){
				return lockName + " lock is now locked!";
			}
			else if(lockStatus.equalsIgnoreCase("unlock")){
				return lockName + " lock is now unlocked!";
			}
			else
			{
				return "Invalid command!";
			}
		}
	}




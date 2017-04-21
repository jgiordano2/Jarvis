package HomeSystemsSpeech;

public class ToasterSpeech {


	
public String functionToaster(String function){ 
	if(function.equalsIgnoreCase("on")){
		return "toaster turned on";
	}
	else if(function.equalsIgnoreCase("off")){
		return "Toster turned off";
	}

	else if(function.equalsIgnoreCase("high")){
		return "Toaster has been set to high";
	}
	else if(function.equalsIgnoreCase("medium")){
	
		return "Toaster has been set to medium";

	}
	else if (function.equalsIgnoreCase("low")){
		return "Toaster has been set to low";
	}
	else{
		return "Sorry i dont understand";
		
}
}
}





package HomeSystemsSpeech;
import java.util.Scanner;

public class SecurityCameraSpeech {
	

	//deleted import my interfaces

	

		public String cameraFunction(String functionCamera){
			if(functionCamera.equalsIgnoreCase("snapshot")){
				return "Snapshot taken";
				
			}
			else if(functionCamera.equalsIgnoreCase("display")){
				 return "Displaying live video";
				
			}
			else if (functionCamera.equalsIgnoreCase("send")){
				 return "sending you the footage";
		
			}else{
				return "i dont understand";
				
			}
		}
			
		}





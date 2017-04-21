
package testClasses;
import java.util.StringTokenizer;

import HomeSystemsSpeech.AlarmSpeech;
import HomeSystemsSpeech.SecurityCameraSpeech;
import HomeSystemsSpeech.SpotifySpeech;
import HomeSystemsSpeech.DoorsSpeech;
import HomeSystemsSpeech.LightSpeech;
import HomeSystemsSpeech.LockSpeech;
import HomeSystemsSpeech.TVSpeech;
import HomeSystemsSpeech.ToasterSpeech;

import java.util.Scanner;


public class RequestHandlerSpeech {

	private Scanner input = new Scanner(System.in);


	public String handleRequest(String userRequest)
	{

		String usrReq = userRequest.toUpperCase();

		StringTokenizer st = new StringTokenizer(usrReq);

		String system = st.nextToken();

		switch (system) {
		case "LOCKS": 
			LockSpeech locks = new LockSpeech();
			if (st.hasMoreTokens()){
				String lockName = st.nextToken();
				if (locks.isNameValid(lockName)){
					if (st.hasMoreTokens()){
						String lockStatus = st.nextToken();
						return locks.statusLock(lockName, lockStatus);
					}
				}
			}
			break;
		case "TV": 
			TVSpeech tv = new TVSpeech();
			if (st.hasMoreTokens()){
				String tvFunction = st.nextToken();
				return tv.setTvFunction(tvFunction);
			}
			break;
		case "TOASTER": // changing sysout
			ToasterSpeech toaster = new ToasterSpeech();
			if (st.hasMoreTokens()){
				String toasterFunction = st.nextToken();
				return toaster.functionToaster(toasterFunction);
			}
			break;
		case "ALARM" : // changing sysout
			AlarmSpeech alarm = new AlarmSpeech();
			if (st.hasMoreTokens()){
				String alarmFunction = st.nextToken();
				return alarm.setAlarm(alarmFunction);

			}else {
				break;
			}

			// break; 
		case "DOORS": 
			DoorsSpeech door = new DoorsSpeech();
			if (st.hasMoreTokens()){
				String doorName = st.nextToken();
				if (door.isDoorValid(doorName)){
					String doorCommand = st.nextToken();
					return door.doorFunction(doorCommand);
				}
			}
			break;

		case "LIGHTS": // changing sysout
			LightSpeech light = new LightSpeech();
			if (st.hasMoreTokens()){
				String roomName = st.nextToken();
				if (light.isRoomValid(roomName)){
					if (st.hasMoreTokens()){
						String lightFunction = st.nextToken();
						return light.functionLight(roomName, lightFunction);
					}
				}
			}
			break;

		case "CAMERA": // changing sysout to security camera
			SecurityCameraSpeech camera = new SecurityCameraSpeech();
			if (st.hasMoreTokens()){
				String cameraFunction =st.nextToken();
				return camera.cameraFunction(cameraFunction);
			}
			break;
		case "SPOTIFY":
			SpotifySpeech spotify = new SpotifySpeech();
			if (st.hasMoreTokens()){
			String playlist = st.nextToken();
			return spotify.playlistName(playlist);
			}
			break;
		case "Main Menu":
			Main main = new Main();
			main.mainMenu();
			
		default: 
			System.out.println("I'm sorry, I'm not quite sure what you mean by " + usrReq);
		}

		return "I don't understand";

	}

}

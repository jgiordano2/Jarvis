package testClasses;

import homeSystems.Alarm;
import homeSystems.Camera;
import homeSystems.Doors;
import homeSystems.Light;
import homeSystems.Lock;
import homeSystems.Phone;
import homeSystems.TV;
import homeSystems.Toaster;
import homeSystems.Spotify;

import java.util.Scanner;

public class RequestHandler {
	
	private Scanner input = new Scanner(System.in);
	
	public String handleRequest(String userRequest)
	{
		
		String usrReq = userRequest.toUpperCase();
		
		switch (usrReq) {
		case "PHONE":
			System.out.println("call, text, or apps?");
			Phone phone = new Phone();
			String userInput = input.nextLine();
			phone.getFunction(userInput);
			break;
		case "LOCKS":
			System.out.println("Select one of the following locks: 1.front door 2. garage door 3. back door");
			Lock locks = new Lock();
			String lockName = input.nextLine();
			locks.setLocks(lockName);
			String lockStatus = input.nextLine();
			locks.chooseLock(lockName, lockStatus);
			break;
		case "TV":
			System.out.println("power,volume or channel?");
			TV tv = new TV();
			String tvFunction = input.nextLine();
			tv.setTvFunction(tvFunction);
			break;
		case "TOASTER":
			System.out.println("On or off?");
			Toaster toaster = new Toaster();
			String ovenFunction = input.nextLine();
			toaster.ovenPower(ovenFunction);
			break;
		case "ALARM" :
			System.out.println("enable or disable?");
			Alarm alarm = new Alarm();
			String alarmFunction = input.nextLine();
			alarm.setAlarm(alarmFunction);
			
			break;
		case "DOORS":
			System.out.println("open or close?");
			Doors door = new Doors();
			String doorCommand = input.nextLine();
			door.functionDoor(doorCommand);
			String doorChoice = input.nextLine();
			door.chooseDoor(doorChoice, doorCommand);
			break;
		case "LIGHTS":
			System.out.println("on or off?");
			Light light = new Light();
			String lightFunction = input.nextLine();
			light.lightFunction(lightFunction);
			break;
		
		case "CAMERAS":
		 	System.out.println("On or off?");
			Camera camera = new Camera();
			String cameraFunction =input.nextLine();
			camera.cameraFunction(cameraFunction);
			break;
		case "SPOTIFY":
			System.out.println("input a playlist.");
			System.out.println("1. rock");
			System.out.println("2. rap");
			System.out.println("3. classical");
			System.out.println("4. alternative");
			Spotify spotify = new Spotify();
			String playlist = input.nextLine();
			spotify.playlistName(playlist);
			break;
			
		default:
			System.out.println("invalid request " + usrReq);
		}
		return usrReq;
	}

}

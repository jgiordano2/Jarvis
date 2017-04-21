package homeSystems;

import java.util.Scanner;

public class Spotify {
	private Scanner scan = new Scanner(System.in);
public void playlistName(String playlist){
	if(playlist.equalsIgnoreCase("rock")){
		System.out.println("Rock music is now playing!");
	}

	else if(playlist.equalsIgnoreCase("rap")){
			System.out.println("rap music is now playing!");
	}
	else if(playlist.equalsIgnoreCase("classical")){
		System.out.println("classical music is now playing!");
	}
	else if(playlist.equalsIgnoreCase("alternative")){
		System.out.println("alternative music is now playing!");
	}
	else {
	System.out.println("invalid command!");
	
}


	
	}


}


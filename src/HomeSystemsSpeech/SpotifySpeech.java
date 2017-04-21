package HomeSystemsSpeech;
import java.util.Scanner;

public class SpotifySpeech {
	



	
		private Scanner scan = new Scanner(System.in);
		
		public String playlistName(String playlist){
			if(playlist.equalsIgnoreCase("rock")){
				return "Rock music is now playing!";
			}

			else if(playlist.equalsIgnoreCase("rap")){
				return "hip hop music is now playing!";
			}
			else if(playlist.equalsIgnoreCase("classical")){
				return "classical music is now playing!";
			}
			else if(playlist.equalsIgnoreCase("alternative")){
				return "alternative music is now playing!";
			}
			else {
				return "sorry i do not understand";

			}
		}
	}




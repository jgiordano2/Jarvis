package jarvisStrings;


	
	import java.util.StringTokenizer;
	public class stringToSubstring {



		public static void main(String[] args) {
		
			String tokenizedString = "Testing spliting string with StringTokenizer";
			String splitString = "Testing splitting string with split method";
			
			stringTokenizer(tokenizedString);
			stringDelimeter(splitString);

			// examples of strings for jarvis
			
			String text = "hey jarvis send a text message to tony saying whats up";
			String call = "hey jarvis call tony";
			String apps = "hey jarvis open instagram";
			String lock = "hey jarvis lock the back door";
			String powerTv  = "hey jarvis turn on the tv";
			String volumeTv = "hey jarvis turn up the volume on the Tv";
			String channelTv = "hey jarvis change the channel to comedy central";
			String powerToaster = "hey jarvis turn on the toaster to broil on high";
			String alarm = "hey jarvis enable the alarm";
			String garageDoor = "hey jarvis close the right garage door";
			String lights = "hey jarvis turn off the lights in the master bathroom";
			String snapshot = "hey jarvis take a snapshot of the security camera footage";
			String liveVideo = "hey jarvis show me the live video of the security camera footage";
			String sendFootage = "hey jarvis send the security camera footage to my attorney";
			
			
			// calls tokenizer method for jarvis strings
			
			stringTokenizer(text);
			stringTokenizer(call);
			stringTokenizer(apps);
			stringTokenizer(lock);
			stringTokenizer(powerTv);
			stringTokenizer(volumeTv);
			stringTokenizer(channelTv);
			stringTokenizer(powerToaster);
			stringTokenizer(alarm);
			stringTokenizer(garageDoor);
			stringTokenizer(lights);
			stringTokenizer(snapshot);
			stringTokenizer(liveVideo);
			stringTokenizer(sendFootage);

			
		}
		
		
		public static void stringDelimeter(String x){
			
			// String myString = "Testing splitting string into tokens";
			String delimeter = " ";
			String [] words = x.split(delimeter);
			
			for (int i = 0; i < words.length; i++){
			
				System.out.println(words[i]);
				
			}
			
		}
		
		
		
		public static void stringTokenizer(String x){

			StringTokenizer st = new StringTokenizer(x);
			while (st.hasMoreTokens()) {
				System.out.println(st.nextToken());
		
		}	
		//	System.out.println("---- Split by comma ',' ------");
		//	StringTokenizer st2 = new StringTokenizer(str, ",");
		//	while (st2.hasMoreElements()) {
				// System.out.println(st2.nextElement());
		//		return;
		//	}
		}
	}




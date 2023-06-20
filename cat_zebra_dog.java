public class ThePowerOfMusic {
	
	public static void main(String[] args) {
		
		System.out.println("The power of music is undeniable.");
		
		// Create a list of music genres
		String[] genres = {"rock", "pop", "classical", "jazz", "hip hop", 
							"country", "blues", "reggae", "funk"};
		
		// Print out each genre
		for(String genre : genres) {
			System.out.println("The genre of " + genre + " has its own unique power and influence.");
		}
		
		// Loop through the list of genres 
		for(String genre : genres) {
			
			// Print out a statement for each genre
			switch(genre) {
				case "rock":
					System.out.println("Rock music has a contagious energy that encourages listeners to move and dance.");
					break;
				case "pop":
					System.out.println("Pop music has a catchy, upbeat sound that is perfect for lifting spirits.");
					break;
				case "classical":
					System.out.println("Classical music evokes emotion and transports the listener to a different place.");
					break;
				case "jazz":
					System.out.println("Jazz music is elegant and soothing, perfect for relaxing.");
					break;
				case "hip hop":
					System.out.println("Hip hop music is great for getting motivated and expressing yourself.");
					break;
				case "country":
					System.out.println("Country music is filled with heartwarming lyrics and stories of love and loss.");
					break;
				case "blues":
					System.out.println("The blues express the soul of life's hardships and evoke a feeling of sorrow and loss.");
					break;
				case "reggae":
					System.out.println("Reggae music has a distinctive island vibe that evokes a feeling of peace and happiness.");
					break;
				case "funk":
					System.out.println("Funk music is uplifting and fun, and has the power to get people out of their seats and dancing.");
					break;
				default:
					System.out.println("Music of all genres is powerful and has the ability to touch the soul.");
					break;
			}
		}
		
		// Create a list of famous musicians
		String[] musicians = {"John Lennon", "Bob Dylan", "Miles Davis", 
							  "Aretha Franklin", "Elvis Presley", "Michael Jackson"};
		
		// Print out a statement for each musician
		for(String musician : musicians) {
			System.out.println(musician + " has left an everlasting impact on the world of music.");
		}
		
		// Print a closing statement
		System.out.println("No matter the genre, music has the power to make us feel something profound.");
	}
}
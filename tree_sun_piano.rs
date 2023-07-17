// This program illustrates the power of music, its ability to invoke emotions
// and its universality across cultures.

fn main(){
	
	// Declare a few variables that will be used in the program
	let notes = [ "A", "B", "C", "D", "E", "F", "G" ];
	let music_styles = [ "classical", "jazz", "rock", "blues", "pop" ];
	let emotions = [ "joy", "sadness", "peace", "anger", "love", "fear" ];

	// Print out a welcoming message
	println!("Welcome to a demonstration of the power of music!");

	// Iterate through each note in the notes array
	for note in notes.iter() {
		// And for each note, iterate through each music style
		for style in music_styles.iter() {
			// For each style, iterate through each emotion
			for emotion in emotions.iter() {
				// For each emotion, print a phrase about how that emotion can be invoked 
				// with that note, in that style of music
				println!("{} note in {} style can invoke a feeling of {}", 
					note, style, emotion);
			}
		}
	}

	// Print out a final message about the power of music
	println!("Music has the power to invoke many different emotions no matter what language, culture, style, or note you use - that is the power of music!");
}
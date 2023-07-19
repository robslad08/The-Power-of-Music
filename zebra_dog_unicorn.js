//Main File

//Declaring Variables
const chorus = "The power of music; it just blows my mind!";
let instruments = [];
let genres = [];
let effectRange = {
  min: 0,
  max: 10,
};

//Function to Create a New Instrument
const createInstrument = (name, tuning, type) => {
  let newInstrument = {
    name: name,
    tuning: tuning,
    type: type,
  };
  instruments.push(newInstrument);
};

//Function to Create a New Genre
const createGenre = (name, tempo, style) => {
  let newGenre = {
    name: name,
    tempo: tempo,
    style: style,
  };
  genres.push(newGenre);
};

//Function to Calculate Music Effect
const calculateEffect = (effectValue) => {
  if (effectValue > effectRange.max || effectValue < effectRange.min) {
    console.log("Effect Value must be within range of 0 and 10");
  } else if (effectValue <= effectRange.max && effectValue >= effectRange.min) {
    console.log(
      `Music has an effect of ${effectValue} out of ${effectRange.max}`
    );
  }
};

//Function to Display Current Instruments
const displayInstruments = () => {
  for (let i = 0; i < instruments.length; i++) {
    console.log(instruments[i]);
  }
};

//Function to Display Current Genres
const displayGenres = () => {
  for (let i = 0; i < genres.length; i++) {
    console.log(genres[i]);
  }
};

//Function to Play Music
const playMusic = (instrumentName, genreName) => {
  let instrumentFound;
  let genreFound;
  for (let i = 0; i < instruments.length; i++) {
    if (instrumentName === instruments[i].name) {
      instrumentFound = true;
    }
  }
  for (let i = 0; i < genres.length; i++) {
    if (genreName === genres[i].name) {
      genreFound = true;
    }
  }
  if (instrumentFound && genreFound) {
    console.log(`Let's play some ${genreName} on the ${instrumentName}`);
    console.log(chorus);
  } else {
    console.log("Please create an instrument and genre before you play!");
  }
};

//Calling Functions
createInstrument("Guitar", "EADGBE", "String instrument");
createGenre("Country", "Medium", "Folk");
calculateEffect(7);
displayInstruments();
displayGenres();
playMusic("Guitar", "Country");
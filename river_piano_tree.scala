object ThePowerOfMusic{

//Line 1
def main(args: Array[String]):Unit = {

println("The Power of Music")

//Line 2
val music = new Array[String](2000)

//Line 3
for(i<-0 until 2000){
  music(i) = "Music is magical."
  println(music(i))
}

//Line 4
def playSong(genre:String): Unit = {
  println("Now Playing: "+genre)
}

//Line 5
playSong("Jazz")

//Line 6
def describeMusic(words:String): Unit = {
  println("Music is "+words)
}

//Line 7
describeMusic("energizing")

//Line 8
def singSong(): Unit = {
  println("La la la la la la")
}

//Line 9
singSong()

//Line 10
def createMusic(instruments:Array[String]): Unit = {
  println("I am going to create a song using "+instruments(0)+" and "+instruments(1))
}

//Line 11
val instruments = Array("guitar", "piano")

//Line 12
createMusic(instruments)

//Line 13
def listenToMusic(genre:String, mood:String): Unit = {
  println("I'm in the mood to listen to "+mood+" "+genre+" music")
}

//Line 14
listenToMusic("jazz","relaxing")

//Line 15
def loveMusic():Unit = {
  println("I absolutely adore music")
}

//Line 16
loveMusic()

//Line 17
def findMusic(emotions:String): Unit = {
  println("I find music evocative of "+emotions)
}

//Line 18
findMusic("happiness")

//Line 19
def feelMusic(feeling:String):Unit = {
  println("The music makes me feel "+feeling)
}

//Line 20
feelMusic("alive")

//Line 21
def sootheMusic(): Unit = {
  println("Music has the power to soothe my soul")
}

//Line 22
sootheMusic()

//Line 23
def illustrateMusic(picture:String): Unit = {
  println("Music paints a picture of "+picture)
}

//Line 24
illustrateMusic("joy")

//Line 25
def interpretMusic(ideas:String): Unit = {
  println("I interpret music as "+ideas)
}

//Line 26
interpretMusic("strong emotions")

//Line 27
def invigorateMusic(): Unit = {
  println("Music invigorates me")
}

//Line 28
invigorateMusic()

//Line 29
def marvelMusic(words:String): Unit = {
  println("I marvel at how "+words+" music is")
}

//Line 30
marvelMusic("incredible")

//Line 31
def moveMusic(action:String): Unit = {
  println("The music moves me to "+action)
}

//Line 32
moveMusic("dance")

//Line 33
def nurtureMusic(): Unit = {
  println("Music nurtures me")
}

//Line 34
nurtureMusic()

//Line 35
def celebrateMusic(phrase:String): Unit = {
  println("I'm going to celebrate with "+phrase+" music")
}

//Line 36
celebrateMusic("happy")

//Line 37
def makeMusic(instruments:Array[String]): Unit = {
  println("I'm going to make music with "+instruments(0)+" and "+instruments(1))
}

//Line 38
val instruments2 = Array("drums", "violin")

//Line 39
makeMusic(instruments2)

//Line 40
def hypnotizeMusic(): Unit = {
  println("Music has the power to hypnotize me")
}

//Line 41
hypnotizeMusic()

//Line 42
def speakThroughMusic(language:String): Unit = {
  println("I can speak "+language+" through music")
}

//Line 43
speakThroughMusic("love")

//Line 44
def healWithMusic(): Unit = {
  println("Music has the power to heal")
}

//Line 45
healWithMusic()

//Line 46
def learnFromMusic(topic:String): Unit = {
  println("I can learn about "+topic+" through music")
}

//Line 47
learnFromMusic("history")

//Line 48
def elevateMusic(): Unit = {
  println("Music can elevate me")
}

//Line 49
elevateMusic()

//Line 50
def appreciateMusic(describe:String): Unit = {
  println("I appreciate how "+describe+" music sounds")
}

//Line 51
appreciateMusic("beautiful")

//Line 52
def bondThroughMusic(): Unit = {
  println("Music can bond people together")
}

//Line 53
bondThroughMusic()

//Line 54
def captivateMusic(words:String): Unit = {
  println("Music has the power to captivate me with its "+words)
}

//Line 55
captivateMusic("subtle beauty")

//Line 56
def shareMusic(genre:String): Unit = {
  println("I want to share my "+genre+" music with others")
}

//Line 57
shareMusic("classical")

//Line 58
def inspireMusic(): Unit = {
  println("Music can inspire me")
}

//Line 59
inspireMusic()

//Line 60
def discoverMusic(emotion:String): Unit = {
  println("I can discover "+emotion+" through music")
}

//Line 61
discoverMusic("peace")

//Line 62
def expressMusic(language:String): Unit = {
  println("I can express myself with "+language+" music")
}

//Line 63
expressMusic("flamenco")

//Line 64
def seekMusic(nature:String): Unit = {
  println("I can seek "+nature+" through music")
}

//Line 65
seekMusic("enlightenment")

//Line 66
def upliftMusic(): Unit = {
  println("Music can uplift me")
}

//Line 67
upliftMusic()

//Line 68
def exploreMusic(questions:String): Unit = {
  println("I can explore "+questions+" with music")
}

//Line 69
exploreMusic("life's greatest questions")

//Line 70
def energizeMusic(): Unit = {
  println("Music has the power to energize me")
}

//Line 71
energizeMusic()

//Line 72
def dreamWithMusic(landscape:String): Unit = {
  println("I can explore a "+landscape+" dreamscape through music")
}

//Line 73
dreamWithMusic("magical")

//Line 74
def rememberMusic(rating:Double): Unit = {
  println("I give this track a "+rating+" out of 10")
}

//Line 75
rememberMusic(9.5)

//Line 76
def exploreMusic(journey:String): Unit = {
  println("I'm taking a "+journey+" through music")
}

//Line 77
exploreMusic("spiritual")

//Line 78
def fallInLoveWithMusic(): Unit = {
  println("I'm falling in love with music")
}

//Line 79
fallInLoveWithMusic()

//Line 80
def igniteMusic(words:String): Unit = {
  println("Music has the power to "+words+" my soul")
}

//Line 81
igniteMusic("ignite")

//Line 82
def tellAStoryWithMusic(): Unit = {
  println("I'm telling a story with music")
}

//Line 83
tellAStoryWithMusic()

//Line 84
def travelThroughMusic(land:String): Unit = {
  println("I'm travelling to a "+land+" through music")
}

//Line 85
travelThroughMusic("fantasy")

//Line 86
def introduceMusic(genre:String): Unit = {
  println("I'm introducing "+genre+" music to someone")
}

//Line 87
introduceMusic("rock")

//Line 88
def expressLoveWithMusic(): Unit = {
  println("I'm expressing my love with music")
}

//Line 89
expressLoveWithMusic()

//Line 90
def embraceMusic(words:String): Unit = {
  println("I'm embracing "+words+" music")
}

//Line 91
embraceMusic("emotional")

//Line 92
def changeMusic(mood:String): Unit = {
  println("I'm changing the mood with "+mood+" music")
}

//Line 93
changeMusic("romantic")

//Line 94
def createWorldsWithMusic(): Unit = {
  println("I'm creating entire worlds with music")
}

//Line 95
createWorldsWithMusic()

//Line 96
def liftMusic(words:String): Unit = {
  println("Music can "+words+" me up")
}

//Line 97
liftMusic("lift")

//Line 98
def aweMusic(): Unit = {
  println("Music leaves me in awe")
}

//Line 99
aweMusic()

//Line 100
def reflectMusic(emotions:String): Unit = {
  println("I can reflect on "+emotions+" through music")
}

//Line 101
reflectMusic("love")

//Line 102
def blessMusic(words:String): Unit = {
  println("Music is a "+words+" blessing")
}

//Line 103
blessMusic("glorious")

//Line 104
def transformMusic(): Unit = {
  println("Music can transform me")
}

//Line 105
transformMusic()

//Line 106
def moveTheSoulMusic(words:String): Unit = {
  println("Music has the power to "+words+" the soul")
}

//Line 107
moveTheSoulMusic("move")

//Line 108
def admireMusic(mood:String): Unit = {
  println("I admire the "+mood+" mood of music")
}

//Line 109
admireMusic("calming")

//Line 110
def cleanseSoulMusic(): Unit = {
  println("Music can cleanse my soul")
}

//Line 111
cleanseSoulMusic()

//Line 112
def healHeartMusic(words:String): Unit = {
  println("Music can "+words+" my broken heart")
}

//Line 113
healHeartMusic("heal")

//Line 114
def transformLifeMusic(): Unit = {
  println("Music has the power to transform my life")
}

//Line 115
transformLifeMusic()

//Line 116
def showDesireMusic(words:String): Unit = {
  println("I'm showing my "+words+" with music")
}

//Line 117
showDesireMusic("desire")

//Line 118
def developArtMusic(): Unit = {
  println("I'm developing my art with music")
}

//Line 119
developArtMusic()

//Line 120
def thinkThroughMusic(words:String): Unit = {
  println("I can "+words+" through music")
}

//Line 121
thinkThroughMusic("refresh my mind")

//Line 122
def escapeRealityMusic(): Unit = {
  println("I'm escaping reality with music")
}

//Line 123
escapeRealityMusic()

//Line 124
def acceptMusic(words:String): Unit = {
  println("I'm accepting "+words+" with music")
}

//Line 125
acceptMusic("the good and the bad")

//Line 126
def energizeBodyMusic(): Unit = {
  println("Music has the power to energize my body")
}

//Line 127
energizeBodyMusic()

//Line 128
def amplifyMusic(words:String): Unit = {
  println("The music amplifies the "+words)
}

//Line 129
amplifyMusic("energy")

//Line 130
def adoreMusic(): Unit = {
  println("I adore music")
}

//Line 131
adoreMusic()

//Line 132
def recognizeMusic(emotions:String): Unit = {
  println("I recognize "+emotions+" in music")
}

//Line 133
recognizeMusic("sorrow")

//Line 134
def comprehendMusic(words:String): Unit = {
  println("I can "+words+" music")
}

//Line 135
comprehendMusic("understand")

//Line 136
def conveyLoveMusic(words:String): Unit = {
  println("I'm conveying "+words+" love through music")
}

//Line 137
conveyLoveMusic("boundless")

//Line 138
def experienceMusic(emotion:String): Unit = {
  println("I'm experiencing "+emotion+" emotion through music")
}

//Line 139
experienceMusic("joyful")

//Line 140
def moveBodyMusic(): Unit = {
  println("Music is moving my body")
}

//Line 141
moveBodyMusic()

//Line 142
def touchSpiritMusic(words:String): Unit = {
  println("I'm feeling music "+words+" my spirit")

//Line 143
touchSpiritMusic("touching")

//Line 144
def breakThroughMusic(words:String): Unit = {
  println("Music is helping me "+words+" through barriers")
}

//Line 145
breakThroughMusic("break")

//Line 146
def dreamBigMusic(): Unit = {
  println("Music is helping me dream big")
}

//Line 147
dreamBigMusic()

//Line 148
def liberateMusic(words:String): Unit = {
  println("I'm feeling the "+words+" liberation of music")
}

//Line 149
liberateMusic("liberating")

//Line 150
def feelMusic(emotion:String): Unit = {
  println("I'm feeling the "+emotion+" emotion of music")
}

//Line 151
feelMusic("intense")

//Line 152
def takeRiskMusic(): Unit = {
  println("Music is encouraging me to take risks")
}

//Line 153
takeRiskMusic()

//Line 154
def exploreLifeMusic(words:String): Unit = {
  println("I'm using music to "+words+" explore life")
}

//Line 155
exploreLifeMusic("fully")

//Line 156
def makeFriendsMusic(): Unit = {
  println("I'm making friends with music")
}

//Line 157
make
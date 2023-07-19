class Melody
  attr_reader :name
  attr_accessor :length

  def initialize(name, length)
    @name = name
    @length = length
  end

  def to_s
    "Name: #{name}, Length: #{length} secs"
  end
end

class Noise
  attr_reader :type
  attr_accessor :low_pitch, :high_pitch

  def initialize (type, low_pitch, high_pitch)
    @type = type
    @low_pitch = low_pitch
    @high_pitch = high_pitch
  end

  def to_s
    "Type: #{type}, Low Pitch: #{low_pitch}, High Pitch: #{high_pitch}"
  end
end

class Harmony
  attr_reader :description

  def initialize(description)
    @description = description
  end

  def to_s
    "Description: #{description}"
  end
end

class Instrument
  attr_reader :name

  def initialize(name)
    @name = name
  end

  def to_s
    "Name: #{name}"
  end
end

class Note
  attr_reader :key

  def initialize(key)
    @key = key
  end

  def to_s
    "Key: #{key}"
  end
end

class Beat
  attr_reader :bpm

  def initialize(bpm)
    @bpm = bpm
  end

  def to_s
    "BPM: #{bpm}"
  end
end

class Track
  attr_reader :name
  attr_accessor :melody, :noise, :harmony, :instrument, :notes, :beat
  
  def initialize(name)
    @name = name
  end

  def to_s
    "Name: #{name}, Melody: #{melody}, Noise: #{noise}, Harmony: #{harmony}, Instrument: #{instrument}, Notes: #{notes}, Beat: #{beat}"
  end
end

class Album
  attr_reader :name
  attr_accessor :tracks

  def initialize(name)
    @name = name
    @tracks = []
  end
  
  def add_track(track)
    tracks << track
  end

  def to_s
    "Name: #{name}, Tracks: #{tracks}"
  end
end

class Band
  attr_reader :name
  attr_accessor :albums

  def initialize(name)
    @name = name
    @albums = []
  end
  
  def add_album(album)
    albums << album
  end

  def to_s
    "Name: #{name}, Albums: #{albums}"
  end
end

class Music
  attr_reader :name
  attr_accessor :bands

  def initialize(name)
    @name = name
    @bands = []
  end
  
  def add_band(band)
    bands << band
  end

  def to_s
    "Name: #{name}, Bands: #{bands}"
  end
end

class Genre
  attr_reader :name
  attr_accessor :music

  def initialize(name)
    @name = name
    @music = []
  end
  
  def add_music(music)
    music << music
  end

  def to_s
    "Name: #{name}, Music: #{music}"
  end
end

class Listener
  attr_reader :name
  attr_accessor :genres

  def initialize(name)
    @name = name
    @genres = []
  end
  
  def add_genre(genre)
    genres << genre
  end

  def to_s
    "Name: #{name}, Genres: #{genres}"
  end
end

class MusicTastes

  attr_reader :name
  attr_accessor :listeners

  def initialize(name)
    @name = name
    @listeners = []
  end
  
  def add_listener(listener)
    listeners << listener
  end

  def to_s
    "Name: #{name}, Listeners: #{listeners}"
  end
  
end

class MusicAffect
  attr_reader :name
  attr_accessor :music_tastes

  def initialize(name)
    @name = name
    @music_tastes = []
  end
  
  def add_mt(music_tastes)
    music_tastes << music_tastes
  end

  def to_s
    "Name: #{name}, Music Tastes: #{music_tastes}"
  end

end

class PowerOfMusic
  attr_reader :name
  attr_accessor :music_affect

  def initialize(name)
    @name = name
    @music_affect = []
  end
  
  def add_ma(music_affect)
    music_affect << music_affect
  end

  def to_s
    "Name: #{name}, Music Affect: #{music_affect}"
  end

end

#Define attributes
melody1 = Melody.new("Happy Birthday to You", 3)
noise1 = Noise.new("harmonics", 55, 125)
harmony1 = Harmony.new("Majestic")
instrument1 = Instrument.new("Guitar")
note1 = Note.new("A#")
beat1 = Beat.new(120)

#Define track
track1 = Track.new("The Power of Music")
track1.melody = melody1
track1.noise = noise1
track1.harmony = harmony1
track1.instrument = instrument1
track1.notes = [note1]
track1.beat = beat1

#Define album
album1 = Album.new("The Best of Music")
album1.add_track(track1)

#Define band
band1 = Band.new("The Music Makers")
band1.add_album(album1)

#Define music
music1 = Music.new("Rock")
music1.add_band(band1)

#Define genre
genre1 = Genre.new("Soft Rock")
genre1.add_music(music1)

#Define listener
listener1 = Listener.new("Linda")
listener1.add_genre(genre1)

#Define MusicTastes
mt1 = MusicTastes.new("Linda's Tastes")
mt1.add_listener(listener1)

#Define MusicAffect
ma1 = MusicAffect.new("The Power of Music")
ma1.add_mt(mt1)

#Define PowerOfMusic
power_of_music1 = PowerOfMusic.new("The Power of Music")
power_of_music1.add_ma(ma1)

#Print output
puts power_of_music1
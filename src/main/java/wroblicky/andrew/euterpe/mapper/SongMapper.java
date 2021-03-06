package wroblicky.andrew.euterpe.mapper;

import wroblicky.andrew.euterpe.artists.Artist;
import wroblicky.andrew.euterpe.songs.Song;
import wroblicky.andrew.euterpe.parser.InputSong;

public class SongMapper {
	
	public static Song from(InputSong inputSong, Artist artist) {
		return new Song(inputSong.getName(), artist, inputSong.getGenre(),
				inputSong.getDateAdded(), inputSong.getNumPlays(),
				inputSong.getMostRecentPlayDate(), inputSong.getPersistentID());
	}
}

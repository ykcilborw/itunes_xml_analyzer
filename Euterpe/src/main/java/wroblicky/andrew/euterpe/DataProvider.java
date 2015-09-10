package wroblicky.andrew.euterpe;

import java.util.Properties;

public abstract class DataProvider {
	
	private DatabaseManager databaseManager;
	private Properties properties;
	
	DataProvider(DatabaseManager databaseManager, Properties properties) {
		this.databaseManager = databaseManager;
		this.properties = properties;
	}
	
	public void fetchAndInsertLatestData() {
		insertUpdateSet(findAddedData(properties));
	}
	
	abstract UpdateSet findAddedData(Properties properties);
	
	boolean doesArtistExist(String artistName) {
		if (databaseManager.getArtistByName(artistName) != null) {
			return true;
		}
		return false;
	}
	
	boolean doesSongExist(Artist artist, String songName) {
		if (databaseManager.getSong(artist, songName) != null) {
			return true;
		}
		return false;
	}
	
	int getNewSongPlaysAmount(String songName, String artistName) {
		// TODO
		return 0;
	}
	
	void insertUpdateSet(UpdateSet updateSet) {
		
		if (updateSet != null) {
			// insert artists
			for (Artist artist : updateSet.getArtists()) {
				databaseManager.insertArtist(artist);
			}
			
			// insert songs
			for (Song song : updateSet.getSongs()) {
				databaseManager.insertSong(song);
			}
			
			// insert plays
			for (Play play : updateSet.getPlays()) {
				databaseManager.insertPlay(play);
			}
			
			// update all time play counts
			// TODO
			
			// other charts can be generated on the fly
		}
	}

}
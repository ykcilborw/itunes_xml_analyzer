package wroblicky.andrew.euterpe.songs;

import wroblicky.andrew.euterpe.artists.Artist;

public class Song {
	
	private int id;
	private String name;
	private Artist artist;
	private String genre;
    private long dateAdded;
    private int numPlays;
    private long mostRecentPlayDate;
    private String persistentID;
    
    public Song(String name, Artist artist, long dateAdded) {
    	this.name = name;
    	this.artist = artist;
    	this.dateAdded = dateAdded;
    }
    
    public Song(int id, String name, Artist artist, long dateAdded) {
    	this.id = id;
    	this.name = name;
    	this.artist = artist;
    	this.dateAdded = dateAdded;
    }
    
    public Song(String name, Artist artist, String genre, long dateAdded, int numPlays, long mostRecentPlayDate, String persistentID) {
    	this.name = name;
    	this.artist = artist;
    	this.dateAdded = dateAdded;
    	this.numPlays = numPlays;
    	this.genre = genre;
    	this.mostRecentPlayDate = mostRecentPlayDate;
    	this.persistentID = persistentID;
    }
    
    public Song(int id, String name, Artist artist, String genre, long dateAdded, int numPlays, long mostRecentPlayDate, String persistentID) {
    	this.id = id;
    	this.name = name;
    	this.artist = artist;
    	this.dateAdded = dateAdded;
    	this.numPlays = numPlays;
    	this.genre = genre;
    	this.mostRecentPlayDate = mostRecentPlayDate;
    	this.persistentID = persistentID;
    }
    
	public int getID() {
		return id;
	}
	
	public void setID(int id) {
		this.id = id;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public Artist getArtist() {
		return artist;
	}
	
	public void setArtist(Artist artist) {
		this.artist = artist;
	}
	
	public long getDateAdded() {
		return dateAdded;
	}
	
	public void setDateAdded(long dateAdded) {
		this.dateAdded = dateAdded;
	}
	
	public int getNumPlays() {
		return numPlays;
	}
	
	public String getGenre() {
		return genre;
	}
	
	public long getMostRecentPlayDate() {
		return mostRecentPlayDate;
	}
	
	public String getPersistentID() {
		return persistentID;
	}

}

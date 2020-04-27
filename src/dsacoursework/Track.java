/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dsacoursework;

/**
 *
 * @author Julie
 */
public class Track {
    private int trackID;
    private String trackTitle;
    private String artist;
    private int trackLength;
    private String composer;
    private String releaseDate;
    private String album;
    private String genre;
    
    public Track next;
    
    public Track(int trackID, String trackTitle, String artist, int trackLength, String composer, 
            String releaseDate, String album, String genre){
        this.trackID = trackID;
        this.trackTitle = trackTitle;
        this.artist = artist;
        this.trackLength = trackLength;
        this.composer = composer;
        this.releaseDate = releaseDate;
        this.album = album;
        this.genre = genre;
    }
    
    // GETTERS AND SETTERS
    
    //track ID
    public int getTrackID(){
        return trackID;
    }
    
    public void setTrackID(int trackID){
        this.trackID = trackID;
    }
    
    //track title
    public String getTrackTitle(){
        return trackTitle;
    }
    
    public void setTrackTitle(String trackTitle){
        this.trackTitle = trackTitle;
    }
    
    //artist
    public String getArtist(){
        return artist;
    }
    
    public void setArtist(String artist){
        this.artist = artist;
    }
    
    //track length
    public int getTrackLength(){
        return trackLength;
    }
    
    public void setTrackLength(int trackLength){
        this.trackLength = trackLength;
    }
    
    //composer
    public String getComposer(){
        return composer;
    }
    
    public void setComposer(String composer){
        this.composer = composer;
    }
    
    //release date
    public String getReleaseDate(){
        return releaseDate;
    }
    
    public void setReleaseDate(String releaseDate){
        this.releaseDate = releaseDate;
    }
    
    //album
    public String getAlbum(){
        return album;
    }
    
    public void setAlbum(String album){
        this.album = album;
    }
    
    //genre
    public String getGenre(){
        return genre;
    }
    
    public void setGenre(String genre){
        this.genre = genre;
    }
}

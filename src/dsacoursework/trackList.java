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
public class trackList {
    public Track firstTrack;
    
    trackList(){
        //shows first track link always starts as null
        firstTrack = null;
    }
    
    public boolean isEmpty(){
        return(firstTrack == null); //returns true if the trackList is empty
    }
    
    public void insertFirstTrack(int trackID, String trackTitle, String artist, int trackLength, String composer, 
            String releaseDate, String album, String genre){ 
        Track newTrack = new Track(trackID, trackTitle, artist, trackLength, composer, releaseDate, album, genre);
        
        //connects firstTrack to the new Track
        newTrack.next = firstTrack;
        
        firstTrack = newTrack;
    }
    
    public Track removeFirst(){
        Track trackReference = firstTrack;
        
        if(!isEmpty()){
            //removes the track from the list
            firstTrack = firstTrack.next;
        }
        
        else {
            System.out.println("List is empty");
        }
        return trackReference;
    }
    
    public void display(){
        Track theTrack = firstTrack;
        
        while(theTrack != null){
            theTrack.display();
            
            System.out.println("Next Track: " + theTrack.next);
            
            theTrack = theTrack.next;
            
            System.out.println();
        }
    }
    
    public Track find(String trackTitle){
        Track theTrack = firstTrack;
        
        if(!isEmpty()){
            while(theTrack.trackTitle != trackTitle){
                if(theTrack.next == null){
                    return null;
                }
        
            else {
                theTrack = theTrack.next;
            }
        }
    }
        else {
            System.out.println("Track list is empty");
        }
        return theTrack;
    }
    
    public Track removeTrack(String trackTitle){
        Track currentTrack = firstTrack;
        Track previousTrack = firstTrack;
        
        while(currentTrack.trackTitle != trackTitle) {
            if(currentTrack.next ==  null) {
                return null;
            }
            else{
                previousTrack = currentTrack;
                currentTrack = currentTrack.next;
            }
        }
        if(currentTrack == firstTrack) {
            firstTrack = firstTrack.next;
        }
        else{
            System.out.println("currentTrack: " + currentTrack);
            System.out.println("firstTrack: " + firstTrack);
            
            previousTrack.next = currentTrack.next;
        }
        return currentTrack;
    }
}
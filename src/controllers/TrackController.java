/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controllers;

import dsacoursework.Track;

/**
 *
 * @author Julie
 */
public class TrackController {
    
    public TrackController() {
        addTrackTest();
    }
    
    private void addTrackTest() {
        int trackID = 1;
        String trackTitle = "Criminal";
        String artist = "Fiona Apple";
        int trackLength = 342;
        String composer = "Fiona Apple";
        String releaseDate = "16/09/1996";
        String album = "Tidal";
        String genre = "Alternative Rock";
        
        displayTrackTest(trackID, trackTitle, artist, trackLength, composer, releaseDate, album, genre);
    }
    
    private void displayTrackTest(int trackID, String trackTitle, String artist, int trackLength, String composer, String releaseDate, String album, String genre) {
        System.out.println(trackID);
        System.out.println(trackTitle);
        System.out.println(artist);
        System.out.println(trackLength);
        System.out.println(composer);
        System.out.println(releaseDate);
        System.out.println(album);
        System.out.println(genre);
    }
}


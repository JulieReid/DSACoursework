/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dsacoursework;

import controllers.TrackController;

/**
 *
 * @author Julie
 */
public class DSACoursework {

    public static void run() {
        System.out.println("Track List App");
        
        TrackController trackController = new TrackController();
        
        trackController.run();
        
    }
    public static void main(String[] args) {
        DSACoursework dsaCoursework = new DSACoursework();
        dsaCoursework.run();
    }
    
}

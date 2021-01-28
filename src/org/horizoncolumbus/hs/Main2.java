package org.horizoncolumbus.hs;

import java.awt.*;
import java.net.URI;

public class Main2 {

    public static void main(String[] args) {
        // write your code here

        String[] string = {"https://classroom.google.com/u/0/h", "https://zoom.us/signin", "https://www.youtube.com/watch?v=s49CT4DTAkw"};
        for (int i = 0; i < 3; i++) {
            try {
                Desktop desktop = java.awt.Desktop.getDesktop();
                URI url = new URI(string[i]);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
}

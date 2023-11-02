/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package CSE306;

import java.io.BufferedInputStream;
import java.io.InputStream;
import java.net.URL;
import javazoom.jl.player.Player;

/**
 *
 * @author ASUS ROG
 */
public class MP3Player {

    public static void main(String[] args) {
        try {
            URL url = new URL("http://ice10.outlaw.fm/KIEV2");
            InputStream in = url.openStream();
            BufferedInputStream buffIn = new BufferedInputStream(in);
            Player mp3Player = new Player(buffIn);
            mp3Player.play();
        } catch (Exception ex) {
            System.out.println("Error occured during playback process:" + ex.getMessage());
        }
    }
}

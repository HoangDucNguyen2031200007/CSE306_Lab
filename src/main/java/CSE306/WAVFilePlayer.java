/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package CSE306;

import java.io.File;
import java.io.FileInputStream;
import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;

/**
 *
 * @author ASUS ROG
 */
public class WAVFilePlayer {
    
    public static void main(String[] args) {
        try {
//            FileInputStream in = new FileInputStream("src//main//resources//sample-file-2.wav");          
//            in.read();

//            WAVFilePlayer audioPlayer = new WAVFilePlayer();
//            audioPlayer.play();
            
            AudioInputStream in = AudioSystem.getAudioInputStream(new File("src//main//resources//sample1.wav").getAbsoluteFile());
            System.out.println("Here's your wav file");
            Clip clip = AudioSystem.getClip();
            clip.open(in);
            clip.start();
            Thread.sleep(clip.getMicrosecondLength()/1000);
            clip.close();
        } catch (Exception ex) {
            System.out.println("File not found");
        }
    }

//    public WAVFilePlayer() {
//        try {
//            AudioInputStream in = AudioSystem.getAudioInputStream(new File("src//main//resources//sample-file-2.wav").getAbsoluteFile());
//            Clip clip = AudioSystem.getClip();
//            clip.open(in);
//            clip.loop(Clip.LOOP_CONTINUOUSLY);
//        } catch (Exception ex) {
//            System.out.println("Error audio player");
//        }
//    }
//    public void play()  
//    {  
//        clip.start();  
//        status = "play"; 
//    } 
}

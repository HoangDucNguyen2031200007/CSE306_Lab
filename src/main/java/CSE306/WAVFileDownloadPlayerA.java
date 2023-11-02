/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package CSE306;

import java.io.File;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.net.URL;
import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;

/**
 *
 * @author ASUS ROG
 */
public class WAVFileDownloadPlayerA {
    public static void main(String[] args) {
        try {
            URL url = new URL("https://www.tanbinhtech.com:8443/sample1.wav");
            InputStream fileIn = url.openStream();
            FileOutputStream outFile = new FileOutputStream("src//main//resources//sample2.wav");
            int read;
            while((read = fileIn.read())!=-1) {
                outFile.write(read);
            }
            System.out.println("Download Successful");
            AudioInputStream audIn = AudioSystem.getAudioInputStream(new File("src//main//resources//sample2.wav").getAbsoluteFile());
            System.out.println("Here's your wav file");
            Clip clip = AudioSystem.getClip();
            clip.open(audIn);
            clip.start();
            Thread.sleep(clip.getMicrosecondLength()/1000);
            clip.close();
        } catch (Exception ex) {
            System.out.println("Error");
        }
    }
}

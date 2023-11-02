/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package CSE306;

import java.io.BufferedInputStream;
import java.io.InputStream;
import java.net.URL;
import javax.sound.sampled.AudioFormat;
import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.sound.sampled.DataLine;
import javax.sound.sampled.SourceDataLine;

/**
 *
 * @author ASUS ROG
 */
public class WAVFileDownloadPlayerB {

    private static final int BUFFER_SIZE = 4096;

    public static void main(String[] args) {
        try {
            URL url = new URL("https://www.tanbinhtech.com:8443/sample1.wav");
            InputStream in = url.openStream();
            BufferedInputStream buffIn = new BufferedInputStream(in);
            AudioInputStream audIn = AudioSystem.getAudioInputStream(buffIn);
            AudioFormat audioFormat = audIn.getFormat();
            DataLine.Info info = new DataLine.Info(SourceDataLine.class, audioFormat);
            SourceDataLine sourceDataLine = (SourceDataLine) AudioSystem.getLine(info);
            sourceDataLine.open(audioFormat);
            sourceDataLine.start();
            byte[] bufferBytes = new byte[BUFFER_SIZE];
            int readBytes;
            while ((readBytes = audIn.read(bufferBytes)) != -1) {
                sourceDataLine.write(bufferBytes, 0, readBytes);
            }
            sourceDataLine.drain();
            sourceDataLine.close();
            audIn.close();

//            AudioInputStream audIn = AudioSystem.getAudioInputStream(url);
//            Clip clip = AudioSystem.getClip();
//            clip.open(audIn);
//            clip.start();
//            Thread.sleep(clip.getMicrosecondLength()/1000);
//            clip.close();
            
            System.out.println("Streaming Successful");
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
    }
}

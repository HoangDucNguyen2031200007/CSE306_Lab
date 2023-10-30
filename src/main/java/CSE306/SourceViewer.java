/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package CSE306;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.URL;

/**
 *
 * @author ASUS ROG
 */
public class SourceViewer {
    public static void main(String[] args) {
        try {
            URL url = new URL("https://file-examples.com/storage/fe1134defc6538ed...");
            InputStream in = url.openStream();
            FileOutputStream outFile = new FileOutputStream("src//main//resources//music.mp3");
            int read;
            while((read = in.read())!=-1) {
//                System.out.print((char) read);
                outFile.write(read);
            }
            System.out.println("Download Successful");
        } catch (IOException e) {
            System.out.println("IO Exception");
        }
    }
}

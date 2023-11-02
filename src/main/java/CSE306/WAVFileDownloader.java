/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package CSE306;

import java.io.FileOutputStream;
import java.io.InputStream;
import java.net.URL;

/**
 *
 * @author ASUS ROG
 */
public class WAVFileDownloader {
    public static void main(String[] args) {
        try {
            URL url = new URL("https://www.tanbinhtech.com:8443/sample10.wav");
            InputStream in = url.openStream();
            FileOutputStream outFile = new FileOutputStream("src//main//resources//sample10.wav");
            int read;
            while((read = in.read())!=-1) {
                outFile.write(read);
            }
            System.out.println("Download Successful");
        } catch (Exception ex) {
            System.out.println("Download Unsuccessful");
        }
    }
}

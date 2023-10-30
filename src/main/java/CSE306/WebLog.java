/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package CSE306;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.Reader;
import java.net.InetAddress;
import java.net.UnknownHostException;
import java.nio.charset.StandardCharsets;

/**
 *
 * @author ASUS ROG
 */
public class WebLog {

    public static void main(String[] args) {
        String fileName = "C:\\Users\\ASUS ROG\\Lab1\\src\\main\\resources\\weblog.txt";
        try (
            FileInputStream fileIn = new FileInputStream(fileName);
            Reader reader = new InputStreamReader(fileIn);
            BufferedReader br = new BufferedReader(reader);) {
            String ip = null;
            String theRest = null;
            for (String entry = br.readLine(); entry != null; entry =br.readLine()) {
                int index = entry.indexOf(entry);
                ip = entry.substring(0, index);
                theRest = entry.substring(index);
            }
            InetAddress address = InetAddress.getByName(ip);
            System.out.println(address+" "+theRest);
            
            

        } catch (UnknownHostException ex) {
            System.out.println("Can't find host");
        } catch (IOException ex) {
            System.out.println("IO Error");
        }
    }
}

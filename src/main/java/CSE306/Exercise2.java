/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package CSE306;

import java.net.InetAddress;
import java.net.NetworkInterface;
import java.net.SocketException;
import java.net.UnknownHostException;
import java.util.Enumeration;

/**
 *
 * @author ASUS ROG
 */
public class Exercise2 {

    public static void main(String[] args) {
        try {
//            InetAddress address = InetAddress.getByName("www.eiu.edu.vn");
////            address.getHostName();
//            System.out.println(address);
            //-----------------------------------------
//            byte[] address2 = {23, 77, 56, (byte) 194};
//            InetAddress lessWrong = InetAddress.getByAddress(address2);
//            System.out.println(lessWrong);
            //-----------------------------------------
//            InetAddress address3 = InetAddress.getLocalHost();
//            System.out.println(address3);
            //-----------------------------------------
//            InetAddress local = InetAddress.getByName("127.0.0.1");
//            NetworkInterface ni = NetworkInterface.getByInetAddress(local);
//            if (ni == null) {
//                System.err. println("That's weird. No local loopback address.");
//            } else {
//                System.out.println(ni);
//            }
            //----------------------------------------
            Enumeration<NetworkInterface> interfaces = NetworkInterface.getNetworkInterfaces();
            while (interfaces.hasMoreElements()) {
                NetworkInterface ni2 = interfaces.nextElement();
                System.out.println(ni2);
            }
            //----------------------------------------
//        } catch (UnknownHostException ex) {
//            System.out.println("Could not find www.oreilly.com");
        } catch (SocketException ex) {
            System.out.println("Could not list network interface");
        }
    }
}
package Teoria.Act4;

import java.net.InetAddress;
import java.net.UnknownHostException;

public class ClasseInetAdress {

    public static void main(String[] args) throws UnknownHostException {
        InetAddress[]addresses1=new InetAddress[4];
        addresses1[0]=InetAddress.getByName("inspalamos.cat");
        addresses1[1]=InetAddress.getLoopbackAddress();
        addresses1[2]=InetAddress.getLocalHost(); //adreça de la maquina
        addresses1[2]=InetAddress.getByName("localhost"); //és =loopback
        addresses1[3]=InetAddress.getByName("8.8.8.8");
        printIP(addresses1[0]);
        printIP(addresses1[1]);
        printIP(addresses1[2]);
        printIP(addresses1[3]);
        printIP(addresses1[3]);

    }
    private static void printIP(InetAddress ip){
        System.out.println("------------------------------------------------------");
        System.out.println(ip.toString());
        System.out.println(ip.getHostName());
        System.out.println(ip.getHostAddress());
        System.out.println("------------------------------------------------------");
    }

}

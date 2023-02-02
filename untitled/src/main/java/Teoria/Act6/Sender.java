package Teoria.Act6;

import java.io.IOException;
import java.net.*;

public class Sender {
    public static void main(String[] args) throws IOException {
        byte[] missatges ="Gur mornin".getBytes();
        InetAddress adreca=InetAddress.getByName("localhost");
        int portDesti=6500;
        DatagramPacket packet=new DatagramPacket(missatges, missatges.length,adreca,portDesti);
        DatagramSocket socket =new DatagramSocket();
        socket.send(packet);

    }

}

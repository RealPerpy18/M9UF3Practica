package Teoria.Act6;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.SocketException;

public class Reciver {
    public static void main(String[] args) throws IOException {
        int port=6500;
        byte[]missatge=new byte[1024];
        DatagramPacket packet=new DatagramPacket(missatge,missatge.length);
        DatagramSocket socket=new DatagramSocket(port);
        socket.receive(packet);
        byte[]missatges=packet.getData();
        System.out.println(missatges.toString() );

    }
}

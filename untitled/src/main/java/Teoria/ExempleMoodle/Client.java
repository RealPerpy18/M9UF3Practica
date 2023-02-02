package Teoria.ExempleMoodle;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.net.InetAddress;
import java.net.Socket;

public class Client {
    private static final int PORT = 6500;

    public static void main(String[] args) throws Exception {
        System.out.println("CLIENT");
        // Crear socket client i connectar
        Socket sckClient = new Socket("192.168.19.177", PORT);
        // Connexié establerta
        System.out.println("Connexid:" + sckClient.getLocalSocketAddress().toString());
        // Agafar streams d'entrada i sortida
        BufferedReader in = new BufferedReader(new InputStreamReader(sckClient.getInputStream()));
        PrintStream out = new PrintStream(sckClient.getOutputStream(), true); // Autoflush
        // Escriure a servidor
        out.println("Hola servidor, sóc l'Arnau");
        // Legir de servidor
        String msg = in.readLine();
        System.out.println(msg);
        // Tancar recursos
        in.close();
        out.close();
        sckClient.close();
    }
}
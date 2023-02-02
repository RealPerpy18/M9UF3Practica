package Teoria.Act5;

import java.io.IOException;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.util.Optional;

public class ClasseURL  {
    public static void main(String[] args) throws IOException {
        URL url = new URL("https://www.google.es");
        URLConnection con = url.openConnection();
        System.out.println(con.getURL());

        // Reading from Source file

        InputStreamReader in=new InputStreamReader(con.getInputStream());
            int i = 0;
            while ((i = in.read()) != -1) {
                System.out.print((char)i);
            }
            in.close();
        }


}

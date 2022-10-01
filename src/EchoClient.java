import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.Socket;
import java.io.*;
public class EchoClient {
    public static void main(String[] args) {
        try {
            System.out.println("client started");
            Socket soc = new Socket("localhost", 554);
            BufferedReader userInput = new BufferedReader(new InputStreamReader(System.in));
            System.out.println("Enter a String : ");
            String str = userInput.readLine();
            PrintWriter out = new PrintWriter(soc.getOutputStream(),true);
            out.println(str);
            BufferedReader in = new BufferedReader(new InputStreamReader(soc.getInputStream()));
            System.out.println(in.readLine());
        }
        catch(Exception e) {
            e.printStackTrace();
        }
    }
}

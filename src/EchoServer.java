import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class EchoServer {
    public static void main(String[] args) {
        try {
            System.out.println("waiting for clients...");
            ServerSocket ss = new ServerSocket(554);
                    Socket soc = ss.accept();
            System.out.println("connection is established");
            BufferedReader in = new BufferedReader(new InputStreamReader(soc.getInputStream()));
            String str = in.readLine();
            PrintWriter out = new PrintWriter(soc.getOutputStream(),true);
            out.println("Server Says : "+str);
        }
        catch(Exception e) {
            e.printStackTrace();
        }
    }
}

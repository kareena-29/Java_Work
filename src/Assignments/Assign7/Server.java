package Assignments.Assign7;

import java.io.*;
import java.net.*;

public class Server {
    public static void main(String[] args) throws Exception {
        System.out.println("Server Started");
        ServerSocket ss = new ServerSocket(9800);

        System.out.println("Server is waiting for proxy client request!");
        Socket socProxy = ss.accept();
        System.out.println("Proxy Client Connected!");

        BufferedReader br = new BufferedReader(new InputStreamReader(socProxy.getInputStream()));
        BufferedReader keyb = new BufferedReader(new InputStreamReader(System.in));
        PrintStream ps = new PrintStream(socProxy.getOutputStream());

        String msg1, msg2;
        do {
            msg1 = br.readLine();
            System.out.println("\nMessage from Proxy Client: " + msg1);
            System.out.println();
            if (msg1.equals("q")) break;

            msg2 = keyb.readLine();
//            System.out.println("\nMessage from Main Server to Proxy Client: "+msg2);
            ps.println(msg2);
        } while (true);


        ss.close();
        socProxy.close();
    }
}

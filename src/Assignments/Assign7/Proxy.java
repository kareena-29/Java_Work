package Assignments.Assign7;

import java.io.*;
import java.net.*;

public class Proxy {
    public static void main(String[] args) throws Exception {
        Socket proxyClient = new Socket("localhost", 9800);
        System.out.println("Proxy connected to main server!");

        BufferedReader br = new BufferedReader(new InputStreamReader(proxyClient.getInputStream()));
        PrintStream ps = new PrintStream(proxyClient.getOutputStream());

        System.out.println("Proxy Server Started");
        ServerSocket proxy = new ServerSocket(9876);

        System.out.println("Proxy Server is waiting for client request!");
        Socket client = proxy.accept();
        System.out.println("Client Connected!");

        BufferedReader br2 = new BufferedReader(new InputStreamReader(client.getInputStream()));
        PrintStream ps2 = new PrintStream(client.getOutputStream());

        String msg1, msg2;
        do {
            msg1 = br2.readLine();
            System.out.println("\nMessage from Client: " + msg1);
            System.out.println();
            ps.println(msg1);

            if (msg1.equals("q")) break;

            msg2 = br.readLine();
            System.out.println("\nMessage from Server: " + msg2);
            System.out.println();
            ps2.println(msg2);
        } while (true);

        proxyClient.close();
        proxy.close();
        client.close();

    }
}

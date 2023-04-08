package Assignments.Assign7;

import java.io.*;
import java.net.*;

public class Client {
    public static void main(String[] args) throws Exception {
        Socket client = new Socket("localhost", 9876);
        System.out.println("Client connected to Proxy");

        BufferedReader br = new BufferedReader(new InputStreamReader(client.getInputStream()));
        PrintStream ps = new PrintStream(client.getOutputStream());
        BufferedReader keyb = new BufferedReader(new InputStreamReader(System.in));

        String msg1, msg2;

        do {
            msg1 = keyb.readLine();
            ps.println(msg1);
            System.out.println(msg1);

            if (msg1.equals("q")) break;

            msg2 = br.readLine();
            System.out.println("\nFrom proxy server: " + msg2);
        } while (true);

        client.close();
    }
}

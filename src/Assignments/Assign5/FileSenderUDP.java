package Assignments.Assign5;
//All the communication done through UDP packets is in the form of byte arrays!

import java.io.*;
import java.net.*;

public class FileSenderUDP {
    public static void main(String[] args) throws Exception {
        DatagramSocket socket = null;
        DatagramPacket inPacket = null;  //receiving packets
        DatagramPacket outPacket = null; //sending packets
        byte[] inBuf, outBuf; //as data in packets is in the form of bytes
        String msg;
        final int PORT = 8076;

        try {
            socket = new DatagramSocket(PORT);
            while (true) {
                System.out.println("Server Running...");

                inBuf = new byte[100]; //receiving input as client connected
                inPacket = new DatagramPacket(inBuf, inBuf.length);
                socket.receive(inPacket);

                int sourcePort = inPacket.getPort();
                InetAddress sourceAddr = inPacket.getAddress();
                msg = new String(inPacket.getData(), 0, inPacket.getLength());
                //displaying this to show client properly connected
                System.out.println("Client: " + sourceAddr + ":" + sourcePort);

                String dirname = "C:/Users/karee/Downloads/Folder";
                File dir = new File(dirname);
                File file[] = dir.listFiles();

                StringBuilder sb = new StringBuilder("\n");
                int count = 0;

                for (int i = 0; i < file.length; i++) {
                    if (file[i].canRead()) count++;
                }

                sb.append(count + " Files Found\n\n");
                for (int i = 0; i < file.length; i++) {
                    sb.append(i + " " + file[i].getName() + " " + file[i].length() + " Bytes\n");
                }

                sb.append("\nEnter filename to download: ");

                outBuf = (sb.toString().getBytes());
                outPacket = new DatagramPacket(outBuf, 0, outBuf.length, sourceAddr, sourcePort);
                socket.send(outPacket);

                //taking filename input from client
                inBuf = new byte[100];
                inPacket = new DatagramPacket(inBuf, 0, inBuf.length);
                socket.receive(inPacket);
                String filename = new String(inPacket.getData(), 0, inPacket.getLength());

                System.out.println("\nRequested File: " + filename);

                //checking file exits or not
                boolean fileis = false;
                int index = 1;
                sb = new StringBuilder("");
                for (int i = 0; i < file.length; i++) {
                    if (((file[i].getName().toString()).equalsIgnoreCase(filename))) {
                        System.out.println(((file[i].toString()).equalsIgnoreCase(filename)));
                        index = i;
                        fileis = true;
                    }
                }
                //if file not present then sending the error msg
                if (!fileis) {
                    System.out.println("ERROR");
                    sb.append("ERROR");
                    outBuf = (sb.toString()).getBytes();
                    outPacket = new DatagramPacket(outBuf, 0, outBuf.length, sourceAddr, sourcePort);
                    socket.send(outPacket);
                } else {
                    try {
                        //File sending process
                        File ff = new File(file[index].getAbsolutePath());
                        FileReader fr = new FileReader(ff);
                        BufferedReader bf = new BufferedReader(fr);
                        String s = null;
                        sb = new StringBuilder();

                        while ((s = bf.readLine()) != null) sb.append(s);

                        if (bf.readLine() == null) System.out.println("File Reading Successful. Closing the socket!");

                        //sending the read file
                        outBuf = new byte[100000];
                        outBuf = (sb.toString()).getBytes();
                        outPacket = new DatagramPacket(outBuf, 0, outBuf.length, sourceAddr, sourcePort);
                        socket.send(outPacket);


                    } catch (IOException io) {
                        io.printStackTrace();
                    }
                }
            }
        } catch (Exception ee) {
            ee.printStackTrace();
        }
    }
}

package Assignments.Assign5;

import java.io.*;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

public class FileReceiverUDP {
    public static void main(String[] args) throws Exception {
        DatagramSocket socket = null;
        DatagramPacket inPacket = null;
        DatagramPacket outPacket = null;
        byte[] inBuf, outBuf;
        final int PORT = 8076;
        String msg = null;
        BufferedReader keyb = new BufferedReader(new InputStreamReader(System.in)); //to read from keyboard

        try {
            InetAddress address = InetAddress.getByName("localhost");
            socket = new DatagramSocket();

            //sending connection connected msg
            msg = "hi";
            outBuf = msg.getBytes();
            outPacket = new DatagramPacket(outBuf, 0, outBuf.length, address, PORT);
            socket.send(outPacket);

            //receiving input of file names list
            inBuf = new byte[65535];
            inPacket = new DatagramPacket(inBuf, inBuf.length);
            socket.receive(inPacket);
            String receivedData = new String(inPacket.getData(), 0, inPacket.getLength());
            //print file list
            System.out.println(receivedData);

            //now sending the filename to download
            String filename = keyb.readLine();
            outBuf = filename.getBytes();
            outPacket = new DatagramPacket(outBuf, 0, outBuf.length, address, PORT);
            socket.send(outPacket);

            //Now finally receiving the file
            inBuf = new byte[100000];
            inPacket = new DatagramPacket(inBuf, inBuf.length);
            socket.receive(inPacket);

            receivedData = new String(inPacket.getData(), 0, inPacket.getLength());
            if (receivedData.endsWith("ERROR")) {
                System.out.println("\nFile doesn't exist\n");
                socket.close();
            } else {
                //writing the received file in new file i.e same file name in but in the current working directory
                try {
                    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(filename)));
                    //creating file with same filename
                    bw.write(receivedData);
                    bw.close();

                    System.out.println("File Write Successful. Closing the socket!");
                    socket.close();
                } catch (IOException ee) {
                    ee.printStackTrace();
                }
            }

        } catch (Exception ee) {
            ee.printStackTrace();
        }
    }
}

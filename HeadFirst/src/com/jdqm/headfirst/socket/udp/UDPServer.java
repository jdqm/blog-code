package com.jdqm.headfirst.socket.udp;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.SocketException;

/**
 * Created by Jdqm on 2018-1-7.
 */
public class UDPServer {
    public static void main(String[] args) {
        try {
            DatagramSocket datagramSocket = new DatagramSocket(8888);
            DatagramPacket packet;
            byte[] data = new byte[1024];
            while (true) {
                packet = new DatagramPacket(data, data.length);
                datagramSocket.receive(packet);
                Thread thread = new Thread(new UDPThread(datagramSocket, packet));
                thread.start();
            }
        } catch (SocketException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

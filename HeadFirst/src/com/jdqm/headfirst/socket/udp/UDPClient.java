package com.jdqm.headfirst.socket.udp;

import java.io.IOException;
import java.net.*;

/**
 * Created by Jdqm on 2018-1-7.
 */
public class UDPClient {
    public static void main(String[] args) {
        try {
            InetAddress address = InetAddress.getByName("localhost");
            byte[] data = "UDP客户端消息".getBytes();
            DatagramPacket packet = new DatagramPacket(data, 0, data.length, address, 8888);
            DatagramSocket socket = new DatagramSocket();
            socket.send(packet);

            byte[] reply = new byte[1024];
            DatagramPacket packetReply = new DatagramPacket(reply, reply.length);
            DatagramSocket socket1 = new DatagramSocket(8800);
            socket1.receive(packetReply);
            String replyStr = new String(reply, 0, packet.getLength());
            System.out.println(replyStr);
            socket.close();
        } catch (UnknownHostException e) {
            e.printStackTrace();
        } catch (SocketException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

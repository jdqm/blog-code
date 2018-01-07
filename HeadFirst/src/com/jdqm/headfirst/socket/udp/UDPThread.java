package com.jdqm.headfirst.socket.udp;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

/**
 * Created by Jdqm on 2018-1-7.
 */
public class UDPThread implements Runnable {
    DatagramSocket socket;
    DatagramPacket packet;

    public UDPThread(DatagramSocket socket, DatagramPacket packet) {
        this.socket = socket;
        this.packet = packet;
    }

    @Override
    public void run() {
        InetAddress address = packet.getAddress();
        System.out.println("客户端IP地址:" + address.getHostAddress());

        byte[] data = packet.getData();
        //读取客户端发送过来的数据报
        String info = new String(data, 0, packet.getLength());
        System.out.println(info);

        byte[] reply = "UPD服务器回复内容".getBytes();
        try {
            socket.send(new DatagramPacket(reply, reply.length, address, 8800));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

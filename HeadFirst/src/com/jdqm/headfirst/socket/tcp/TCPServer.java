package com.jdqm.headfirst.socket.tcp;

import java.io.IOException;
import java.net.InetAddress;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * Created by Jdqm on 2018-1-7.
 */
public class TCPServer {
    public static void main(String[] args) {
        try {
            ServerSocket serverSocket = new ServerSocket(8888);
            while (true) {
                Socket socket = serverSocket.accept();
                new ServerThread(socket).start();
                InetAddress address = socket.getInetAddress();
                System.out.println("当前客户端IP为：" + address.getHostAddress());
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

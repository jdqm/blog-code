package com.jdqm.headfirst.socket.tcp;


import java.io.*;
import java.net.Socket;

/**
 * Created by Jdqm on 2018-1-7.
 */
public class TCPClient {
    public static void main(String[] args) {
        Socket socket = null;
        PrintWriter writer = null;
        BufferedReader reader = null;
        try {
            socket = new Socket("localhost", 8888);
            OutputStream os = socket.getOutputStream();
            writer = new PrintWriter(os);
            writer.write("我是TCP客户端");
            writer.flush();
            socket.shutdownOutput();

            InputStream inputStream = socket.getInputStream();
            reader = new BufferedReader(new InputStreamReader(inputStream));
            String reply;
            while ((reply = reader.readLine()) != null) {
                System.out.println(reply);
            }
            writer.close();
            reader.close();
            socket.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

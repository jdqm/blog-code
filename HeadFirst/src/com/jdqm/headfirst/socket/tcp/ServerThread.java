package com.jdqm.headfirst.socket.tcp;

import java.io.*;
import java.net.Socket;

/**
 * Created by Jdqm on 2018-1-7.
 */
public class ServerThread extends Thread {
    private Socket socket;

    public ServerThread(Socket socket) {
        this.socket = socket;
    }

    @Override
    public void run() {
        BufferedReader bufferedReader = null;
        OutputStreamWriter writer = null;
        try {
            InputStream inputStream = socket.getInputStream();
            bufferedReader = new BufferedReader(new InputStreamReader(inputStream));
            String data;
            while ((data = bufferedReader.readLine()) != null) {
                System.out.println(data);
            }

            writer = new OutputStreamWriter(socket.getOutputStream());
            writer.write("我是TCP服务器");
            writer.flush();
            bufferedReader.close();
            writer.close();
            socket.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

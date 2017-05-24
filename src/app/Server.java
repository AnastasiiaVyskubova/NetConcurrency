package app;

import java.io.DataInputStream;
        import java.io.IOException;
        import java.io.InputStream;
        import java.net.ServerSocket;
        import java.net.Socket;

/**
 * Created by 14Viskubova on 24.05.2017.
 */

public class Server {

    public static void main(String[] args){
        try {
            ServerSocket serverSocket = new ServerSocket(8080);
            Socket socket = serverSocket.accept();
            InputStream inputStream = socket.getInputStream();
            DataInputStream dataInputStream = new DataInputStream(inputStream);
            String message = dataInputStream.readUTF();
            System.out.println(message);
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

}
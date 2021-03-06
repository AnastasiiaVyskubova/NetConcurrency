package app;

import java.io.*;
import java.net.Socket;

/**
 * Created by 14Viskubova on 10.02.2017.
 */
public class Client {
    public static void main(String[] args) throws IOException {
        String host = args[0];
        int port = Integer.parseInt(args[1]);
        try {
            if (port < 0)
                throw new IllegalArgumentException(args[1]);
            Socket socket = new Socket(host,port);
            DataOutputStream dataOutputStream = new DataOutputStream(socket.getOutputStream());
            DataInputStream dataInputStream = new DataInputStream(socket.getInputStream());
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
            String outMsg = "";
            String inMsg;

            while (!outMsg.equals("exit")){
                outMsg = bufferedReader.readLine();
                dataOutputStream.writeUTF(outMsg);
                inMsg = dataInputStream.readUTF();
                System.out.println(inMsg);

                dataOutputStream.flush();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

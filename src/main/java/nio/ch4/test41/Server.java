package nio.ch4.test41;

import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {

    public static void main(String[] args) {
        try {
            char[] charArray = new char[3];
            ServerSocket serverSocket = new ServerSocket(8088);
            System.out.println("accept begin " + System.currentTimeMillis());
            Socket socket = serverSocket.accept();
            System.out.println("accept end " + System.currentTimeMillis());

            OutputStream outputStream = socket.getOutputStream();
            outputStream.write("我是高洪岩，我来自server端".getBytes());
            outputStream.close();;
            socket.close();
            serverSocket.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}

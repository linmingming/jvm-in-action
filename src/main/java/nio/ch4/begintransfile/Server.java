package nio.ch4.begintransfile;

import java.io.File;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {

    public static void main(String[] args) {
        try {
            byte[] byteArray = new byte[2048];
            ServerSocket serverSocket = new ServerSocket(8088);
            Socket socket = serverSocket.accept();

            InputStream inputStream = socket.getInputStream();
            int readLength = inputStream.read(byteArray);

            FileOutputStream fileOutputStream = new FileOutputStream(new File("C:\\received\\timg.jpg"));
            while(readLength != -1) {
                fileOutputStream.write(byteArray, 0, readLength);
                readLength = inputStream.read(byteArray);
            }
            fileOutputStream.close();
            inputStream.close();
            socket.close();
            serverSocket.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

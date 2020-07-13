package nio.ch4.socketthread;

import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;

public class BeginThread extends Thread {

    private Socket socket;

    public BeginThread(Socket socket) {
        super();
        this.socket = socket;
    }

    @Override
    public void run() {
        try {
            InputStream inputStream = socket.getInputStream();
            InputStreamReader reader = new InputStreamReader(inputStream);
            char[] charArray = new char[1000];
            int readLength = -1;
            while ((readLength = reader.read(charArray)) != -1) {
                String newString = new String(charArray, 0, readLength);
                System.out.println(newString);
            }
            reader.close();
            inputStream.close();
            socket.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

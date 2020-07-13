package nio.ch4.socketthreadpool;


import java.io.InputStream;
import java.net.Socket;

public class ReadRunnable implements Runnable {

    private Socket socket;

    public ReadRunnable(Socket socket) {
        super();
        this.socket = socket;
    }

    public void run() {
        try {
            InputStream inputStream = socket.getInputStream();
            byte[] byteArray = new byte[100];
            int readLength = inputStream.read(byteArray);
            while (readLength != -1) {
                System.out.println(new String(byteArray, 0, readLength));
                readLength = inputStream.read(byteArray);
            }
            inputStream.close();
            socket.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

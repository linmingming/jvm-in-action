package nio.ch4.socketthreadpool;

import java.io.IOException;
import java.io.OutputStream;
import java.net.Socket;

public class Client {

    public static void main(String[] args) throws IOException, InterruptedException {
        for (int i = 0; i < 10000; i++) {
            Socket socket = new Socket("localhost", 8088);
            OutputStream outputStream = socket.getOutputStream();
            outputStream.write("我是中国人".getBytes());
            outputStream.close();
            socket.close();
            Thread.sleep(1000);
        }
    }
}

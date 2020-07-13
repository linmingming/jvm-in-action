package nio.ch4.test2_1;

import java.io.OutputStream;
import java.net.Socket;

public class Client {

    public static void main(String[] args) {
        try {
            Socket socket = new Socket("localhost", 8088);
            OutputStream outputStream = socket.getOutputStream();
            outputStream.write("111".getBytes());
            outputStream.write("111111".getBytes());
            outputStream.write("11111111".getBytes());
            Thread.sleep(500000000);
            socket.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

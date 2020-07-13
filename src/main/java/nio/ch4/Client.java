package nio.ch4;

import java.io.IOException;
import java.net.Socket;
import java.net.UnknownHostException;

public class Client {
    public static void main(String[] args) {
        try {
            System.out.println("client链接准备 = " + System.currentTimeMillis());
            Socket socket = new Socket("localhost", 8088);
            System.out.println("client链接结束 = " + System.currentTimeMillis());
            socket.close();
        } catch (UnknownHostException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

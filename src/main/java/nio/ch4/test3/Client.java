package nio.ch4.test3;

import java.io.IOException;
import java.net.Socket;
import java.util.logging.SocketHandler;

public class Client {

    public static void main(String[] args) throws Exception {
        System.out.println("socket begin" + System.currentTimeMillis());

        Socket socket = new Socket("localhost", 8088);
        System.out.println("socket end" + System.currentTimeMillis());

        Thread.sleep(Integer.MAX_VALUE);
        socket.close();
    }
}

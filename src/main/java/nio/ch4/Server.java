package nio.ch4;

import java.io.IOException;
import java.net.ServerSocket;

public class Server {

    public static void main(String[] args) {
        try {
            ServerSocket socket = new ServerSocket(8088);
            System.out.println("server 阻塞开始 = " + System.currentTimeMillis());
            socket.accept();
            System.out.println("server 阻塞结束 = " + System.currentTimeMillis());
            socket.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

}

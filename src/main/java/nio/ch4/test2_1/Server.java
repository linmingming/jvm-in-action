package nio.ch4.test2_1;

import java.net.ServerSocket;

public class Server {

    public static void main(String[] args) {
        try {
            ServerSocket serverSocket = new ServerSocket(8088);
            serverSocket.accept();
            Thread.sleep(Integer.MAX_VALUE);
            serverSocket.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

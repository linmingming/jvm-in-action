package nio.ch4.test7;

import java.net.ServerSocket;

public class Server {
    public static void main(String[] args) {
        try {
            ServerSocket serverSocket = new ServerSocket(8000);
            System.out.println(serverSocket.getSoTimeout());
            serverSocket.setSoTimeout(4000);
            System.out.println(serverSocket.getSoTimeout());

            System.out.println("begin " + System.currentTimeMillis());
            serverSocket.accept();
            System.out.println("end " + System.currentTimeMillis());
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("catch " + System.currentTimeMillis());
        }
    }
}

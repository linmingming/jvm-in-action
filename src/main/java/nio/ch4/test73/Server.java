package nio.ch4.test73;

import java.net.InetAddress;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {
    public static void main(String[] args) {
        try {
            InetAddress inetAddress = InetAddress.getLocalHost();
            ServerSocket serverSocket = new ServerSocket(8088, 50, inetAddress);
            Thread.sleep(10000);

            for (int i = 0; i < 100; i++) {
                System.out.println("accept" + (i + 1) +  " begin");
                Socket socket1 = serverSocket.accept();
                System.out.println("accept" + (i + 1) +  " end");
            }

            serverSocket.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }


}

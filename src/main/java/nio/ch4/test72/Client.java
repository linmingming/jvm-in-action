package nio.ch4.test72;

import java.io.IOException;
import java.net.InetAddress;
import java.net.Socket;

public class Client {

    public static void main(String[] args) throws IOException {

        System.out.println(Long.MAX_VALUE);
        System.out.println(Integer.MAX_VALUE);

        InetAddress inetAddress = InetAddress.getLocalHost();

        for (int i = 0; i < 100; i++) {
            Socket socket1 = new Socket(inetAddress, 8088);
            System.out.println("client发起连接次数: " + (i + 1));
        }

    }
}

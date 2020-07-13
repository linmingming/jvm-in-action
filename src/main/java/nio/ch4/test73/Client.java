package nio.ch4.test73;

import java.io.IOException;
import java.net.Socket;

public class Client {

    public static void main(String[] args) throws IOException {
        for (int i = 0; i < 100; i++) {
            Socket socket1 = new Socket("localhost", 8088);
            System.out.println("client发起连接次数: " + (i + 1));
        }

    }
}

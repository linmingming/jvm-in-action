package nio.ch4.test7;

import java.net.Socket;

public class Client {

    public static void main(String[] args) {
        try {
            System.out.println("client begin " + System.currentTimeMillis());
            Socket socket = new Socket("localhost", 8000);
            System.out.println("client end " + System.currentTimeMillis());
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("catch " + System.currentTimeMillis());
        }
    }
}

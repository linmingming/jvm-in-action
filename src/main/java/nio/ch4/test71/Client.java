package nio.ch4.test71;

import java.io.IOException;
import java.net.Socket;

public class Client {

    public static void main(String[] args) throws IOException {
        Socket socket1 = new Socket("localhost", 8088);
        Socket socket2 = new Socket("localhost", 8088);
        Socket socket3 = new Socket("localhost", 8088);
        Socket socket4 = new Socket("localhost", 8088);
        Socket socket5 = new Socket("localhost", 8088);

    }
}

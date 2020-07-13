package nio.ch4.test41;

import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.Socket;

public class Client {

    public static void main(String[] args) {
        try {
            System.out.println("socket begin " + System.currentTimeMillis());
            Socket socket = new Socket("localhost", 8088);
            System.out.println("socket end " + System.currentTimeMillis());

            char[] charArray = new char[6];
            InputStream inputStream = socket.getInputStream();
            InputStreamReader inputStreamReader = new InputStreamReader(inputStream);
            System.out.println("read begin " + System.currentTimeMillis());
            int readLength = inputStreamReader.read(charArray);
            while (readLength != -1) {
                String newString = new String(charArray, 0, readLength);
                System.out.println(newString);
                readLength = inputStreamReader.read(charArray);
            }
            System.out.println("read end " + System.currentTimeMillis());
            inputStreamReader.close();;
            inputStream.close();
            socket.close();
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}

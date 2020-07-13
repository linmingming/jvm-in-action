package nio.ch4.begintransfile;

import java.io.File;
import java.io.FileInputStream;
import java.io.OutputStream;
import java.net.Socket;

public class Client {

    public static void main(String[] args) {
        try {
            String pngFile = "c:\\upload\\timg.jpg";
            FileInputStream pngStream = new FileInputStream(new File(pngFile));
            byte[] byteArray = new byte[2048];
            Socket socket = new Socket("localhost", 8088);
            OutputStream outputStream = socket.getOutputStream();

            int readLength = pngStream.read(byteArray);
            while (readLength != -1) {
                outputStream.write(byteArray, 0, readLength);
                readLength = pngStream.read(byteArray);
            }
            outputStream.close();
            pngStream.close();
            socket.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

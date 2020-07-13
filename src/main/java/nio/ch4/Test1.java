package nio.ch4;

import java.io.IOException;
import java.net.Socket;

public class Test1 {

    public static void main(String[] args) {
        try {
            Socket socket = new Socket("www.csdn.net", 80);
            System.out.println("socket连接成功");
        } catch (IOException e) {
            System.out.println("socket连接失败");
            e.printStackTrace();
        }
    }
}

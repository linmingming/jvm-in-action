package nio.ch4.server_object_client;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

public class Client {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        Socket socket = new Socket("localhost", 8888);
        InputStream inputStream = socket.getInputStream();
        OutputStream outputStream = socket.getOutputStream();

        ObjectOutputStream objectOutputStream = new ObjectOutputStream(outputStream);
        ObjectInputStream objectInputStream = new ObjectInputStream(inputStream);
        for(int i = 0; i < 5; i++) {
            UserInfo newUserInfo = new UserInfo();
            newUserInfo.setId(i + 1);
            newUserInfo.setUsername("clientUsername" + (i + 1));
            newUserInfo.setPassword("clientPassword" + (i + 1));
            objectOutputStream.writeObject(newUserInfo);

            UserInfo userInfo = (UserInfo) objectInputStream.readObject();
            System.out.println("在客户端打印 " + (i + 1) + ":" + userInfo.toString());

        }

        objectOutputStream.close();
        objectInputStream.close();

        outputStream.close();
        inputStream.close();

        socket.close();
    }
}

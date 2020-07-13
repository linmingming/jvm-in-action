package nio.ch4.server_object_client;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {

    public static void main(String[] args) throws IOException, ClassNotFoundException {
        ServerSocket serverSocket = new ServerSocket(8888);
        Socket socket = serverSocket.accept();
        InputStream inputStream = socket.getInputStream();
        OutputStream outputStream = socket.getOutputStream();

        ObjectInputStream objectInputStream = new ObjectInputStream(inputStream);
        ObjectOutputStream objectOutputStream = new ObjectOutputStream(outputStream);
        for(int i = 0; i < 5; i++) {
            UserInfo userInfo = (UserInfo) objectInputStream.readObject();
            System.out.println("在服务端打印 " + (i + 1) + ":" + userInfo.toString());

             UserInfo newUserInfo = new UserInfo();
             newUserInfo.setId(i + 1);
             newUserInfo.setUsername("serverUsername" + (i + 1));
             newUserInfo.setPassword("serverPassword" + (i + 1));
             objectOutputStream.writeObject(newUserInfo);
        }

        objectOutputStream.close();
        objectInputStream.close();

        outputStream.close();
        inputStream.close();

        socket.close();
        serverSocket.close();
    }

}

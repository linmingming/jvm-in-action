package nio.ch4.socketthread;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class BeginServer {

    public static void main(String[] args) throws IOException {
        ServerSocket serverSocket = new ServerSocket(8888);
        int runTag = 1;
        while(runTag == 1) {
            Socket socket = serverSocket.accept();
            BeginThread beginThread = new BeginThread(socket);
            beginThread.start();
        }
    }
}

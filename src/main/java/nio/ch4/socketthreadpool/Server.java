package nio.ch4.socketthreadpool;

import java.net.ServerSocket;
import java.net.Socket;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;

public class Server {

    private ServerSocket serverSocket;
    private Executor pool;

    public Server(int port, int poolSize) {
        try {
            serverSocket = new ServerSocket(port);
            pool = Executors.newFixedThreadPool(poolSize);
        } catch (Exception e) {
            e.printStackTrace();
        }
     }

     public void startService() {
        try {
            for(;;) {
                Socket socket = serverSocket.accept();
                pool.execute(new ReadRunnable(socket));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
     }

    public static void main(String[] args) {
        Server server = new Server(8088, 10000);
        server.startService();
    }
}

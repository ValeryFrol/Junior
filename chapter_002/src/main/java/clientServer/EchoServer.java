package clientServer;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class EchoServer {

    public static void main(String[] args) throws IOException {
        //Установить сокет на стороне сервера
        try (ServerSocket ss = new ServerSocket(8189)) {
            //Ожидать подключение клиента
            try (Socket incoming = ss.accept()) {
                InputStream inStream = incoming.getInputStream();
                OutputStream outStream = incoming.getOutputStream();
                try (Scanner in = new Scanner(inStream, "UTF-8")) {
                    PrintWriter out = new PrintWriter(
                            new OutputStreamWriter(outStream, "UTF-8"),
                            true
                    );
                    out.println("Hello! Enter BYE to exit!");
                    //передать обратно данные , полученные от клиента
                    boolean done = false;
                    while (!done && in.hasNextLine()) {
                        String line = in.nextLine();
                        out.println("Echo:" + line);
                        if (line.trim().equals("BYE")) done = true;
                    }
                }

            }

        }


    }
}

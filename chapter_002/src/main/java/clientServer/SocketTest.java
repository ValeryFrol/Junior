package clientServer;

import java.io.IOException;
import java.net.Socket;
import java.util.Scanner;

public class SocketTest {
    public static void main(String[] args) throws IOException {
        try (Socket sc = new Socket("time-a.nist.gov", 13); //открываем сокет Сокет - абстрактное понятие ( возможность установить соединение и обменяться данными)
             Scanner in = new Scanner(sc.getInputStream(), "UTF-8")) {
            while (in.hasNextLine()) {
                String line = in.nextLine();
                System.out.println(line);
            }
        }


    }


}

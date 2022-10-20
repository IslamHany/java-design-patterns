package behavioral.templateMethod;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Demo {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        Network network = null;
        System.out.print("Input user name: ");
        String username = reader.readLine();
        System.out.print("Input password: ");
        String password = reader.readLine();

        // Enter the message.
        System.out.print("Input message: ");
        String message = reader.readLine();

        System.out.println("\nChoose social network for posting message.\n" +
                "1 - Facebook\n" +
                "2 - Twitter");
        int choice = Integer.parseInt(reader.readLine());

        if (choice == 1)
            network = new Facebook(username, password);
        else if (choice == 2)
            network = new Twitter(username, password);

        network.post(message);
    }
}

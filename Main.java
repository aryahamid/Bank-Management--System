import java.util.ArrayList;
import java.util.Scanner;


public class Main {
    static Scanner scan =new Scanner(System.in);
    static ArrayList<SetClients> clients=new ArrayList<>();
    public static void main(String[] args) {

        System.out.println("""
                     1. Manager
                     2. Customer
                     """);

        switch (scan.nextInt()){
            case 1:
                Boss.setUp(scan);
                break;
            case 2:
                client.setUp(clients,scan);
                break;

            default:
                System.err.println("wrong option selected!");
        }

    }
}

import java.util.ArrayList;
import java.util.Scanner;

class client {
    public static void setUp(ArrayList<SetClients> clients, Scanner scan)
    {
        Set.setClients(Main.clients);
        boolean check=true;
        while (check)
        {
            System.out.println("""
                1. Checking Balance.
                2. Deposit.
                3. Withdraw.
                4. Exit.
                """);
            switch (scan.nextInt())
            {
                case 1:
                {
                    System.out.print("Enter your ID: ");
                    SetClients temp=clients.get(scan.nextInt());
                    System.out.println("Your Balance is: "+temp.getBalance()+" $");
                    break;
                }
                case 2:
                {
                    System.out.print("Enter your ID: ");
                    SetClients temp=clients.get(scan.nextInt());
                    System.out.println("Enter the amount to Deposit: ");
                    temp.setBalance(temp.getBalance() + scan.nextInt());
                    System.out.println("Deposit Done successfully!");
                    break;
                }
                case 3:
                {
                    System.out.print("Enter your ID: ");
                    SetClients temp=clients.get(scan.nextInt());
                    System.out.println("Enter the amount to Withdraw: ");
                    if(temp.getBalance()>=scan.nextInt())
                    {
                        temp.setBalance(temp.getBalance() - scan.nextInt());
                        System.out.println("Deposit Done successfully!");
                    }
                    else
                        break;
                }
                case 4:
                    check=false;
            }
        }
    }
}

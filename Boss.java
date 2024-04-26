import java.util.Scanner;

class Boss{
    public static void setUp(Scanner scan) {
        Set.setClients(Main.clients);
        boolean check = true;
        while (check)
        {
            System.out.println("""
                1. Create a new account.
                2. Delete an account.
                3. Show an account.
                4. Edit an existing account.
                5. Exit.""");
                switch (scan.nextInt())
                {
                    case 1:
                        Set.newAccount(Main.clients,scan);
                        break;
                    case 2:
                        Set.deleteAccount(Main.clients,scan);
                        break;
                    case 3:
                        Set.displayAccount(Main.clients,scan);
                        break;
                    case 4:
                        Set.editAccount(Main.clients,scan);
                        break;
                    case 5:
                        check=false;
                        break;
                    default:
                        System.err.println("Wrong selection!");
                }
        }
    }
}

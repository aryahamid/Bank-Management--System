import java.util.ArrayList;
import java.util.Scanner;

class Set {
    //set info of clients when the program executes.
    static void setClients( ArrayList<SetClients> clients){
        clients.add(new SetClients("Hamid","Arya",200,1));
        clients.add(new SetClients("Nazir","Azizi",322,2));
        clients.add(new SetClients("Alizada","Hussaini",222,3));
    }
    //Add a new account to the system.
    static void newAccount(ArrayList<SetClients> clients,Scanner scan) {
        scan.nextLine();
        System.out.print("Enter the info in provided order( Name, LastName, Balance,ID):\n");
        clients.add(new SetClients(scan.nextLine(),scan.nextLine(),scan.nextInt(), scan.nextInt()));
        System.out.println("Client added successfully!");
    }
    //Delete an existing account in system.
    static void deleteAccount(ArrayList<SetClients> clients,Scanner scan) {
        System.out.print("Enter the ID: ");
        int i=findOfIndex(clients,scan.nextInt());
        if(i==-1)
            System.err.println("NO account found with this ID");
        else {
            clients.remove(i);
            System.out.println("Account deleted successfully!");
        }
    }
    //display a client's info using his ID.
    static void displayAccount(ArrayList<SetClients> clients,Scanner scan) {
        System.out.print("Enter ID: ");
        scan.nextLine();
        int i=findOfIndex(clients,scan.nextInt());
        if(i==-1)
            System.err.println("NO account found with this ID");
        else
        {
            System.out.println("Name: "+ clients.get(i).getName());
            System.out.println("LastName: "+clients.get(i).getLastName());
            System.out.println("Balance: "+clients.get(i).getBalance()+"$");
        }
    }
    //Change info of an existing account
    static void editAccount(ArrayList<SetClients> clients,Scanner scan){
        System.out.print("Enter ID: ");
        int i=findOfIndex(clients,scan.nextInt());
        System.out.println("Name: "+clients.get(i).getName());
        System.out.println("LastName: "+clients.get(i).getLastName());
        System.out.println("""
                What do you want to change?
                1. Name
                2. Last Name
                3. ID
                """);
        switch (scan.nextInt())
        {
            case 1:
            {
                System.out.print("Enter new name: ");
                clients.get(i).setName(scan.nextLine());
                System.out.println("Done");
                break;
            }
            case 2:
            {
                System.out.print("Enter new Last Name: ");
                clients.get(i).setLastName(scan.nextLine());
                System.out.println("Done");
                break;
            }
            case 3:
            {
                System.out.print("Enter new ID: ");
                clients.get(i).setID(scan.nextInt());
                System.out.println("Done");
                break;
            }
            default:
                System.err.println("invalid choice!");
        }
    }
    //Find index of a client using his ID.
    static int findOfIndex(ArrayList<SetClients> clients,int id){
        boolean check=false;
        for (int i=0; i<clients.size(); i++)
        {
            if(id==clients.get(i).getID())
            {
                check=true;
                return i;
            }
        }
        return -1;
    }
}


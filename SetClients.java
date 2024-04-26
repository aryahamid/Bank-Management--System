class SetClients{
    private String name;
    private String lastName;
    private int ID;
    private int balance;

    public SetClients(String name, String lastName,  int balance, int ID) {
        this.name = name;
        this.lastName = lastName;
        this.balance = balance ;
        this.ID = ID;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    public String getName() {
        return name;
    }

    public String getLastName() {
        return lastName;
    }

    public int getID() {
        return ID;
    }

    public int getBalance() {
        return balance;
    }
}


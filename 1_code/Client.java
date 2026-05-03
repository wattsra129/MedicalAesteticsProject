
public class Client {
    private int clientID;
    private String firstName;
    private String lastName;

    public Client(int clientID, String firstName, String lastName) {
        this.clientID = clientID;
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public int getClientID() {
        return clientID;
    }

    public String getFullName() {
        return firstName + " " + lastName;
    }
}


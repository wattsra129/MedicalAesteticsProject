
public class Provider {
    private int providerID;
    private String firstName;
    private String lastName;
    private String certification;
    private String availableDay;

    public Provider(int providerID, String firstName, String lastName, String certification, String availableDay) {
        this.providerID = providerID;
        this.firstName = firstName;
        this.lastName = lastName;
        this.certification = certification;
        this.availableDay = availableDay;
    }

    public int getProviderID() {
        return providerID;
    }

    public String getFullName() {
        return firstName + " " + lastName;
    }

    public String getCertification() {
        return certification;
    }

    public String getAvailableDay() {
        return availableDay;
    }
}

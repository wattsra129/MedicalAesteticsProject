
public class Appointment {
    private Client client;
    private Provider provider;
    private Service service;
    private String appointmentDay;
    private String appointmentTime;

    public Appointment(Client client, Provider provider, Service service, String appointmentDay, String appointmentTime) {
        this.client = client;
        this.provider = provider;
        this.service = service;
        this.appointmentDay = appointmentDay;
        this.appointmentTime = appointmentTime;
    }

    public void displayAppointment() {
        System.out.println("Appointment Scheduled:");
        System.out.println("Client: " + client.getFullName());
        System.out.println("Provider: " + provider.getFullName());
        System.out.println("Service: " + service.getServiceName());
        System.out.println("Day: " + appointmentDay);
        System.out.println("Time: " + appointmentTime);
    }
}

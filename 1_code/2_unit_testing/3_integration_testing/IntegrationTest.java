
public class IntegrationTest {
    public static void main(String[] args) {

        Client client = new Client(1001, "Rachel", "Watts");
        Provider provider = new Provider(2001, "Lindsey", "Bruscia", "Esthetician", "Monday");
        Service service = new Service(3001, "HydraFacial", "Esthetician");

        AppointmentScheduler scheduler = new AppointmentScheduler();

        Appointment appointment = scheduler.scheduleAppointment(
                client,
                provider,
                service,
                "Monday",
                "9:00 AM"
        );

        System.out.println("Integration Test - Schedule Valid Appointment:");

        if (appointment != null) {
            System.out.println("Expected: Appointment created");
            System.out.println("Actual: Appointment created");
            appointment.displayAppointment();
        } else {
            System.out.println("Expected: Appointment created");
            System.out.println("Actual: Appointment failed");
        }
    }
}


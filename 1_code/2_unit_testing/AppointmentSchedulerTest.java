
public class AppointmentSchedulerTest {
    public static void main(String[] args) {

        AppointmentScheduler scheduler = new AppointmentScheduler();

        Provider provider = new Provider(2001, "Lindsey", "Bruscia", "Esthetician", "Monday");
        Service service = new Service(3001, "HydraFacial", "Esthetician");

        boolean certifiedResult = scheduler.isProviderCertified(provider, service);
        boolean availableResult = scheduler.isProviderAvailable(provider, "Monday");

        System.out.println("Unit Test 1 - Provider Certification Check:");
        System.out.println("Expected: true");
        System.out.println("Actual: " + certifiedResult);

        System.out.println();

        System.out.println("Unit Test 2 - Provider Availability Check:");
        System.out.println("Expected: true");
        System.out.println("Actual: " + availableResult);
    }
}


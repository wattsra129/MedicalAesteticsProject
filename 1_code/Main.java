
public class Main {
    public static void main(String[] args) {

        Client client1 = new Client(1001, "Rachel", "Watts");
        Client client2 = new Client(1002, "Kiannah", "Davy");

        Provider provider1 = new Provider(2001, "Lindsey", "Bruscia", "Esthetician", "Monday");
        Provider provider2 = new Provider(2002, "Nora", "Szabo", "Nurse Injector", "Thursday");

        Service service1 = new Service(3001, "HydraFacial", "Esthetician");
        Service service2 = new Service(3002, "Botox Consultation", "Nurse Injector");

        AppointmentScheduler scheduler = new AppointmentScheduler();

        System.out.println("Medical Esthetics Appointment & Client Management System");
        System.out.println("--------------------------------------------------------");

        System.out.println("\nAvailable Clients:");
        System.out.println(client1.getClientID() + " - " + client1.getFullName());
        System.out.println(client2.getClientID() + " - " + client2.getFullName());

        System.out.println("\nAvailable Providers:");
        System.out.println(provider1.getProviderID() + " - " + provider1.getFullName());
        System.out.println(provider2.getProviderID() + " - " + provider2.getFullName());

        System.out.println("\nScheduling Appointment...");
        Appointment appointment = scheduler.scheduleAppointment(client1, provider1, service1, "Monday", "9:00 AM");

        if (appointment != null) {
            System.out.println();
            appointment.displayAppointment();
        }

        System.out.println("\nTesting Automatic Error Check:");
        scheduler.scheduleAppointment(client2, provider1, service2, "Monday", "3:00 PM");
    }
}

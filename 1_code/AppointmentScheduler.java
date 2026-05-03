
public class AppointmentScheduler {

    public boolean isProviderCertified(Provider provider, Service service) {
        return provider.getCertification().equalsIgnoreCase(service.getRequiredCertification());
    }

    public boolean isProviderAvailable(Provider provider, String requestedDay) {
        return provider.getAvailableDay().equalsIgnoreCase(requestedDay);
    }

    public Appointment scheduleAppointment(Client client, Provider provider, Service service, String day, String time) {
        try {
            if (client == null || provider == null || service == null) {
                System.out.println("Error: Client, provider, and service are required.");
                return null;
            }

            if (!isProviderCertified(provider, service)) {
                System.out.println("Error: Provider is not certified for this service.");
                return null;
            }

            if (!isProviderAvailable(provider, day)) {
                System.out.println("Error: Provider is not available on " + day + ".");
                return null;
            }

            return new Appointment(client, provider, service, day, time);

        } catch (Exception error) {
            System.out.println("Unexpected system error: " + error.getMessage());
            return null;
        }
    }
}

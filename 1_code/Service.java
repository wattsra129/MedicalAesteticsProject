
public class Service {
    private int serviceID;
    private String serviceName;
    private String requiredCertification;

    public Service(int serviceID, String serviceName, String requiredCertification) {
        this.serviceID = serviceID;
        this.serviceName = serviceName;
        this.requiredCertification = requiredCertification;
    }

    public int getServiceID() {
        return serviceID;
    }

    public String getServiceName() {
        return serviceName;
    }

    public String getRequiredCertification() {
        return requiredCertification;
    }
}

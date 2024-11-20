
public class Appointment {

    private final String patientName;
    private final String mobilePhone;
    private final String preferredTime;
    private final HealthProfessional doctor;

    // Default constructor
    public Appointment() {
        this.patientName = "Unknown";
        this.mobilePhone = "0000000000";
        this.preferredTime = "00:00";
        this.doctor = null;
    }

    // Initializes the constructor of all instance variables
    public Appointment(String patientName, String mobilePhone, String preferredTime, HealthProfessional doctor) {
        this.patientName = patientName;
        this.mobilePhone = mobilePhone;
        this.preferredTime = preferredTime;
        this.doctor = doctor;
    }

    // A method for printing instance variables
    public void printDetails() {
        System.out.println("Patient Name: " + patientName + ", Mobile: " + mobilePhone
                + ", Time: " + preferredTime);
        System.out.print("Doctor Details: ");
        doctor.printDetails();
    }

    // Getter method
    public String getMobilePhone() {
        return mobilePhone;
    }
}

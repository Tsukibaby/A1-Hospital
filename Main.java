
import java.util.ArrayList;

public class Main {

    // 创建新预约的方法
    public static void createAppointment(ArrayList<Appointment> appointments, String patientName, String mobilePhone,
            String time, HealthProfessional doctor) {
        if (patientName.isEmpty() || mobilePhone.isEmpty() || time.isEmpty() || doctor == null) {
            System.out.println("Invalid appointment details. Appointment not created.");
            return;
        }
        appointments.add(new Appointment(patientName, mobilePhone, time, doctor));
    }

    // 打印现有预约的方法
    public static void printExistingAppointments(ArrayList<Appointment> appointments) {
        if (appointments.isEmpty()) {
            System.out.println("No appointments found.");
            return;
        }
        for (Appointment appointment : appointments) {
            appointment.printDetails();
            System.out.println("------------------------------");
        }
    }

    // 取消预约的方法
    public static void cancelBooking(ArrayList<Appointment> appointments, String mobilePhone) {
        boolean found = false;
        for (int i = 0; i < appointments.size(); i++) {
            if (appointments.get(i).getMobilePhone().equals(mobilePhone)) {
                appointments.remove(i);
                found = true;
                System.out.println("Appointment with mobile phone " + mobilePhone + " has been cancelled.");
                break;
            }
        }
        if (!found) {
            System.out.println("No appointment found with mobile phone " + mobilePhone + ".");
        }
    }

    public static void main(String[] args) {
        // Part 3 – Using classes and objects
        GeneralPractitioner gp1 = new GeneralPractitioner("Dr. Alice", "General Medicine", 5);
        GeneralPractitioner gp2 = new GeneralPractitioner("Dr. Bob", "Family Medicine", 10);
        Specialist sp1 = new Specialist("Dr. Charlie", "Cardiology", "Heart Specialist");

        gp1.printDetails();
        gp2.printDetails();
        sp1.printDetails();

        System.out.println("------------------------------");

        // Part 5 – Collection of appointments
        ArrayList<Appointment> appointments = new ArrayList<>();
        createAppointment(appointments, "John Doe", "1234567890", "10:00", gp1);
        createAppointment(appointments, "Jane Smith", "0987654321", "11:30", sp1);

        printExistingAppointments(appointments);
        cancelBooking(appointments, "1234567890");
        printExistingAppointments(appointments);
    }
}

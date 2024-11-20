
public class Specialist extends HealthProfessional {

    private final String specialty; // 专业领域

    // 默认构造方法
    public Specialist() {
        super();
        this.specialty = "Unknown";
    }

    // 初始化所有实例变量的构造方法
    public Specialist(String name, String department, String specialty) {
        super(name, department);
        this.specialty = specialty;
    }

    // 打印详细信息的方法
    @Override
    public void printDetails() {
        super.printDetails();
        System.out.println("Type: Specialist, Specialty: " + specialty);
    }
}

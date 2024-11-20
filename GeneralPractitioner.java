
public class GeneralPractitioner extends HealthProfessional {

    private final int yearsOfExperience; // 额外变量

    // 默认构造方法
    public GeneralPractitioner() {
        super(); // 调用父类默认构造方法
        this.yearsOfExperience = 0;
    }

    // 初始化所有实例变量的构造方法
    public GeneralPractitioner(String name, String department, int yearsOfExperience) {
        super(name, department); // 调用父类构造方法
        this.yearsOfExperience = yearsOfExperience;
    }

    // 打印详细信息的方法
    @Override
    public void printDetails() {
        super.printDetails();
        System.out.println("Type: General Practitioner, Years of Experience: " + yearsOfExperience);
    }
}

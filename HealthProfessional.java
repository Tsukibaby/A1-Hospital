
public class HealthProfessional {

    private static int idCounter = 0; // 自动生成唯一ID
    private final int id;
    private final String name;
    private final String department; // 描述基础信息

    // 默认构造方法
    public HealthProfessional() {
        this.id = ++idCounter;
        this.name = "Unknown";
        this.department = "General";
    }

    // 初始化所有实例变量的构造方法
    public HealthProfessional(String name, String department) {
        this.id = ++idCounter;
        this.name = name;
        this.department = department;
    }

    // 打印实例变量的方法
    public void printDetails() {
        System.out.println("ID: " + id + ", Name: " + name + ", Department: " + department);
    }

    // Getter 方法
    public String getName() {
        return name;
    }
}

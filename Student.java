public class Student {
    private String name;
    private int age;
    private double gpa;

    public Student(String name, int age, double gpa) {
        this.name = name;
        this.age = age;
        this.gpa = gpa;
    }

    public void printInfo() {
        System.out.println("Name: " + name + ", Age: " + age + ", GPA: " + gpa);
    }

    // Main method for testing
    public static void main(String[] args) {
        Student student1 = new Student("Bao Nguyen", 21, 3.8);
        student1.printInfo();
    }
}

import java.util.Scanner;

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

    public boolean isHonorStudent() {
        return gpa >= 3.5;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your name: ");
        String inputName = scanner.nextLine();

        System.out.print("Enter your age: ");
        int inputAge = scanner.nextInt();

        System.out.print("Enter your GPA: ");
        double inputGPA = scanner.nextDouble();

        Student student1 = new Student(inputName, inputAge, inputGPA);

        student1.printInfo();
        System.out.println("Honor Student: " + student1.isHonorStudent());

        scanner.close();
    }
}

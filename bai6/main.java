package bai6;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        School school = new School();
        while (true) {
            System.out.println(" 1 : insert Student");
            System.out.println(" 2 : show Student 20 age");
            System.out.println(" 3 : show Student 23 age , address DN");
            String line = sc.nextLine();
            switch (line) {
                case "1": {
                    System.out.println("name : ");
                    String name = sc.nextLine();
                    System.out.println("Age : ");
                    int age = sc.nextInt();
                    System.out.println("Address : ");
                    sc.nextLine();
                    String address = sc.nextLine();

                    System.out.println("Class : ");
                    String classStudent = sc.nextLine();
                    Student student = new Student(name, age, address, classStudent);
                    school.addStudent(student);
                    System.out.println(student.toString());
                    break;
                }
                case "2": {
                    int age = 20;
                    System.out.println(school.showStudent(age).toString());
                    break;
                }
                case "3": {
                    int age = 23;
                    String address = "DN";
                    school.showStudentsss(age, address).toString();
                    break;
                }

                default:
                    break;
            }
        }
    }
}

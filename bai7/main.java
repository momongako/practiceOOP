package bai7;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ManageTeacher manageTeacher = new ManageTeacher();
        while (true) {
            System.out.println("show input for user choise");
            System.out.println("1 : to insert");
            System.out.println("2 : to remove");
            System.out.println("3 : get salary");
            System.out.println("4 : Exit");
            System.out.println("5 : show");
            String line = sc.nextLine();
            switch (line) {
                case "1": {
                    System.out.print("Name : ");
                    String name = sc.nextLine();
                    System.out.print("Age : ");
                    int age = sc.nextInt();
                    System.out.print("Address : ");
                    sc.nextLine();
                    String address = sc.nextLine();
                    System.out.print("numberTeacher : ");
                    String numberTeacher = sc.nextLine();
                    System.out.print("Price hard : ");
                    int priceHard = sc.nextInt();
                    System.out.print("Price Bonus : ");
                    int priceBonus = sc.nextInt();
                    System.out.print("Fine : ");
                    int fine = sc.nextInt();
                    int priceReal = (priceHard + priceHard + fine);
                    Man man = new Man(name, age, address, numberTeacher, priceHard, priceBonus, fine);
                    manageTeacher.addMan(man);
                    System.out.println(man.toString());
                    break;
                }
                case "2": {
                    System.out.print("numberTeacher : ");
                    String numberTeacher = sc.nextLine();
                    manageTeacher.deleteTeacher(numberTeacher);
                    break;

                }
                case "3": {
                    System.out.print("numberTeacher : ");
                    String numberTeacher = sc.nextLine();

                    System.out.println(manageTeacher.calculator(numberTeacher));
                    break;
                }
                case "4": {
                    return;
                }
                case "5": {
                    manageTeacher.show();
                    break;
                }

                default:
                    System.out.println("error");
                    break;
            }
        }
    }
}

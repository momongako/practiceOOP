package bai5;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Hotel hotelss = new Hotel();
        while (true) {
            System.out.println("Application Manager Candidate");
            System.out.println("Enter 1: To insert person for rent");
            System.out.println("Enter 2: To remove person by passport");
            System.out.println("Enter 3: To calculator price by passport");
            System.out.println("Enter 4: To show infor");
            System.out.println("Enter 5: To exit:");
            String line = sc.nextLine();
            switch (line) {
                case "1": {
                    System.out.print("insert name : ");
                    String name = sc.nextLine();
                    System.out.print("insert age : ");
                    int age = sc.nextInt();
                    System.out.println("insert cmnd : ");
                    sc.nextLine();
                    String cmnd = sc.nextLine();
                    System.out.println("Choise a to rent room type A");
                    System.out.println("Choise b to rent room type B");
                    System.out.println("Choise c to rent room type C");
                    String choise = sc.nextLine();
                    Room typeRoom;
                    if (choise.equals("a")) {
                        typeRoom = new RoomA();
                    } else if (choise.equals("b")) {
                        typeRoom = new RoomB();
                    } else if (choise.equals("c")) {
                        typeRoom = new RoomC();
                    } else {
                        continue;

                    }
                    System.out.println("insert day : ");
                    int day = sc.nextInt();
                    Human human = new Human(name, age, cmnd, day, typeRoom);
                    hotelss.addHuman(human);
                    System.out.println(human.toString());
                }
                case "2": {
                    System.out.print("insert cmnd : ");
                    String cmnd = sc.nextLine();
                    hotelss.deleteHuman(cmnd);
                    break;
                }
                case "3": {
                    System.out.println("insert cmnd");
                    String cmnd = sc.nextLine();

                    System.out.println(hotelss.calculator(cmnd));
                    break;
                }
                case "4": {
                    hotelss.show();

                    break;
                }
                case "5": {
                    return;
                }

                default:
                    System.out.println("error");
                    break;
            }
        }
    }
}

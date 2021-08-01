package bai4;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Town town = new Town();
        List<Town> towns = new ArrayList<>();
        System.out.println("insert n :");
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {

            System.out.println("insert address : ");
            String address = sc.nextLine();

            sc.nextLine();
            List<Human> human = new ArrayList<>();
            System.out.println("insert Human : ");
            int number = sc.nextInt();
            for (int j = 0; j < number; j++) {
                System.out.print("Name : ");
                String names = sc.nextLine();
                sc.nextLine();
                System.out.print("Age : ");
                String age = sc.nextLine();
                System.out.print("Work :");
                String work = sc.nextLine();
                System.out.print("CMND : ");
                String cmnd = sc.nextLine();
                Human humans = new Human(names, age, work, cmnd);
                human.add(humans);
                System.out.println(human.toString());
                sc.nextLine();
            }
            Family familyac = new Family(human, address);
            town.addFamily(familyac);
            System.out.println(familyac.toString());
        }
    }
}

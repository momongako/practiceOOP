package bai8;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sinhvien sinhviens = new sinhvien();
        while (true) {
            System.out.println("1 : add New");
            System.out.println("2 : show");
            System.out.println("3 : delete");
            System.out.println("4 : Exit");
            String Line = sc.nextLine();
            switch (Line) {
                case "1": {
                    System.out.println("id : ");
                    String id = sc.nextLine();
                    System.out.println("ngày mượn : ");
                    int ngaymuon = sc.nextInt();
                    System.out.println("ngày trả : ");
                    int ngaytra = sc.nextInt();
                    System.out.println("số sách : ");
                    sc.nextLine();
                    String sosach = sc.nextLine();

                    System.out.println("name : ");
                    String name = sc.nextLine();
                    System.out.println("Age : ");
                    int age = sc.nextInt();
                    System.out.println("Lớp : ");
                    sc.nextLine();
                    String lop = sc.nextLine();
                    themuon thes = new themuon(id, ngaymuon, ngaytra, sosach, name, age, lop);
                    sinhviens.add(thes);
                    System.out.println(thes.toString());
                    break;
                }
                case "2": {
                    sinhviens.show();
                    break;
                }
                case "3": {
                    System.out.print("id : ");
                    String id = sc.nextLine();

                    System.out.println(sinhviens.deleteTeacher(id));
                    break;
                }
                case "4": {
                    return;
                }

                default:
                    break;
            }
        }
    }
}

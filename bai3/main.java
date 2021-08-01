package bai3;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        ManageStudent manageStudent = new ManageStudent();
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("Application Manager Candidate");
            System.out.println("Enter 1: To insert candidate");
            System.out.println("Enter 2: To show information of candidate: ");
            System.out.println("Enter 3: To search candidate by id");
            System.out.println("Enter 4: To exit:");

            String Line = sc.nextLine();
            switch (Line) {
                case "1": {
                    System.out.println("Enter a: to insert Candidate A");
                    System.out.println("Enter b: to insert Candidate B");
                    System.out.println("Enter c: to insert Candidate C");
                    String type = sc.nextLine();
                    switch (type) {
                        case "a": {
                            System.out.print("nhập sbd :");
                            String sbd = sc.nextLine();
                            System.out.print("tên : ");
                            String name = sc.nextLine();
                            System.out.print("địa chỉ : ");
                            String address = sc.nextLine();
                            System.out.print("Enter Priotity: ");
                            String mut = sc.nextLine();
                            Studentsa studenta = new StudentA(sbd, name, address, mut);
                            manageStudent.add(studenta);
                            System.out.println(studenta.toString());
                            sc.nextLine();

                            break;
                        }
                        case "b": {
                            System.out.print("nhập sbd :");
                            String sbd = sc.nextLine();
                            System.out.print("tên : ");
                            String name = sc.nextLine();
                            System.out.print("địa chỉ : ");
                            String address = sc.nextLine();
                            System.out.print("Enter Priotity: ");
                            String mut = sc.nextLine();
                            Studentsa studenta = new StudentA(sbd, name, address, mut);
                            manageStudent.add(studenta);
                            System.out.println(studenta.toString());
                            sc.nextLine();
                        }
                        case "c": {
                            System.out.print("nhập sbd :");
                            String sbd = sc.nextLine();
                            System.out.print("tên : ");
                            String name = sc.nextLine();
                            System.out.print("địa chỉ : ");
                            String address = sc.nextLine();
                            System.out.print("Enter Priotity: ");
                            String mut = sc.nextLine();
                            Studentsa studenta = new StudentA(sbd, name, address, mut);
                            manageStudent.add(studenta);
                            System.out.println(studenta.toString());
                            sc.nextLine();
                        }
                        default:
                            System.out.println("error");
                            break;
                    }
                    break;
                }
                case "2": {
                    manageStudent.show();
                    break;
                }
                case "3": {
                    System.out.println("nhập số báo danh");
                    String sbd = sc.nextLine();
                    if (manageStudent.searchMVS(sbd).size() == 0) {
                        System.out.println("Not Name");
                    } else {
                        System.out.println((manageStudent.searchMVS(sbd).toString()));
                    }
                    break;
                }
                case "4": {
                    return;
                }

                default:
                    System.out.println("nhập sai");
                    continue;
            }
        }
    }
}

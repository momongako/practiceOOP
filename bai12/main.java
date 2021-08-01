package bai12;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        QLPTGT qlptgt = new QLPTGT();
        while (true) {
            System.out.println("1 : add New");
            System.out.println("2 : delete by Id");
            System.out.println("3 : Search by car company and color");
            System.out.println("4 : show");
            System.out.println("5 : Exit");
            String line = sc.nextLine();
            switch (line) {
                case "1": {
                    System.out.println("a : add Car");
                    System.out.println("b : add Motorbike");
                    System.out.println("c : add Truck");
                    String key = sc.nextLine();
                    switch (key) {
                        case "a": {
                            System.out.println("ID : ");
                            String id = sc.nextLine();
                            System.out.println("Hãng : ");
                            String hang = sc.nextLine();
                            System.out.println("Năm sản xuất : ");
                            String namSanxuat = sc.nextLine();
                            System.out.println("Giá : ");
                            int gia = sc.nextInt();
                            System.out.println("Màu : ");
                            sc.nextLine();
                            String color = sc.nextLine();
                            System.out.println("Số chỗ ngồi : ");
                            int soChoNgoi = sc.nextInt();
                            System.out.println("kiểu động cơ : ");
                            sc.nextLine();
                            String kieuDongCo = sc.nextLine();
                            Oto xeoto = new Oto(id, hang, namSanxuat, gia, color, soChoNgoi, kieuDongCo);
                            qlptgt.addPTGT(xeoto);
                            System.out.println(xeoto.toString());
                            sc.nextLine();
                            break;
                        }
                        case "b": {
                            System.out.println("ID : ");
                            String id = sc.nextLine();
                            System.out.println("Hãng : ");
                            String hang = sc.nextLine();
                            System.out.println("Năm sản xuất : ");
                            String namSanxuat = sc.nextLine();
                            System.out.println("Giá : ");
                            int gia = sc.nextInt();
                            System.out.println("Màu : ");
                            String color = sc.nextLine();
                            System.out.println("Công xuất : ");
                            String congXuat = sc.nextLine();

                            XeMay xemay = new XeMay(id, hang, namSanxuat, gia, color, congXuat);
                            qlptgt.addPTGT(xemay);
                            System.out.println(xemay.toString());
                            break;
                        }
                        case "c": {
                            System.out.println("ID : ");
                            String id = sc.nextLine();
                            System.out.println("Hãng : ");
                            String hang = sc.nextLine();
                            System.out.println("Năm sản xuất : ");
                            String namSanxuat = sc.nextLine();
                            System.out.println("Giá : ");
                            int gia = sc.nextInt();
                            System.out.println("Màu : ");
                            String color = sc.nextLine();
                            System.out.println("Trọng tải : ");
                            String trongTai = sc.nextLine();

                            XeTai tai = new XeTai(id, hang, namSanxuat, gia, color, trongTai);
                            qlptgt.addPTGT(tai);
                            System.out.println(tai.toString());
                            break;
                        }

                        default:
                            break;
                    }
                    break;
                }
                case "2": {
                    System.out.println("ID : ");
                    String id = sc.nextLine();
                    qlptgt.delete(id);
                    break;
                }
                case "3": {
                    System.out.println("hãng xe : ");
                    String hang = sc.nextLine();
                    System.out.println("màu : ");
                    String color = sc.nextLine();
                    System.out.println(qlptgt.SearchByName(hang, color).toString());
                    break;
                }
                case "4": {
                    qlptgt.show();
                    break;
                }
                case "5": {
                    return;
                }

                default:
                    break;
            }
        }
    }
}

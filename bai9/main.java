package bai9;

import java.util.ArrayList;
import java.util.Scanner;

public class main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ManageKhachHang manageKhachHang = new ManageKhachHang();
        ArrayList<KhachHang> list = new ArrayList<>();

        while (true) {
            System.out.println("1 : add New");
            System.out.println("2 : delete");
            System.out.println("3 : update");
            System.out.println("4 : Show");
            System.out.println("5 : Tiền điện");
            System.out.println("6 : Exit");
            String line = sc.nextLine();
            switch (line) {
                case "1": {

                    System.out.print("Name : ");
                    String name = sc.nextLine();
                    System.out.print("Number Home : ");
                    String numberHome = sc.nextLine();
                    System.out.print("Mã công tơ : ");
                    String maSoCongTo = sc.nextLine();
                    System.out.print("Hộ sử dụng điện : ");
                    String hoSudungDien = sc.nextLine();
                    System.out.print("Chỉ số điện cũ : ");
                    int chiSoDienCu = sc.nextInt();
                    System.out.print("Chỉ số điện mới : ");
                    int chiSoDienMoi = sc.nextInt();
                    System.out.print("Giá : ");
                    int price = (chiSoDienMoi - chiSoDienCu) * 5;
                    KhachHang bienlai = new BienLai(name, numberHome, maSoCongTo, hoSudungDien, chiSoDienCu,
                            chiSoDienMoi, price);
                    manageKhachHang.add(bienlai);
                    System.out.println(bienlai.toString());
                    sc.nextLine();
                    break;
                }
                case "2": {
                    System.out.println("Number Home : ");
                    String numberHome = sc.nextLine();
                    manageKhachHang.deleteTeacher(numberHome);
                    break;
                }
                case "3": {

                    manageKhachHang.uppdateKhachhang();
                    manageKhachHang.toString();
                    break;

                }
                case "4": {
                    manageKhachHang.show();
                    break;
                }
                case "5": {
                    System.out.println("nhập tên hộ gia đình cần tính tiền điện");
                    String name = sc.nextLine();
                    System.out.println(manageKhachHang.calculator(name));
                    break;
                }
                case "6": {
                    return;
                }
                default:
                    break;
            }
        }
    }

}

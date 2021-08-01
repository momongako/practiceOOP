package bai9;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ManageKhachHang {
    List<KhachHang> khachHangs;

    public ManageKhachHang() {
        this.khachHangs = new ArrayList<>();
    }

    public void add(KhachHang khachhang) {
        khachHangs.add(khachhang);
    }

    public void uppdateKhachhang() {
        int i;
        Scanner sc = new Scanner(System.in);
        System.out.println("tên cần sửa");
        String tencansua = sc.nextLine();
        for (i = 0; i < khachHangs.size(); i++) {
            if (khachHangs.get(i).getName().equals(tencansua)) {
                System.out.print("Insert new");

                System.out.print("Name : ");
                String namem = sc.nextLine();
                khachHangs.get(i).setName(namem);

                System.out.print("Number Home : ");
                String numberHomed = sc.nextLine();
                khachHangs.get(i).setNumberHome(numberHomed);

                System.out.print("Mã công tơ : ");
                String maSoCongTom = sc.nextLine();
                khachHangs.get(i).setMaSoCongTo(maSoCongTom);

                System.out.print("Hộ sử dụng điện : ");
                String hoSudungDienm = sc.nextLine();
                ((BienLai) khachHangs.get(i)).setHoSudungDien(hoSudungDienm);

                System.out.print("Chỉ số điện cũ : ");
                int chiSoDienCum = sc.nextInt();
                ((BienLai) khachHangs.get(i)).setChiSoDienCu(chiSoDienCum);

                System.out.print("Chỉ số điện mới : ");
                int chiSoDienMoim = sc.nextInt();
                ((BienLai) khachHangs.get(i)).setChiSoDienMoi(chiSoDienMoim);

                System.out.print("Giá : ");
                int pricem = sc.nextInt();
                ((BienLai) khachHangs.get(i)).setPrice(pricem);

            }
            if (tencansua.equals(null)) {
                System.out.println("ko có Tên");
            }
        }
    }

    public int calculator(String name) {
        KhachHang khachHangsss = this.khachHangs.stream().filter(p -> p.getName().equals(name)).findFirst()
                .orElse(null);
        if (khachHangsss == null) {
            return 0;
        }

        return (((BienLai) khachHangsss).getChiSoDienMoi() - ((BienLai) khachHangsss).getChiSoDienCu()) * 5;
    }

    public boolean deleteTeacher(String numberHome) {
        KhachHang doc = this.khachHangs.stream().filter(manss -> manss.getNumberHome().equals(numberHome)).findFirst()
                .orElse(null);
        if (doc == null) {
            return false;
        }
        this.khachHangs.remove(doc);
        return true;
    }

    public void show() {
        for (KhachHang khachHang : khachHangs) {
            System.out.println(khachHang.toString());
        }
    }
}

package bai9;

public class BienLai extends KhachHang {
    public BienLai(String name, String numberHome, String maSoCongTo, String hoSudungDien, int chiSoDienCu,
            int chiSoDienMoi, int price) {
        super(name, numberHome, maSoCongTo);
        // TODO Auto-generated constructor stub
        this.hoSudungDien = hoSudungDien;
        this.chiSoDienCu = chiSoDienCu;
        this.chiSoDienMoi = chiSoDienMoi;
        this.price = price;
    }

    private String hoSudungDien;
    private int chiSoDienCu;
    private int chiSoDienMoi;
    private int price;

    public String getHoSudungDien() {
        return hoSudungDien;
    }

    public void setHoSudungDien(String hoSudungDien) {
        this.hoSudungDien = hoSudungDien;
    }

    public int getChiSoDienCu() {
        return chiSoDienCu;
    }

    public void setChiSoDienCu(int chiSoDienCu) {
        this.chiSoDienCu = chiSoDienCu;
    }

    public int getChiSoDienMoi() {
        return chiSoDienMoi;
    }

    public void setChiSoDienMoi(int chiSoDienMoi) {
        this.chiSoDienMoi = chiSoDienMoi;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "BienLai [maSoCongTo=" + getMaSoCongTo() + ", name=" + getName() + ", numberHome=" + getNumberHome()
                + "HoSudungDien=" + getHoSudungDien() + ", chiSoDienCu=" + chiSoDienCu + ", chiSoDienMoi="
                + chiSoDienMoi + ", price=" + price + "]";
    }

}

package bai12;

public class Oto extends CongAn {
    private int soChoNgoi;
    private String kieuDongCo;

    public Oto(String id, String hang, String namSanxuat, int gia, String color, int soChoNgoi, String kieuDongCo) {
        super(id, hang, namSanxuat, gia, color);
        // TODO Auto-generated constructor stub
        this.soChoNgoi = soChoNgoi;
        this.kieuDongCo = kieuDongCo;
    }

    public int getSoChoNgoi() {
        return soChoNgoi;
    }

    public void setSoChoNgoi(int soChoNgoi) {
        this.soChoNgoi = soChoNgoi;
    }

    public String getKieuDongCo() {
        return kieuDongCo;
    }

    public void setKieuDongCo(String kieuDongCo) {
        this.kieuDongCo = kieuDongCo;
    }

    @Override
    public String toString() {
        return "Oto [SoChoNgoi=" + soChoNgoi + ", kieuDongCo=" + kieuDongCo + " Gia=" + gia + ", hang=" + hang
                + ", color=" + color + ", id=" + id + ", namSanxuat=" + namSanxuat + "]";
    }

}

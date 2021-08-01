package bai12;

public class CongAn {
    protected String id;
    protected String hang;
    protected String namSanxuat;
    protected int gia;
    protected String color;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getHang() {
        return hang;
    }

    public void setHang(String hang) {
        this.hang = hang;
    }

    public String getNamSanxuat() {
        return namSanxuat;
    }

    public void setNamSanxuat(String namSanxuat) {
        this.namSanxuat = namSanxuat;
    }

    public int getGia() {
        return gia;
    }

    public void setGia(int gia) {
        this.gia = gia;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public CongAn(String id, String hang, String namSanxuat, int gia, String color) {
        this.id = id;
        this.hang = hang;
        this.namSanxuat = namSanxuat;
        this.gia = gia;
        this.color = color;
    }

}

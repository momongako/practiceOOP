package bai9;

public class KhachHang {

    protected String name;
    protected String numberHome;
    protected String maSoCongTo;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNumberHome() {
        return numberHome;
    }

    public void setNumberHome(String numberHome) {
        this.numberHome = numberHome;
    }

    public String getMaSoCongTo() {
        return maSoCongTo;
    }

    public void setMaSoCongTo(String maSoCongTo) {
        this.maSoCongTo = maSoCongTo;
    }

    public KhachHang(String name, String numberHome, String maSoCongTo) {
        this.name = name;
        this.numberHome = numberHome;
        this.maSoCongTo = maSoCongTo;
    }

}

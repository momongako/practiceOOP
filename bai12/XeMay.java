package bai12;

public class XeMay extends CongAn {
    public XeMay(String id, String hang, String namSanxuat, int gia, String color, String congXuat) {
        super(id, hang, namSanxuat, gia, color);
        // TODO Auto-generated constructor stub
        this.congXuat = congXuat;
    }

    public String getCongXuat() {
        return congXuat;
    }

    public void setCongXuat(String congXuat) {
        this.congXuat = congXuat;
    }

    private String congXuat;

    @Override
    public String toString() {
        return "XeMay [CongXuat=" + congXuat + "Gia=" + gia + ", Hang=" + hang + ", color=" + color + ", id=" + id
                + ", namSanxuat=" + namSanxuat + "]";
    }

}

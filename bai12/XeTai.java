package bai12;

public class XeTai extends CongAn {
    private String trongTai;

    public XeTai(String id, String hang, String namSanxuat, int gia, String color, String trongTai) {
        super(id, hang, namSanxuat, gia, color);
        // TODO Auto-generated constructor stub
        this.trongTai = trongTai;
    }

    public String getTrongTai() {
        return trongTai;
    }

    public void setTrongTai(String trongTai) {
        this.trongTai = trongTai;
    }

    @Override
    public String toString() {
        return "XeTai [trongTai=" + trongTai + "Gia=" + gia + ", Hang=" + hang + ", color=" + color + ", id=" + id
                + ", namSanxuat=" + namSanxuat + "]";
    }

}

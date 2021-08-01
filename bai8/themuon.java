package bai8;

public class themuon {
    private String id;
    private int ngaymuon;
    private int ngaytra;
    private String sosach;
    private String name;
    private int age;
    private String lop;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public int getNgaymuon() {
        return ngaymuon;
    }

    public void setNgaymuon(int ngaymuon) {
        this.ngaymuon = ngaymuon;
    }

    public int getNgaytra() {
        return ngaytra;
    }

    public void setNgaytra(int ngaytra) {
        this.ngaytra = ngaytra;
    }

    public String getSosach() {
        return sosach;
    }

    public void setSosach(String sosach) {
        this.sosach = sosach;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getLop() {
        return lop;
    }

    public void setLop(String lop) {
        this.lop = lop;
    }

    public themuon(String id, int ngaymuon, int ngaytra, String sosach, String name, int age, String lop) {
        this.id = id;
        this.ngaymuon = ngaymuon;
        this.ngaytra = ngaytra;
        this.sosach = sosach;
        this.name = name;
        this.age = age;
        this.lop = lop;
    }

    @Override
    public String toString() {
        return "themuon [age=" + age + ", id=" + id + ", lop=" + lop + ", name=" + name + ", ngaymuon=" + ngaymuon
                + ", ngaytra=" + ngaytra + ", sosach=" + sosach + "]";
    }
}

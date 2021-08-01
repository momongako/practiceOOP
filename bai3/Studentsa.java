package bai3;

public class Studentsa {
    protected String sbd;
    protected String name;
    protected String address;
    protected String mut;

    public String getSbd() {
        return sbd;
    }

    public void setSbd(String sbd) {
        this.sbd = sbd;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getMut() {
        return mut;
    }

    public void setMut(String mut) {
        this.mut = mut;
    }

    public Studentsa(String sbd, String name, String address, String mut) {
        this.sbd = sbd;
        this.name = name;
        this.address = address;
        this.mut = mut;
    }

}

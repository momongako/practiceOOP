package bai4;

import java.util.List;

public class Family {
    private List<Human> human;
    private String address;

    public Family(List<Human> human, String address) {
        this.human = human;
        this.address = address;
    }

    public List<Human> getHuman() {
        return human;
    }

    public void setHuman(List<Human> human) {
        this.human = human;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "Family [address=" + address + ", human=" + human + "]";
    }

}

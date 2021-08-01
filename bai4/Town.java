package bai4;

import java.util.ArrayList;
import java.util.List;

public class Town {
    List<Family> family;

    public Town() {
        this.family = new ArrayList<>();
    }

    public void addFamily(Family familys) {

        this.family.add(familys);

    }

    public List<Family> getFamily() {
        return family;
    }

    public void setFamily(List<Family> family) {
        this.family = family;
    }

}

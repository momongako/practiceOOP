package bai8;

import java.util.ArrayList;
import java.util.List;

/**
 * sinhvien
 */
public class sinhvien {

    List<themuon> thes;

    public sinhvien() {
        this.thes = new ArrayList<>();
    }

    public void add(themuon the) {
        this.thes.add(the);
    }

    public void show() {
        for (themuon themuons : thes) {
            System.out.println(themuons.toString());
        }
    }

    public boolean deleteTeacher(String id) {
        themuon doc = this.thes.stream().filter(manss -> manss.getId().equals(id)).findFirst().orElse(null);
        if (doc == null) {
            return false;
        }
        this.thes.remove(doc);
        return true;
    }
}
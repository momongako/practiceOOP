package bai12;

import java.util.ArrayList;
import java.util.List;

public class QLPTGT {
    List<CongAn> congans;

    public QLPTGT() {
        this.congans = new ArrayList<>();
    }

    public void addPTGT(CongAn congan) {
        congans.add(congan);
    }

    public void show() {
        for (CongAn congAn : congans) {
            System.out.println(congAn.toString());
        }
    }

    public boolean delete(String id) {
        CongAn doc = this.congans.stream().filter(manss -> manss.getId().equals(id)).findFirst().orElse(null);
        if (doc == null) {
            return false;
        }
        this.congans.remove(doc);
        return true;
    }

    public List SearchByName(String hang, String color) {

        List CadresByName = new ArrayList<>();

        for (CongAn cadres : this.congans) {

            if (cadres.getHang().contains(hang) && cadres.getColor().contains(color)) {

                CadresByName.add(cadres);
            }

        }
        return CadresByName;

    }
}

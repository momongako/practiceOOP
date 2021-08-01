package bai11;

import java.util.ArrayList;
import java.util.List;

public class ManageSoPhuc {
    List<SoPhuc> soPhucs;

    public ManageSoPhuc() {
        this.soPhucs = new ArrayList<>();
    }

    public void add(SoPhuc soPhuc) {
        soPhucs.add(soPhuc);
    }

    public void show() {
        for (SoPhuc soPhuc : soPhucs) {
            System.out.println(soPhuc.toString());
        }
    }

    public int sum(double phanao, double phanthuc) {

        return (int) ((SoPhuc) soPhucs).getPhanAo() + (int) ((SoPhuc) soPhucs).getPhanThuc();

    }

    public int sum1(double phanao, double phanthuc) {

        return (int) ((SoPhuc) soPhucs).getPhanAo() * (int) ((SoPhuc) soPhucs).getPhanThuc();

    }
}

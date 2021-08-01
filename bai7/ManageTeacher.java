package bai7;

import java.util.ArrayList;
import java.util.List;

public class ManageTeacher {
    List<Man> mans;

    public ManageTeacher() {
        this.mans = new ArrayList<>();
    }

    public void addMan(Man man) {
        this.mans.add(man);
    }

    public boolean deleteTeacher(String numberTeacher) {
        Man doc = this.mans.stream().filter(manss -> manss.getNumberTeacher().equals(numberTeacher)).findFirst()
                .orElse(null);
        if (doc == null) {
            return false;
        }
        this.mans.remove(doc);
        return true;
    }

    public int calculator(String numberTeacher) {
        Man man = this.mans.stream().filter(p -> p.getNumberTeacher().equals(numberTeacher)).findFirst().orElse(null);
        if (man == null) {
            return 0;
        }
        return man.getPriceHard() + man.getPriceBonus() - man.getFine();
    }

    public void show() {
        for (Man man : mans) {
            System.out.println(mans.toString());
        }
    }
}

package bai5;

import java.util.ArrayList;
import java.util.List;

public class Hotel {
    private List<Human> humans;

    public Hotel() {
        humans = new ArrayList<>();
    }

    public void addHuman(Human human) {
        this.humans.add(human);
    }

    public boolean deleteHuman(String cmnd) {
        Human doc = this.humans.stream().filter(humanss -> humanss.getCmnd().equals(cmnd)).findFirst().orElse(null);
        if (doc == null) {
            return false;
        }
        this.humans.remove(doc);
        return true;
    }

    public int calculator(String cmnd) {
        Human human = this.humans.stream().filter(p -> p.getCmnd().equals(cmnd)).findFirst().orElse(null);
        if (human == null) {
            return 0;
        }
        return human.getTypeRoom().getPrice() * human.getDay();
    }

    public void show() {
        for (Human human : humans) {
            System.out.println(human.toString());
        }
    }
}

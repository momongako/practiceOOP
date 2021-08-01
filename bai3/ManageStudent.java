package bai3;

import java.util.ArrayList;
import java.util.List;

public class ManageStudent {
    List<Studentsa> student;

    public ManageStudent() {
        this.student = new ArrayList<>();
    }

    public void add(Studentsa students) {
        this.student.add(students);
    }

    public void show() {
        for (Studentsa studentsa : student) {
            System.out.println(studentsa.toString());
        }
    }

    public List searchMVS(String sbd) {
        List msvse = new ArrayList<>();
        for (Studentsa object : this.student) {
            if (object.getSbd().equals(sbd)) {
                msvse.add(object);
            }
        }
        return msvse;
    }
}

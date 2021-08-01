package bai6;

import java.util.List;
import java.util.ArrayList;

public class School {
    List<Student> studens;

    public School() {
        this.studens = new ArrayList<>();
    }

    public void addStudent(Student student) {
        this.studens.add(student);
    }

    public List showStudent(int age) {
        List age20 = new ArrayList<>();
        for (Student studentss : this.studens) {
            if (studentss.getAge() == age) {
                age20.add(studentss);
                System.out.println(studentss.toString());
            }

        }
        return age20;
    }

    public List showStudentsss(int age, String address) {
        List age23 = new ArrayList<>();
        int count = 0;

        for (Student student : this.studens) {
            if (student.getAge() == age && student.getAddress().equals(address)) {
                age23.add(student);
                count++;

            }

        }
        System.out.println(count);
        return age23;
    }
}

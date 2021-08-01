package bai4;

public class Human {
    private String names;
    private String age;
    private String work;
    private String cmnd;

    public String getName() {
        return names;
    }

    public void setName(String name) {
        this.names = name;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public String getWork() {
        return work;
    }

    public void setWork(String work) {
        this.work = work;
    }

    public String getCmnd() {
        return cmnd;
    }

    public void setCmnd(String cmnd) {
        this.cmnd = cmnd;
    }

    public Human(String name, String age, String work, String cmnd) {
        this.names = name;
        this.age = age;
        this.work = work;
        this.cmnd = cmnd;
    }

    @Override
    public String toString() {
        return "Human [age=" + age + ", cmnd=" + cmnd + ", name=" + names + ", work=" + work + "]";
    }

}

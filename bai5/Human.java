package bai5;

public class Human {
    private String name;
    private int age;
    private String cmnd;
    private int day;
    private Room typeRoom;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getCmnd() {
        return cmnd;
    }

    public void setCmnd(String cmnd) {
        this.cmnd = cmnd;
    }

    public int getDay() {
        return day;
    }

    public void setDay(int day) {
        this.day = day;
    }

    public Room getTypeRoom() {
        return typeRoom;
    }

    public void setTypeRoom(Room typeRoom) {
        this.typeRoom = typeRoom;
    }

    public Human(String name, int age, String cmnd, int day, Room typeRoom) {
        this.name = name;
        this.age = age;
        this.cmnd = cmnd;
        this.day = day;
        this.typeRoom = typeRoom;
    }

    @Override
    public String toString() {
        return "Human [age=" + age + ", cmnd=" + cmnd + ", day=" + day + ", name=" + name + ", typeRoom=" + typeRoom
                + "]";
    }
}

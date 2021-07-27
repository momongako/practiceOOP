package bai1;

public class Worker extends Cadres {
    public Worker(String name, int age, String gender, String address,String level) {
        super(name, age, gender, address);
        //TODO Auto-generated constructor stub
        this.level =level;
    }

     public String getLevel() {
        return level;
    }

    public void setLevel(String level) {
        this.level = level;
    }

    private String level;

    @Override
    public String toString() {
        return "Worker [Level=" + level +
         "address=" + address + ", age=" + age + ", gender=" + gender
          + ", name=" + name + "]";
    }
    
}

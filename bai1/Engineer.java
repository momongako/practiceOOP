package bai1;

public class Engineer extends Cadres {
    private String brach;
    public Engineer(String name, int age, String gender, String address,String brach) {
        super(name, age, gender, address);
        //TODO Auto-generated constructor stub
        this.brach = brach;
    }

   

    public String getBrach() {
        return brach;
    }



    public void setBrach(String brach) {
        this.brach = brach;
    }



    @Override
    public String toString() {
        return "Engineer [brach=" + brach +
         "address=" + address + ", age=" + age + ", gender=" + gender
          + ", name=" + name + "]";
    }

   
}

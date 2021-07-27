package bai1;

public class Personner extends Cadres {
    public Personner(String name, int age, String gender, String address,String word) {
        super(name, age, gender, address);
        //TODO Auto-generated constructor stub
        this.word = word;
    }

    public String getWord() {
        return word;
    }

    public void setWord(String word) {
        this.word = word;
    }
    @Override
    public String toString() {
        return "Personner [word=" + word +
         "address=" + address + ", age=" + age + ", gender=" + gender
          + ", name=" + name + "]";
    }
    private String word;
}

package bai7;

public class Man {
    private String name;
    private int age;
    private String address;
    private String numberTeacher;
    private int priceHard;// lương cứng
    private int priceBonus;// thưởng
    private int fine;// tiền phạt
    private int priceReal;// lương thực lĩnh

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

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getNumberTeacher() {
        return numberTeacher;
    }

    public void setNumberTeacher(String numberTeacher) {
        this.numberTeacher = numberTeacher;
    }

    public int getPriceHard() {
        return priceHard;
    }

    public void setPriceHard(int priceHard) {
        this.priceHard = priceHard;
    }

    public int getPriceBonus() {
        return priceBonus;
    }

    public void setPriceBonus(int priceBonus) {
        this.priceBonus = priceBonus;
    }

    public int getFine() {
        return fine;
    }

    public void setFine(int fine) {
        this.fine = fine;
    }

    public int getPriceReal() {
        return priceReal;
    }

    public void setPriceReal(int priceReal) {
        this.priceReal = priceReal;
    }

    public Man(String name, int age, String address, String numberTeacher, int priceHard, int priceBonus, int fine) {
        this.name = name;
        this.age = age;
        this.address = address;
        this.numberTeacher = numberTeacher;
        this.priceHard = priceHard;
        this.priceBonus = priceBonus;
        this.fine = fine;
        this.priceReal = priceReal;
    }

    @Override
    public String toString() {
        return "Man [address=" + address + ", age=" + age + ", fine=" + fine + ", name=" + name + ", numberTeacher="
                + numberTeacher + ", priceBonus=" + priceBonus + ", priceHard=" + priceHard + "]";
    }

}

package bai3;

public class StudentB extends Studentsa {
    static final String MON_TOAN = "toan";
    static final String MON_HOA = "hoa";
    static final String MON_SINH = "sinh";

    public StudentB(String sbd, String name, String address, String mut) {
        super(sbd, name, address, mut);
        // TODO Auto-generated constructor stub
    }

    @Override
    public String toString() {
        return "StudentB [address=" + address + ", mut=" + mut + ", name=" + name + ", sbd=" + sbd + ", Subject: "
                + MON_TOAN + " - " + MON_HOA + " - " + MON_SINH + '}';

    }
}

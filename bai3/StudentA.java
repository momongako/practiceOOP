package bai3;

/**
 * StudentA extends Studentsa
 */
public class StudentA extends Studentsa {
    public static final String MON_TOAN = "toan";
    public static final String MON_LY = "Ly";
    public static final String MON_HOA = "Hoa";

    public StudentA(String sbd, String name, String address, String mut) {
        super(sbd, name, address, mut);
        // TODO Auto-generated constructor stub
    }

    @Override
    public String toString() {
        return "StudentA [address=" + address + ", mut=" + mut + ", name=" + name + ", sbd=" + sbd + ", Subject: "
                + MON_TOAN + " - " + MON_LY + " - " + MON_HOA + '}';

    }

}

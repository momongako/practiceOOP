package bai3;

public class StudentC extends Studentsa {
    public static final String MON_VAN = "van";
    public static final String MON_SU = "su";
    public static final String MON_DIA = "dia";

    public StudentC(String sbd, String name, String address, String mut) {
        super(sbd, name, address, mut);
        // TODO Auto-generated constructor stub
    }

    @Override
    public String toString() {
        return "StudentC [address=" + address + ", mut=" + mut + ", name=" + name + ", sbd=" + sbd + ", Subject: "
                + MON_VAN + " - " + MON_SU + " - " + MON_DIA + '}';

    }
}

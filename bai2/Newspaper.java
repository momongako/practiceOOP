package bai2;
/**
 * Newspaper
 */
public class Newspaper extends Library {
private int dayIssua;
    public Newspaper(String numberDocument, String aouthor, String releaseNumber, int dayIssua) {
        super(numberDocument, aouthor, releaseNumber);
        //TODO Auto-generated constructor stub
        this.dayIssua = dayIssua;
    }
    public int getDayIssua() {
        return dayIssua;
    }
    public void setDayIssua(int dayIssua) {
        this.dayIssua = dayIssua;
    }
    @Override
    public String toString() {
        return "Newspaper [dayIssua=" + dayIssua +
        "aouthor=" + aouthor + ", numberDocument=" + numberDocument + ", releaseNumber=" + releaseNumber
        + "]";
    }

    
}
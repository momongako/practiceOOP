package bai2;

public class Magazine extends Library{
    private int numberIssua;
    private int mothIssua;
    public Magazine(String numberDocument, String aouthor, String releaseNumber,int mothIssua,int numberIssua) {
        super(numberDocument, aouthor, releaseNumber);
        //TODO Auto-generated constructor stub
        this.numberIssua = numberIssua;
        this.mothIssua = mothIssua;
    }
    
    public int getNumberIssua() {
        return numberIssua;
    }

    public void setNumberIssua(int numberIssua) {
        this.numberIssua = numberIssua;
    }

    public int getMothIssua() {
        return mothIssua;
    }

    public void setMothIssua(int mothIssua) {
        this.mothIssua = mothIssua;
    }

    @Override
    public String toString() {
        return "Magazine [mothIssua=" + mothIssua + ", numberIssua=" + numberIssua + 
        "aouthor=" + aouthor + ", numberDocument=" + numberDocument + ", releaseNumber=" + releaseNumber
        + "]";
    }
    
}

package bai2;

public class Library {
   protected String numberDocument;
   protected String aouthor;
   protected String releaseNumber;
public String getNumberDocument() {
    return numberDocument;
}
public void setNumberDocument(String numberDocument) {
    this.numberDocument = numberDocument;
}
public String getAouthor() {
    return aouthor;
}
public void setAouthor(String aouthor) {
    this.aouthor = aouthor;
}
public String getReleaseNumber() {
    return releaseNumber;
}
public void setReleaseNumber(String releaseNumber) {
    this.releaseNumber = releaseNumber;
}
public Library(String numberDocument, String aouthor, String releaseNumber) {
    this.numberDocument = numberDocument;
    this.aouthor = aouthor;
    this.releaseNumber = releaseNumber;
}
public Object getId() {
    return null;
}


   
}

package bai2;
import java.util.ArrayList;
import java.util.List;
public class ManageLibrary {
    List<Library> library;
    public ManageLibrary(){
        this.library = new ArrayList<>();
    }
    public void addLibrary(Library librarys){
        this.library.add(librarys);
    }
    public void ShowLibrary(){
        for (Library library2 : library) {
            System.out.println(library2.toString());
        }
    }
    public List searchByBook(){
        List LibraryBook = new ArrayList<>();
        for (Library object : this.library) {
            if (object instanceof Library) {
                System.out.println(object.toString());
            }
        }
        return LibraryBook;
    }
    public List searchByMagazine(){
        List LibraryMagazine = new ArrayList<>();
        for (Library object : this.library) {
            if (object instanceof Library) {
                System.out.println(object.toString());
            }
        }
        return LibraryMagazine;
    }
    public List searchByNewspaper(){
        List LibraryNewspaper = new ArrayList<>();
        for (Library object : this.library) {
            if (object instanceof Library) {
                System.out.println(object.toString());
            }
        }
        return LibraryNewspaper;
    }

    public boolean deleteDocument(String numberDocument) {
        Library doc = this.library.stream()
                .filter(library -> library.getNumberDocument().equals(numberDocument))
                .findFirst().orElse(null);
        if (doc == null) {
            return false;
        }
        this.library.remove(doc);
        return true;
    }

}

package bai2;
import java.util.Scanner;
public class main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ManageLibrary manageLibrary = new ManageLibrary();
        while (true){
            System.out.println("Application Manager Document");
            System.out.println("Enter 1: To insert document");
            System.out.println("Enter 2: To search document by category: ");
            System.out.println("Enter 3: To show information documents");
            System.out.println("Enter 4: To remove document by id");
            System.out.println("Enter 5: To exit:");
            String line = sc.nextLine();
            switch (line) {
                case "1":{
                    System.out.println("Enter a: to insert Book");
                    System.out.println("Enter b: to insert Newspaper");
                    System.out.println("Enter c: to insert Journal");

String key = sc.nextLine();
                    switch (key) {
                        case "a":{
                            System.out.println(" Mã tài liệu");
                            String numberDocument = sc.nextLine();
                            System.out.println("Tên xuất bản");
                            String aouthor = sc.nextLine();
                            System.out.println("số bản phát hành");
                            String releaseNumber = sc.nextLine();
                            System.out.println("tên tác giả");
                            String nameBook = sc.nextLine();
                            System.out.println("số trang");
                            int numberBook = sc.nextInt();
                            Library books = new Book(numberDocument,aouthor,releaseNumber,nameBook,numberBook);
                            manageLibrary.addLibrary(books);
                            System.out.println(books.toString());
                            sc.nextLine();
                            break;
                        }
                        case "b":{
                            System.out.println(" Mã tài liệu");
                            String numberDocument = sc.nextLine();
                            System.out.println("Tên xuất bản");
                            String aouthor = sc.nextLine();
                            System.out.println("số bản phát hành");
                            String releaseNumber = sc.nextLine();
                            System.out.println("ngày phát hành");
                            int dayIssua = sc.nextInt();
                            
                            Library newspaper = new Newspaper(numberDocument,aouthor,releaseNumber,dayIssua);
                            manageLibrary.addLibrary(newspaper);
                            System.out.println(newspaper.toString());
                            sc.nextLine();
                            break;
                        }
                        case "c" :{
                            System.out.println(" Mã tài liệu");
                            String numberDocument = sc.nextLine();
                            System.out.println("Tên xuất bản");
                            String aouthor = sc.nextLine();
                            System.out.println("số bản phát hành");
                            String releaseNumber = sc.nextLine();
                            System.out.println("số phát hành");
                            int numberIssua = sc.nextInt();
                            System.out.println("Tháng phát hành");
                            int mothIssua = sc.nextInt();
                            Library magazine = new Magazine(numberDocument,aouthor,releaseNumber,numberIssua,mothIssua);
                            manageLibrary.addLibrary(magazine);
                            System.out.println(magazine.toString());
                            sc.nextLine();
                            break;
                        }
                        default:
                            break;
                    }
                    break;
                }
                case "2":{
                    System.out.println("Search a : Book");
                    System.out.println("Search b : Magazine");
                    System.out.println("Search c : Newspaper");
                    String key = sc.nextLine();
                    switch (key) {
                        case "a":
                            {
                            manageLibrary.searchByBook();
                            break;
                            }
                        case "b":{
                            manageLibrary.searchByMagazine();
                            break;
                        }
                        case "c":{
                            manageLibrary.searchByNewspaper();
                        }
                        default:
                            break;
                    }
                    break;
                }
                case "3":{
                    manageLibrary.ShowLibrary();
                    break;
                }
                case "4":{
                      System.out.println("nhập mã tài liệu");
                      String numberDocument = sc.nextLine();
                      System.out.println(manageLibrary.deleteDocument(numberDocument)? "Success" : "Fail");
                    
                }
                break;
                case "5":{
                    return;
                }
                    
            default :
                System.out.println("Invalid");
                continue;

            }
        }
    }

    
}

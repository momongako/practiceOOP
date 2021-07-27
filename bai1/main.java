package bai1;
import java.util.Scanner;


public class main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ManageCadres manageCadres = new ManageCadres();
        while (true) {
            System.out.println("Enter 1 : Nhập thông tin");
            System.out.println("Enter 2 : Tìm kiếm theo tên");
            System.out.println("Enter 3 : Show");
            System.out.println("Enter 4 : Exit");
            String key = sc.nextLine();
            switch (key) {
                case "1":
                System.out.println("Enter a: to insert Enginner");
                System.out.println("Enter b: to insert Worker");
                System.out.println("Enter c: to insert Staff");
                String keya = sc.nextLine();
                    switch (keya) {
                          case "a":{
                            System.out.print("nhập tên: ");
                            String name = sc.nextLine();
                            System.out.print("Nhập tuổi: ");
                            int age = sc.nextInt();
                            System.out.print("Giới tính : ");
                            sc.nextLine();
                            String gender = sc.nextLine();
                            System.out.print("địa chỉ : ");
                            String address = sc.nextLine();
                            System.out.print("Enter branch: ");
                            String brach = sc.nextLine();

                                Cadres engineer = new Engineer(name,age,gender,address,brach);
                                manageCadres.addCadres(engineer);
                                System.out.println(engineer.toString());
                              break;
                    }
                              case "b":{
                              System.out.print("nhập tên : ");
                              String name = sc.nextLine();
                              System.out.print("Nhập tuổi : ");
                              int age = sc.nextInt();
                              System.out.print("Giới tính: ");
                              sc.nextLine();
                              String gender = sc.nextLine();
                              System.out.print("địa chỉ : ");
                              String address = sc.nextLine();
                              System.out.print("Enter level: ");
                              String level = sc.nextLine();
                      
                              Cadres worker = new Worker(name,age,gender,address,level);
                              manageCadres.addCadres(worker);
                              System.out.println(worker.toString());
                              break;
                              }
                          case "c":
                              {
                                System.out.println("nhập tên ");
                                String name = sc.nextLine();
                                System.out.println("Nhập tuổi ");
                                int age = sc.nextInt();
                                System.out.println("Giới tính");
                                String gender = sc.nextLine();
                                System.out.println("địa chỉ");
                                String address = sc.nextLine();
                                System.out.print("Enter level: ");
                                String level = sc.nextLine();
                        
                                Cadres personner = new Personner(name,age,gender,address,level);
                                manageCadres.addCadres(personner);
                                System.out.println(personner.toString());
                              break;
                              }
                        
                          default:
                          System.out.println("nhập sai");
                break;
                             
                }
                break;
                case "2" :{
                    System.out.println("Search Name");
                    String name = sc.nextLine();
                    
                    if(manageCadres.SearchByName(name).size()==0){
                            System.out.println("Not Name");
                    }else{      
                            System.out.println((manageCadres.SearchByName(name).toString()));
                    }
                    break;
                }
                case "3":{
                    manageCadres.showListCaders();
                    break;
                }
                case "4":{
                    return;
                }
                default:
                System.out.println("Invalid");
                continue;

            }
            
        }
    }
}

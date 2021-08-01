package bai11;

import java.util.Scanner;

public class SoPhuc {
    private double phanThuc;
    private double phanAo;

    public double getPhanThuc() {
        return phanThuc;
    }

    public void setPhanThuc(double phanThuc) {
        this.phanThuc = phanThuc;
    }

    public double getPhanAo() {
        return phanAo;
    }

    public void setPhanAo(double phanAo) {
        this.phanAo = phanAo;
    }

    public SoPhuc(double phanThuc, double phanAo) {
        this.phanThuc = phanThuc;
        this.phanAo = phanAo;
    }

    @Override
    public String toString() {
        return "SoPhuc [phanAo=" + phanAo + ", phanThuc=" + phanThuc + "]";
    }

    public static void main(String[] args) {
        double SoPhuc, SoPhuc2;
        double i = Math.sqrt(-1);
        Scanner sc = new Scanner(System.in);
        System.out.println("số phức 1");
        System.out.println("nhập phần ảo");
        double phanAo = sc.nextDouble();
        System.out.println("nhập phần thực");
        double phanThuc = sc.nextDouble();
        SoPhuc = phanThuc + (phanAo * i);
        System.out.println("Số phức : " + SoPhuc);

        System.out.println("số phức 2");
        System.out.println("nhập phần ảo");
        double phanAo2 = sc.nextDouble();
        System.out.println("nhập phần thực");
        double phanThuc2 = sc.nextDouble();
        SoPhuc2 = phanThuc2 + (phanAo2 * i);
        System.out.println("Số phức2 : " + SoPhuc);

        System.out.println("1 :cộng 2 số phức");
        System.out.println("2 :Nhân 2 số phức");
        String line = sc.nextLine();
        switch (line) {
            case "1": {
                double sumSoPhuc = SoPhuc + SoPhuc2;
                System.out.println(sumSoPhuc);
                break;
            }
            case "2": {
                double sumSoPhuc = SoPhuc * SoPhuc2;
                System.out.println(sumSoPhuc);
                break;
            }
            default:
                break;
        }
    }
}

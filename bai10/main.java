package bai10;

import java.util.Scanner;

/**
 * main
 */
public class main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Vanban van = new Vanban();
        String st = "";
        char[] ch = st.toCharArray();

        String str = "hoc java     co ban den nang cao" + "      \n test";
        System.out.println("Số từ của chuỗi đã cho là: " + van.countWords(str));
        System.out.print("Số từ A của chuỗi đã cho là: " + van.dema(str));
    }
}
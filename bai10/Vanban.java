package bai10;

import java.util.Arrays;
import java.util.Scanner;

public class Vanban {
    String str;
    Scanner sc = new Scanner(System.in);
    public static final char SPACE = ' ';
    public static final char TAB = '\t';
    public static final char BREAK_LINE = '\n';

    public static int countWords(String input) {

        if (input == null) {
            return -1;
        }
        int count = 0;
        int size = input.length();
        boolean notCounted = true;
        for (int i = 0; i < size; i++) {
            if (input.charAt(i) != SPACE && input.charAt(i) != TAB && input.charAt(i) != BREAK_LINE) {
                if (notCounted) {
                    count++;
                    notCounted = false;
                }
            } else {
                notCounted = true;
            }
        }
        return count;
    }

    public static int dema(String input) {
        if (input == null) {
            return -1;
        }
        int count = 0;
        int size = input.length();
        boolean notCounted = true;
        for (int i = 0; i < size; i++) {
            if (input.charAt(i) == 'a') {
                count++;
            }
        }
        return count;
    }
    // public int dema() {
    // Scanner sc = new Scanner(System.in);
    // System.out.println("nhập văn bản");
    // st = sc.nextLine();
    // int i = 0;
    // int j = 0;
    // for (i = 0; i < ch.length; i++) {
    // if (st.equals('A')) {

    // j++;
    // }
    // System.out.println(j);
    // }

    // }
}

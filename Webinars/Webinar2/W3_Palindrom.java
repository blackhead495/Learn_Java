package Webinars.Webinar2;

import java.util.Scanner;

public class W3_Palindrom {
    public static void main(String[] args) {
        System.out.print("Введите слово: ");
        Scanner scan = new Scanner(System.in);
        String st = scan.nextLine();
        System.out.println(check(st));
    }

    public static boolean check(String st) {
        //char[] tmp = st.replace(" ", "").toLowerCase().toCharArray();
        char[] tmp = st.toCharArray();
        for (int i = 0; i < st.length() / 2; i++) {
            if (tmp[i] != tmp[st.length() - i - 1]) {
                return false;
            }
        }
        return true;
    }
}




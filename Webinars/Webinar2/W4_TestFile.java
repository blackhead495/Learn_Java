package Webinars.Webinar2;

import java.io.File;
import java.util.Scanner;

public class W4_TestFile {
    public static void main(String[] args) {
        File file = new File("file.txt");
        Scanner sc = new Scanner(System.in);
        System.out.print("Введите слово: ");
        String str = sc.nextLine();
        System.out.println(str);
        //file.createNewFile();
    }
}

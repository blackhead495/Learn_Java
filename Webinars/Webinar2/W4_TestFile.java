// Написать метод, который составит строку, состоящую из 100 повторений
// слова TEST и метод, который запишет эту строку в простой текстовый файл,
// обработайте исключения

package Webinars.Webinar2;

import java.io.*;
import java.util.Scanner;

public class W4_TestFile {
//    public static void main(String[] args) {
//        File file = new File("test_file.txt");
//        Scanner sc = new Scanner(System.in);
//        System.out.print("Введите слово: ");
//        //StringBuilder sb = new StringBuilder();
//        String str = sc.nextLine();
//        //sb.append(str.repeat(100));
//
//        try (FileWriter fw = new FileWriter(file, false)) {
//            for (int i = 0; i < 100; i++) {
//                fw.write(str + '\n');
//            }
//            fw.flush();
//
//            //--- Чтение построчно ---
//            BufferedReader br = new BufferedReader(new FileReader(file));
//            String str1;
//            while ((str1 = br.readLine()) != null) {
//                System.out.printf("== %s == \n", str1);
//            }
//        } catch (IOException ex) {
//            System.out.println(ex.getMessage());
//        }
//    }
    public static void main(String[] args) throws IOException {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < 100; i++) {
            sb.append("QQ - WW \n");
        }
        metod(sb);
    }

    private static void metod (StringBuilder s) throws IOException {
        try (FileWriter fw = new FileWriter("test_file.txt", false)) {
            fw.write(s.toString());
            fw.flush();
        } catch (IOException ex) {
            //System.out.println(ex.getMessage());
            throw new IOException(ex.getMessage());
        }
    }
}

//** Дана json строка (можно сохранить в файл и читать из файла)
//        [{"фамилия":"Иванов","оценка":"5","предмет":"Математика"},{"фамилия":"Петрова","оценка":"4","предмет":"Информатика"},{"фамилия":"Краснов","оценка":"5","предмет":"Физика"}]
//        Написать метод(ы), который распарсит json и, используя StringBuilder, создаст строки вида: Студент [фамилия] получил [оценка] по предмету [предмет].
//        Пример вывода:
//        Студент Иванов получил 5 по предмету Математика.
//        Студент Петрова получил 4 по предмету Информатика.
//        Студент Краснов получил 5 по предмету Физика.

package HomeWorks.HomeWork2;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;
import java.io.IOException;
import java.util.*;

public class H23_JSON_Read {
    public static void main(String[] args) {
        //FileReader fr = new FileReader("HomeWorks/HomeWork2/H23.txt");
//        BufferedReader br = new BufferedReader(new FileReader("HomeWork2/H23.txt"));
//        Scanner iScan = new Scanner(br);
//        System.out.println(iScan);
//        StringBuilder sBld = new StringBuilder();
//        String str;
//        List<String> strArr = new ArrayList<>();
//        BufferedReader file = new BufferedReader(new FileReader("HomeWork2/H23.txt"));
//        //BufferedReader file = new BufferedReader("HomeWork2/H23.txt");
//        while (str = file.readLine() != null) {
//            strArr.add(str);
//        }
//        texts = iScan.nextLine();
//        String[] newLine = texts.split("}");
//        System.out.println(Arrays.toString(newLine));

//        for (String item : newLine) {
//            String[] nums = item.split("\"");
//            if (nums.length > 10) {
//                sBld.append("Студент");
//                sBld.append(nums[3]).append(" ").append("получил").append(" ");
//                sBld.append(nums[7]).append(" ").append("по предмету").append(" ").append(nums[11]);
//                sBld.append("\n");
//            }
//        }
        System.out.println("Hello");
    }
}

// Задан целочисленный список ArrayList. Найти минимальное, максимальное и среднее из этого списка.

package HomeWorks.HomeWork3;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class H33_Min_Max_Average {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        int totalNum  = 20;    // Кол элементов в списке
        int minValueRnd = 5;   // Мин значение для рандома
        int maxValueRnd = 500; // Макс значение для рандома

        for (int i = 0; i < totalNum; i++) {
            list.add(new Random().nextInt(minValueRnd, maxValueRnd));
        }

        System.out.println(list);

        int minVal = minNum(list);
        int maxVal = maxNum(list);
        double meanVal = meanNum(list);

        System.out.printf("Минимальное значение: %d\n" +
                "Максимальное значение: %d\n" +
                "Среднее значение: %.2f\n", minVal, maxVal, meanVal);

        System.out.println(minVal);
        System.out.println(maxVal);
        System.out.println(meanVal);
    }

    public static int minNum(List<Integer> listInt) {
        int minVal = listInt.get(0);
        for (int i = 1; i < listInt.size(); i++) {
            if (listInt.get(i) < minVal) {
                minVal = listInt.get(i);
            }
        }
        return minVal;
    }

    public static int maxNum(List<Integer> listInt) {
        int maxVal = listInt.get(0);
        for (int i = 1; i < listInt.size(); i++) {
            if (listInt.get(i) > maxVal) {
                maxVal = listInt.get(i);
            }
        }
        return maxVal;
    }

    public static double meanNum(List<Integer> listInt) {
        double meanVal = 0;
        double sumVal = 0;
        for (int i = 0; i < listInt.size(); i++) {
            sumVal += listInt.get(i);
        }
        meanVal = sumVal / listInt.size();
        return meanVal;
    }
}

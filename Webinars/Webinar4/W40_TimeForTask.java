// 1. Замерьте время, за которое в ArrayList добавятся 10000 элементов
// 2. Замерьте время, за которое в LinkedList добавятся 10000 элементов
//  Сравните их между собой

package Webinars.Webinar4;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class W40_TimeForTask {
    public static void main(String[] args) {
        List<Integer> arrayList = new ArrayList<>();
        Random random = new Random();
        long startTimeArray = System.nanoTime();
        for (int i = 0; i < 10000000; i++) {
            arrayList.add(5);
        }
        long endTimeArray = System.nanoTime();

        List<Integer> linkedList = new ArrayList<>();
        long startTimeLinked = System.nanoTime();
        for (int i = 0; i < 10000000; i++) {
            linkedList.add(5);
        }
        long endTimeLinked = System.nanoTime();

        System.out.println(endTimeArray - startTimeArray);
        System.out.println(endTimeLinked - startTimeLinked);
        System.out.println((endTimeArray - startTimeArray)-(endTimeLinked - startTimeLinked));
    }
}

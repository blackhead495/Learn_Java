// Реализуйте алгоритм сортировки пузырьком числового массива, результат после каждой итерации запишите в лог-файл.

package HomeWorks.HomeWork2;

import java.io.IOException;
import java.util.Arrays;
import java.util.logging.FileHandler;
import java.util.logging.Logger;
import java.util.logging.SimpleFormatter;

public class H22_BubbleSort {

    public static void main(String[] args) throws IOException {

        Logger log = Logger.getLogger(H22_BubbleSort.class.getName());
        FileHandler fh = new FileHandler("HomeWorks/HomeWork2/log_H22.txt", false);
        log.addHandler(fh);
        log.setUseParentHandlers(false); // Не отображать в терминале
        SimpleFormatter sf = new SimpleFormatter();
        fh.setFormatter(sf);

        log.info("=========== Создал новый логгер ============");

        int[] a = {16, 21, 15, 2, 33, 53, 8, 1, 5, 17, 13, 44};
        int tmp;
        for (int i = 0; i < a.length-1; i++) {
            for (int j = i+1; j < a.length; j++) {
                log.info(Arrays.toString(a));
                if (a[i] > a[j]) {
                    tmp = a[i];
                    a[i] = a[j];
                    a[j] = tmp;
                    //log.info("Поменял местами данные");
                }
                //System.out.println(Arrays.toString(a));
            }
        }

        System.out.println(Arrays.toString(a));
        log.warning("=========== Программа закончилась! ==========");
    }
}

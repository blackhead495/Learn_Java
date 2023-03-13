// Реализовать алгоритм сортировки слиянием

package HomeWorks.HomeWork3;

import java.util.Arrays;

public class H31_MergeSort {
    public static void main(String[] args) {

        int count = 10;                         // Количество элементов в массиве
        int[] arr = new int[count];
        for (int i = 0; i < count-1; i++) {
            arr[i] = (int)(Math.random() * 100); // Заполнить массив случайными целыми числами
        }

        System.out.println("Массив, заполненный случайными числами: " + Arrays.toString(arr));

        SortUnsorted(arr, 0, arr.length-1);

        System.out.println("Отсортированный массив по возрастанию:  " + Arrays.toString(arr));
    }

    private static void SortUnsorted(int[] a, int posLo, int posHi) {

        if (posHi <= posLo)                     // Условие выхода из рекурсии
            return;
        int mid = posLo + (posHi - posLo) / 2;  // Середина позиции между posHi и posLo
        SortUnsorted(a, posLo, mid);            // Вызываем функцию для левой части
        SortUnsorted(a, mid + 1, posHi);  // Вызываем функцию для правой части

        int[] buf = Arrays.copyOf(a, a.length); // Создадим временный массив и скопируем туда входной массив

        int i = posLo,                          // i будет двигаться от posLo до mid
            j = mid + 1;                        // j будет двигаться от mid+1 до posHi

        for (int k = posLo; k <= posHi; k++) {  // Будем заполнять исходный массив данными по возрастанию
            if (i > mid) {                      // Если вышли за пределы левой половины - данные в этом массиве кончились
                a[k] = buf[j];                  // Записать оставшийся элемент из правой половины
                j++;
            } else if (j > posHi) {             // Если вышли за пределы правой половины - данные в этом массиве кончились
                a[k] = buf[i];                  // Записать оставшийся элемент из левой половины
                i++;
            } else if (buf[j] < buf[i]) {       // Сравнить текущие элементы левой и правой половины
                a[k] = buf[j];                  // Меньшее из них записать
                j++;
            } else {
                a[k] = buf[i];
                i++;
            }
        }
    }
}

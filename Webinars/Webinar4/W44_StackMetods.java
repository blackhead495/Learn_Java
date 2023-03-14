/************************************************
    Реализовать стэк с помощью массива.
    Нужно реализовать методы:
    size(), empty(), push(), peek(), pop().
**************************************************/
package Webinars.Webinar4;

import java.util.Arrays;

public class W44_StackMetods {
    public static Integer[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9};
    public static void main(String[] args) {
        System.out.println(size(array));
        System.out.println(empty(array));
       //System.out.println(push(array, 10));
        array = push(array, 10);
        System.out.println(Arrays.toString(array));
        System.out.println(peek(array));
        array = pop(array);
        System.out.println(Arrays.toString(array));
    }
    /** Определяет размер массива */
    public static Integer size (Integer[] inputArray) {
        return inputArray.length;
    }
    /** Определяет пуст ли массив */
    public static boolean empty (Integer[] inputArray) {
        if (inputArray.length < 1) {  // Если массив пустой
            return true;
        }
        return false;
    }
    /** Добавляет новый элемент в начало массива */
    public static Integer[] push (Integer[] inputArray, Integer newElement) {
        Integer[] newArray = new Integer[inputArray.length+1];
        System.arraycopy(inputArray, 0, newArray, 0, inputArray.length);
        newArray[inputArray.length] = newElement;
        return newArray;
    }
    /** Показывает последний элемент массива */
    public static Integer peek (Integer[] inputArray) {
        return inputArray[inputArray.length - 1];
    }
    /** Удаляет последний элемент массива */
    public static Integer[] pop (Integer[] inputArray) {
        Integer[] newArray = new Integer[inputArray.length-1];
        System.arraycopy(inputArray, 0, newArray, 0, inputArray.length - 1);
        return newArray;
    }
}

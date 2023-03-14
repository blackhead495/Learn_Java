// 1) Написать метод, который принимает массив элементов,
//      помещает их в стэк и выводит на консоль содержимое стэка.
// 2) Написать метод, который принимает массив элементов,
//      помещает их в очередь и выводит на консоль содержимое очереди.

package Webinars.Webinar4;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class W43_StackArray {
    public static void main(String[] args) {
        Integer[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        ex1(arr);
        ex2(arr);
    }

    public static void ex1 (Integer[] inArray) {
        Stack<Integer> stack = new Stack<>();
        for (Integer item : inArray) {
            stack.push(item);
        }
        System.out.println(stack);
    }

    public static void ex2 (Integer[] inArray) {
        Queue<Integer> queue = new LinkedList<>();
        for (Integer item : inArray) {
            queue.add(item);
        }
        System.out.println(queue);
    }
}

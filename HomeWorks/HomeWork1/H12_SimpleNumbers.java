// Вывести все простые числа от 1 до 1000

package HomeWorks.HomeWork1;

public class H12_SimpleNumbers {
    public static void main(String[] args) {
        System.out.print("Простые числа: ");
        for (int i = 1; i <= 1000; i++) {
            if (SimpleDig(i)) {
                System.out.print(i + ", ");
            }
        }
    }

    public static boolean SimpleDig(int dig) {
        for (int i = 2; i < dig; i++) {
            if (dig % i == 0)
                return false;
        }
        return true;
    }
}

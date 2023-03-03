// Вычисление треугольго числа и факториала

package HomeWorks.HomeWork1;
import java.util.Scanner;
public class H1_TriangleNumber {
    public static void main(String[] args) {
        System.out.print("Введите число: ");
        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();
        int sum = 0;
        int mul = 1;
        for (int i = 1; i <= num; i++) {
            sum += i;
            mul *= i;
        }

        System.out.println("Треугольное число: " + sum);
        System.out.println(num + "! = " + mul);
    }
}

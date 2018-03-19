import java.util.Scanner;
import java.util.Random;//Дано натуральное число N. Вычислите сумму его цифр.
// При решении этой задачи нельзя использовать строки, списки, массивы (ну и циклы, разумеется)

public class Main {
    public static int sum(int n) {
        if ( n < 10){
            return n;
        } else {
            return (n % 10 + sum(n / 10));
        }
    }
    public static void main(String[]args) {
        System.out.println("`Введите число: ");
        Scanner in = new Scanner(System.in);
         int n = in.nextInt();
        System.out.println("Сумма цифр числа равна: " + sum(n));
    }
}


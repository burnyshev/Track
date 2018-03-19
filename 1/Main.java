import java.util.Scanner;
import java.util.Random;/*Дан одномерный n массив. Необходимо вывести все четные числа (разделитель пробел), которые делятся на 3 без остатка.
 //Например, дан массив 2, 6, 7, 12 вывод будет 6 12*/


public class Main {

    public static void main(String[]args) {
        System.out.print("Введите размер массива: ");
        int n;
        Random random = new Random();
        Scanner in = new Scanner(System.in);
        n = in.nextInt();
        int[] nums = new int[n];
        for(int i=0;i < nums.length; i++){
            nums[i] = random.nextInt(100);
        }

        for (int v :nums){
            if (v % 3 == 0) {
                System.out.print(v + " ");
            }
        }
    }
}

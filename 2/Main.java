import java.util.Scanner;
import java.util.Random;//Создайте массив целых чисел (размер 7 элементов), заполните его только четными числами,
// а затем каждый второй элемент умножьте на предыдущий


public class Main {

    public static void main(String[]args) {
        Random random = new Random();
        Scanner in = new Scanner(System.in);
        int[] nums = new int[7];
        for(int i=0;i < nums.length; i++){
            nums[i] = 2 * random.nextInt(100);
        }
        System.out.println("Начальный массив:");
        for (int v :nums){
            System.out.print(v + " ");
        }
        for (int i=0;i < nums.length; i++){
            if (i % 2 == 1){
                nums[i] = nums[i] * nums[i-1];
            }
        }
        System.out.println("");
        System.out.println("Итоговый массив:");
        for (int v :nums){
            System.out.print(v + " ");
        }
    }
}

import java.util.Scanner;
import java.util.Random;//Дан двумерный массив, необходимо вывести двумерный массив
// у которого четные строки отсортированы по возрастанию, а нечетные по убыванию.
// Так же в консоль необходимо вывести количество итераций, которое было потрачено при сортировке.
public class Main {

    public static void main(String[]args) {
        Random random = new Random();
        Scanner in = new Scanner(System.in);
        System.out.println("Введите размер массива: ");
        int n = in.nextInt();
        int m = in.nextInt();
        int[][] nums = new int[n][m];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                nums[i][j] = in.nextInt();
            }
        }
        int perestanovki = 0;
        System.out.println("Начальный массив:" );
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print(nums[i][j] + " ");
            }
            System.out.println("");
        }
        for (int i = 0; i < n; i++) {
            if (i % 2 == 1){

                for(int s = m - 1; s > 0 ; s--) {
                    for (int j = 0; j < s; j++) {
                        if (nums[i][j] > nums[i][j + 1]) {
                            int tmp = nums[i][j];
                            nums[i][j] = nums[i][j + 1];
                            nums[i][j + 1] = tmp;
                            perestanovki++;
                        }
                    }
                }

            } else {

                for (int s = m - 1; s > 0; s--) {
                    for (int j = 0; j < s; j++) {
                        if (nums[i][j] < nums[i][j + 1]) {
                            int tmp = nums[i][j];
                            nums[i][j] = nums[i][j + 1];
                            nums[i][j + 1] = tmp;
                            perestanovki++;
                        }
                    }
                }

            }
        }
        System.out.println("Конечный массив:" );
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print(nums[i][j] + " ");
            }
            System.out.println("");
        }
        System.out.println("Количество итераций:" + perestanovki );
    }
}

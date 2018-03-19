import java.util.Scanner;

public class Main {
    public static boolean isPalindrome(String str) {//функция, проверяющая на полиндромность: удаляем пробелы
        // и переводим все в нижний регистр
        String str1 = str.replaceAll("[\\s]{1,}", "");
        char[] chars = str1.toCharArray();
        str1 = "";
        for (char c : chars) {
            if (Character.isUpperCase(c))
                c = Character.toLowerCase(c);
            str1 += c;
        }
        return str1.equals(new StringBuilder(str1).reverse().toString());
    }
    public static void main(String[]args) {
        System.out.println("Введите слово на проверку: ");
        Scanner in = new Scanner(System.in);
        String s = in.nextLine();
        if (isPalindrome(s)){
            System.out.println("полиндром");
        } else {
            System.out.println("не полиндром");
        }
    }
}

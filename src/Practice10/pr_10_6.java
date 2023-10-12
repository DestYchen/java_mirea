package Practice10;
import java.util.Scanner;
public class pr_10_6 {
    public static String recursion(int n){
        int m = 2;
        while (m < n){
            if (n % m == 0) return "NO";
            m++;
        }
        if (m == n) return "YES";
        return recursion(n/m);
    }
    public static void main(String[] args) {
        System.out.println("Введите натуральное число");
        Scanner input = new Scanner(System.in);
        if (input.hasNextInt()) {
            int s = input.nextInt();
            if (s > 0) System.out.println("Простое ли число? - " + recursion(s));
            else System.out.println("Ошибка! Неверный ввод!");
        }
        else System.out.println("Ошибка! Неверный ввод!");
    }
}

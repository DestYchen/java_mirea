package Practice10;
import java.util.Scanner;
public class pr10_7 {
    public static String recursion(int n){
        int m = 2;
        while (m < n){
            if (n % m == 0) {
                return m + " " + recursion(n/m);
            }
            m++;
        }
        if (m == n) return Integer.toString(m);
        return recursion(n/m);
    }
    public static void main(String[] args) {
        System.out.println("Введите натуральное число");
        Scanner input = new Scanner(System.in);
        if (input.hasNextInt()) {
            int s = input.nextInt();
            if (s > 0) System.out.println("Делители числа: " + recursion(s));
            else System.out.println("Ошибка! Неверный ввод!");
        }
        else System.out.println("Ошибка! Неверный ввод!");
    }
}

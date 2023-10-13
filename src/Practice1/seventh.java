package Practice1;

import java.math.BigInteger;
import java.util.Scanner;
class factoriall{
    public static BigInteger factorialmath(int n) {
        BigInteger result = BigInteger.ONE;
        for (int i = 2; i <= n; i++)
            result = result.multiply(BigInteger.valueOf(i));
        return result;
    }
}
public class seventh {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int number;
        do {
            System.out.println("Введите пожалуйста положительное число, для которого надо посчитать факториал:");
            while (!input.hasNextInt()) {
                System.out.println("Это не число");
                input.next();
            }
            number = input.nextInt();
        } while (number <= 0);
        System.out.println("Факториал: " + factoriall.factorialmath(number));
    }
}
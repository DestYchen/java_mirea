package practice1;
import java.util.Scanner;

public class third {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Введите длинну массива чисел:");
        int sizelist = input.nextInt();
        int numbers[] = new int[sizelist];

        System.out.println("Введите числа, которые будут в массиве:");
        for (int i = 0; i < sizelist; i++)
            numbers[i] = input.nextInt();

        int summ = 0;
        for (int i = 0; i < sizelist; i++)
            summ += numbers[i];

        double medium = summ / sizelist;

        System.out.println("Сумма чисел: " + summ);
        System.out.println("Среднее значение: " + medium);

    }
}

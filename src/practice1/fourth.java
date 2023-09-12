package practice1;

import java.util.Scanner;
import java.util.Collections;

public class fourth {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Введите длинну массива чисел:");
        int sizelist = input.nextInt();
        int numbers[] = new int[sizelist];

        System.out.println("Введите числа, которые будут в массиве:");
        for (int i = 0; i < sizelist; i++)
            numbers[i] = input.nextInt();

        int summ = 0;
        int counter = 0;
        do{
            summ += numbers[counter];
            counter++;
        } while(counter != sizelist);

        int min = numbers[0];
        int max = numbers[0];

        for (int i: numbers) {
            if (i < min) min = i;
            if (i > max) max = i;
        }

        System.out.println("Сумма чисел: " + summ);
        System.out.println("Максимальное значение: " + max);
        System.out.println("Минимальное значение: " + min);

    }
}

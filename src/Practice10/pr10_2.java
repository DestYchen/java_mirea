package Practice10;
import java.util.Scanner;
public class pr10_2 {
    public static String recursion(int n){
        if(n == 1){
            return "1";
        }
        return recursion(n - 1) + " " + n;
    }
    public static void main(String[] args){
        System.out.println("Введите натуральное число: ");
        int flag = 0;
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        if(n <= 0){
            flag = 1;
        }
        if(flag==0){
            System.out.println("Последовательность чисел " + recursion(n));
        }
        else{
            System.out.println("Ошибка! Введённое число должно быть больше нуля!");
        }
    }
}

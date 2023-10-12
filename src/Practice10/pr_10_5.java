package Practice10;
import java.util.Scanner;
public class pr_10_5 {
    public static int recursion(int a){
        if(a/10 != 0){
            return a%10 + recursion(a/10);
        }
        return a;
    }
    public static void main(String[] args){
        System.out.println("Введите натуральное число:");
        Scanner input = new Scanner(System.in);
        if(input.hasNextInt()){
            int a = input.nextInt();
            if(a > 0){
                System.out.println("Сумма введённого число: " + recursion(a));
            }
            else{
                System.out.println("Ошибка! Неверный ввод!");
            }
        }
        else{
            System.out.println("Ошибка! Неверный ввод!");
        }
    }
}

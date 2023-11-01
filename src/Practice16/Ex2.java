package Practice16;
import java.util.Scanner;
public class Ex2 {
    public void exceptionDemo() {
        Scanner myScanner = new Scanner(System.in);
        System.out.print("Enter an integer ");
        String intString = myScanner.next();
        int i = 2;
        try {
            i = Integer.parseInt(intString);
            System.out.println(2 / i);
        } catch (ArithmeticException e) {
            System.out.println("Attempted division by zero");
        } catch (NumberFormatException e) {
            System.out.println("The program is waiting for the input of an integer value");
        } finally {
            System.out.println("Этот кусок программы выведется в любом случае");
        }
    }
    public static void main(String[] args) {
        Ex2 q = new Ex2();
        q.exceptionDemo();
    }
}

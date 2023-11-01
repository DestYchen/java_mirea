package Practice18;
import java.util.Arrays;

public class Main {
    public static void main(String[] args){
        Generik<Integer, Float, String> generikClass = new Generik<>(10, 10.5f, "MIREA");
        System.out.println("T - 10, K - 10.5f, V - MIREA");
        generikClass.printClassName();
        System.out.println();

        Integer[] array = {10, 3, 34, 5, 17};
        System.out.println("Исходный массив: " + Arrays.toString(array));
        MinMax<Integer> MinMax = new MinMax<>(array);
        System.out.println("Min: " + MinMax.findMin());
        System.out.println("Max: " + MinMax.findMax());
    }
}

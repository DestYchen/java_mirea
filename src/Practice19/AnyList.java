package Practice19;
import java.util.Arrays;
public class AnyList {
    public static <E> void any(String s, E[] arr){
        E[] a = arr;
        Any_list_func <E> any = new Any_list_func<E>();
        any.setArr(a);
        System.out.println("Тип: " + s);
        any.printer();
    }
    public static void main(String[] args){
        String[] str = {"MIREA", "TOP", "100%"};
        Integer[] integ = new Integer[]{1, 2, 3, 4, 5, 6, 7};
        Double[] dub = {1.2, 1.3, 1.4, 1.5};
        any("String", str);
        any("Integer", integ);
        any("Double", dub);
    }
}

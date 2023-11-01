package Practice19;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
public class ToList {
    public static <T> List<T> convertToList(T array[]){
        List<T> list = new ArrayList<>();
        Collections.addAll(list, array);
        return list;
    }
    public static void main(String[] args){
        Integer[] number = new Integer[] {2, 3, 4, 6, 7};
        List<Integer> list1 = convertToList(number);
        System.out.println("List: " + list1);
    }
}

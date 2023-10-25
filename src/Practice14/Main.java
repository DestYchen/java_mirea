package Practice14;
import java.util.ArrayList;
public class Main {
    public static void main(String[] args) {
        ArrayList<String> al = new ArrayList<>();
        al.add("Hi2");
        al.add("Hi3");
        WaitList<String> wl = new WaitList<>();
        wl.add("Hi");
        wl.add("Hi2");
        wl.add("Hi3");
        System.out.println(wl);
        System.out.println("Удаляемый элемент: " + wl.remove());
        System.out.println(wl);
        BoundedWaitList<String> bwl = new BoundedWaitList<>(3);
        bwl.add("foo");
        bwl.add("foo2");
        bwl.add("bar");
        System.out.println();
        System.out.println(bwl);
        try{
            bwl.add("bar2");
        }catch (Exception e){
            e.printStackTrace();
        }
        System.out.println("Количество элементов: " + bwl.getCapacity());
        System.out.println();
        UnfairWaitList<Integer> uwl = new UnfairWaitList<>();
        uwl.add(1);
        uwl.add(2);
        uwl.add(23);
        uwl.add(5);
        uwl.add(5);
        uwl.add(6);
        System.out.println(uwl);
        uwl.remove(5);
        System.out.println(uwl);
        uwl.moveToBack(23);
        System.out.println(uwl);
    }
}

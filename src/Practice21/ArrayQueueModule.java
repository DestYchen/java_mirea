package Practice21;
import java.util.Queue;
import java.util.LinkedList;
public class ArrayQueueModule {
    private int x = 13;
    private int y = 27;
    private int z = 35;
    public int getX(){
        return x;
    }
    public int getY(){
        return y;
    }
    public int getZ(){
        return z;
    }
    public Queue clear(Queue current){
        current.clear();
        return current;
    }
    public Queue enqueue(Queue current, int toAdd){
        current.add(toAdd);
        return current;
    }
    public int dequeue(Queue current){
        int toRes = (int) current.element();
        current.poll();
        return toRes;
    }
    public int size(Queue current){
        return current.size();
    }
    public boolean isEmpty(Queue current){
        return current.isEmpty();
    }
    public static void main(String[] args){
        ArrayQueueModule first = new ArrayQueueModule();
        Queue<Integer> numbers = new LinkedList<>();
        numbers.add(first.getX());
        numbers.add(first.getX());
        numbers.add(first.getX());
        System.out.println("Queue: " + numbers);
        int removedNumber = first.dequeue(numbers);
        System.out.println("Removed Element: " + removedNumber);
        System.out.println("Queue after delection: " + numbers);
    }
}

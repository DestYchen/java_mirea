package Practice12;
import java.util.Stack;
public class Card_game_stack {
    Stack<Integer> first, second;
    public Card_game_stack(String first, String second){
        this.first = new Stack<>();
        this.second = new Stack<>();
        for(int i = 4; i >= 0; i--){
            this.first.push(Integer.parseInt(first.substring(i, i + 1)));
            this.second.push(Integer.parseInt(second.substring(i, i + 1)));
        }
    }
    private void pushBack(Stack<Integer> str, Integer number){
        Stack<Integer> new_str = new Stack<>();
        while(!str.isEmpty()){
            new_str.push(str.pop());
        }
        str.push(number);
        while (!new_str.isEmpty()){
            str.push(new_str.pop());
        }
    }
    public String play(){
        int count = 0;
        while(!first.isEmpty() && !second.isEmpty() && count <= 106){
            if(first.peek() > second.peek() && second.peek() != 0){
                pushBack(first, first.pop());
                pushBack(first, second.pop());
            }
            else{
                pushBack(second, first.pop());
                pushBack(second, second.pop());
            }
            count++;
        }
        String res = "";
        if(first.isEmpty()){
            res += "second ";
        }
        else{
            res += "fisrt ";
        }
        res += count;
        if (count >= 106){
            res = count + " botva";
        }
        return res;
    }
    public static void main(String[] args){
        System.out.println(new Card_game_stack("13579", "24680").play());
        System.out.println(new Card_game_stack("98765", "43210").play());
        System.out.println(new Card_game_stack("13028", "42695").play());
    }
}

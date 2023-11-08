package Practice20;
import java.util.ArrayList;
import java.util.Stack;
public class Model {
    public int stacky(ArrayList<String> tockens){
        Stack<String> stack = new Stack<String>();
        int x, y;
        String result = "";
        int get = 0;
        String choice;
        int value = 0;
        String p = "";
        for (int i = 0; i < tockens.size(); i++){
            if (tockens.get(i) != "+" && tockens.get(i) != "-" && tockens.get(i) != "*" && tockens.get(i) != "/"){
                stack.push(tockens.get(i));
                continue;
            }else{
                choice = tockens.get(i);
            }
            switch (choice){
                case "+":
                    x = Integer.parseInt(stack.pop());
                    y = Integer.parseInt(stack.pop());
                    value = x + y;
                    result = p + value;
                    stack.push(result);
                    break;
                case "-":
                    x = Integer.parseInt(stack.pop());
                    y = Integer.parseInt(stack.pop());
                    value = x - y;
                    result = p + value;
                    stack.push(result);
                    break;
                case "*":
                    x = Integer.parseInt(stack.pop());
                    y = Integer.parseInt(stack.pop());
                    value = x * y;
                    result = p + value;
                    stack.push(result);
                    break;
                case "/":
                    x = Integer.parseInt(stack.pop());
                    y = Integer.parseInt(stack.pop());
                    value = x / y;
                    result = p + value;
                    stack.push(result);
                    break;
                default:
                    continue;
            }
        }
        return Integer.parseInt(stack.pop());
    }
}

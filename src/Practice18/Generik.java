package Practice18;
import java.io.Serializable;
public class Generik <T extends Comparable, V, K> {
    private T var1;
    private V var2;
    private K var3;
    public Generik(T var1, V var2, K var3){
        this.var1 = var1;
        this.var2 = var2;
        this.var3 = var3;
    }
    public T getVar1(){
        return var1;
    }
    public V getVar2(){
        return var2;
    }
    public K getVar3(){
        return var3;
    }
    public void printClassName(){
        System.out.println("Var 1 class: " + var1.getClass().getName());
        System.out.println("Var 2 class: " + var2.getClass().getName());
        System.out.println("Var 3 class: " + var3.getClass().getName());
    }
}

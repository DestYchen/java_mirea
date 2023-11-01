package Practice19;
public class Any_list_func <E>{
    private E[] arr;
    public void setArr(E[] arr){
        this.arr = arr;
    }
    public void printer(){
        for (Object str: arr){
            System.out.print(str + ", ");
        }
        System.out.println();
    }
}

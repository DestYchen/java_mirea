package Practice17;
import java.math.BigInteger;
public class INN_exception extends Exception{
    private BigInteger inn_num;
    public INN_exception(BigInteger inn){
        super("ИНН с номером " + inn + " не действителен!");
        inn_num = inn;
    }
    public BigInteger getInn_num(){
         return inn_num;
    }
}

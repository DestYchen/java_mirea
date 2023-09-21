package practice2;
import java.lang.*;

public class TestAuthor {
    public static void main(String[] args){
        Author test = new Author("Dmitriy", "lomakinmirea@mail.ru", 'M');
        System.out.println(test.toString());
        test.setEmail("test@test.test");
        System.out.println(test.toString());
    }
}

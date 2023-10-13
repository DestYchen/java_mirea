package Practice9;
public class Nameable_test {
    public static void main(String[] args){
        Nameable printable = new Smartphone("IPhone");
        Nameable printable_2 = new Website("YouTube");
        System.out.println("Модель телефона: " + printable.getName());
        System.out.println("Название сайта: " + printable_2.getName());
    }
}

package Practice6;

public class DishTest {
    public static void main(String[] args){
        Dish vilka = new Fork("Именная", 5, 20);
        System.out.println(vilka);
        System.out.println(vilka.getName());
        System.out.println(vilka.toString());
        System.out.println(vilka.get_cost());
        System.out.println();
        Dish vilka_slave = (Dish)vilka;
        System.out.println(vilka_slave.toString());
        System.out.println();

        Dish tarelka = new Plate("Хорошая", 2, 4);
        System.out.println(tarelka);
        System.out.println(tarelka.getName());
        System.out.println(tarelka.toString());
        System.out.println(tarelka.get_cost());
        System.out.println();
        Dish tarelka_slave = (Dish)tarelka;
        System.out.println(tarelka_slave.toString());
    }
}

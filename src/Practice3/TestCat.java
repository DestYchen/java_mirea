package Practice3;

public class TestCat {
    public static void main(String[] args){
        Cat c1 = new Cat("Барсик", 3);
        Cat c2 = new Cat("Мурка", 2);
        Cat c3 = new Cat("Джек", 7);
        System.out.println(c1.toString());
        System.out.println(c2.toString());
        System.out.println(c3.toString());
        c1.setAge(9);
        c1.setName("Гриша");
        System.out.println(c1.toString());
        c1.intoHumanAge();
        c2.intoHumanAge();
        c3.intoHumanAge();
    }
}

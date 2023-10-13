package Practice4;

public class HumanTest {
    public static void main(String[] args){
        Human h1 = new Human();
        Human.Hand hand1 = h1.new Hand(10);
        Human.Leg leg1 = h1.new Leg(20);
        Human.Head head1 = h1.new Head(30);
        System.out.println("Параметры человека:");
        System.out.println("Длина руки человека: " + hand1.getLenghtHand());
        System.out.println("Длина ноги человека: " + leg1.getLegLenght());
        System.out.println("Объём головы человека: " + head1.getVolumeHead());
        head1.setVolumeHead(50);
        leg1.setLegLenght(60);
        hand1.setLenghtHand(70);
        System.out.println("Новые параметры человека:");
        System.out.println("Новая длина руки человека: " + hand1.getLenghtHand());
        System.out.println("Новая длина ноги человека: " + leg1.getLegLenght());
        System.out.println("Новый объём головы человека: " + head1.getVolumeHead());
    }
}

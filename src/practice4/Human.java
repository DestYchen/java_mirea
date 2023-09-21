package practice4;

public class Human {
    public Human(){}
    public class Leg{
        private float LegLength;
        public Leg(float LegL){
            LegLength = LegL;
        }
        public double getLegLenght(){
            return LegLength;
        }
        public void setLegLenght(float LL){
            LegLength = LL;
        }
    }
    public class Head{
        private float volume;
        public Head(float HeadV){
            HeadV = volume;
        }
        public double getVolumeHead(){
            return volume;
        }
        public void setVolumeHead(float vh){
            volume = vh;
        }
    }
    public class Hand{
        private float Lenght;
        public Hand(float HandL){
            Lenght = HandL;
        }
        public double getLenghtHand(){
            return Lenght;
        }
        public void setLenghtHand(float LH){
            Lenght = LH;
        }
    }
}

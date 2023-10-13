package Practice4;

public class Circle {
    private float radius;
    public Circle(float r){
        radius = r;
    }

    @Override
    public String toString() {
        return "Circle{" +
                "radius=" + radius +
                '}';
    }

    public float getRadius() {
        return radius;
    }

    public void setRadius(float radius) {
        this.radius = radius;
    }

    public double getSquare(){
        return Math.PI * radius * radius;
    }
    public double getLength(){
        return 2* Math.PI * radius;
    }
}

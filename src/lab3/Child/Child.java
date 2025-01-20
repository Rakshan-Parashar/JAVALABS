package Child;
import Parent.Parent;
public class Child extends Parent {
    public double sin(int deg){
        double rad = deg*3.14159 / 180;
        return Math.sin(rad);
    }
}

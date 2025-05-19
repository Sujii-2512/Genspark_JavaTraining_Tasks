package Task1.Oops;

public class Owl extends Bird implements Flyable {
    public Owl() {
        setFlyBehavior(new GlideFly());
    }

    public void fly() {
        performFly();
    }
}

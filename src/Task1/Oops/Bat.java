package Task1.Oops;

public class Bat extends Bird implements Flyable {
    public Bat() {
        setFlyBehavior(new FlapFly());
    }

    public void fly() {
        performFly();
    }
}


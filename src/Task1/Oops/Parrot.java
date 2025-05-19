package Task1.Oops;


public class Parrot extends Bird implements Flyable, Singable {
    public Parrot() {
        setFlyBehavior(new FlapFly());
    }

    public void fly() {
        performFly();
    }

    public void sing() {
        System.out.println("Parrot is singing beautifully.");
    }
}


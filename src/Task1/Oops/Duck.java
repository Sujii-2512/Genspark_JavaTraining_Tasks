package Task1.Oops;

public class Duck extends Bird implements Flyable, Swimmable, Singable {
    public Duck() {
        setFlyBehavior(new FlapFly());
    }

    public void fly() {
        performFly();
    }

    public void swim() {
        System.out.println("Duck is swimming in the pond.");
    }

    public void sing() {
        System.out.println("Duck is quacking.");
    }
}

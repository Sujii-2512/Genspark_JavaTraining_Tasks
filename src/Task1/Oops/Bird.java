package Task1.Oops;

public abstract class Bird {
    String name;
    String color;
    int weight;

    FlyBehavior flyBehavior;

    public void setFlyBehavior(FlyBehavior fb) {
        this.flyBehavior = fb;
    }

    public void performFly() {
        if (flyBehavior != null)
            flyBehavior.performFly();
        else
            System.out.println("This bird cannot fly.");
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public String getName() {
        return name;
    }

    public String getColor() {
        return color;
    }

    public int getWeight() {
        return weight;
    }
}

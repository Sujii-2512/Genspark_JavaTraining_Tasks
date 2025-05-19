package Task1.Oops;

public class Main {
    public static void main(String[] args) {
        Parrot parrot = new Parrot();
        parrot.setName("\nParrot");
        System.out.println(parrot.getName());
        parrot.fly();
        parrot.sing();

        Penguin penguin = new Penguin();
        penguin.setName("\nPenguin");
        System.out.println(penguin.getName());
        penguin.swim();

        Owl owl = new Owl();
        owl.setName("\nOwl");
        System.out.println(owl.getName());
        owl.fly();

        Duck duck = new Duck();
        duck.setName("\nWhite Duck");
        System.out.println(duck.getName());
        duck.fly();
        duck.swim();
        duck.sing();

        Bat bat = new Bat();
        bat.setName("\nBlack Bat");
        System.out.println(bat.getName());
        bat.fly();
    }
}


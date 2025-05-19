package Task4;

public class Starincr {
    public static void printStars(int i, int n) {
        if (i > n) return;
        for (int j = 0; j < i; j++) {
            System.out.print("*");
        }
        System.out.println();
        printStars(i + 1, n);
    }

    public static void main(String[] args) {
        printStars(1, 6);
    }
}

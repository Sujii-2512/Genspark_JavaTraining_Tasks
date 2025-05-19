package Task4;

public class Stardecr {
    public static void printStars(int n) {
        if (n == 0) return;
        for (int i = 0; i < n; i++) {
            System.out.print("*");
        }
        System.out.println();
        printStars(n - 1);
    }

    public static void main(String[] args) {
        printStars(6);
    }
}

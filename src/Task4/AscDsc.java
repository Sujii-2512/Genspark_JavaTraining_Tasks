package Task4;

public class AscDsc {
    public static void printBoth(int n) {
        if (n == 0) return;
        System.out.println(n); // descending
        printBoth(n - 1);
        System.out.println(n); // ascending
    }

    public static void main(String[] args) {
        printBoth(3);
    }
}

package Task4;

public class Descending {
    public static void printDescending(int n) {
        if (n == 0) return; // base case
        System.out.println(n); // print current number
        printDescending(n - 1); // call for next smaller number
    }

    public static void main(String[] args) {
        printDescending(5);
    }
}

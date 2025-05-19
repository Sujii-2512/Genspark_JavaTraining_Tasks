package Task4;

public class Ascending {
    public static void printAscending(int n) {
        if (n == 0) return; // base case
        printAscending(n - 1); // call for smaller number first
        System.out.println(n); // print after recursive call
    }

    public static void main(String[] args) {
        printAscending(5);
    }
}

package Task4;

public class Numprint {
    public static void printNumbers(int row, int maxRow) {
        if (row > maxRow) return;
        for (int i = 1; i <= row; i++) {
            System.out.print(i + " ");
        }
        System.out.println();
        printNumbers(row + 1, maxRow);
    }

    public static void main(String[] args) {
        printNumbers(1, 5);
    }

}

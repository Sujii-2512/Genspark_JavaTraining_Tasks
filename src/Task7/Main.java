package Task7;

public class Main {
    public static void main(String[] args) {
        int[] arr = {9, 6, 3, 10, 6, 7, 4};

        System.out.println("Before sorting:");
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();

        InsertionSort sorter = new InsertionSort();
        sorter.sort(arr);

        System.out.println("After sorting:");
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
}

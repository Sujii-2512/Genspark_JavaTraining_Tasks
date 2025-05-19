package Task6;

public class Main {
    public static void main(String[] args) {
        MergeSort sorter = new MergeSort();

        int[] numbers = {38, 27, 43, 3, 9, 82, 10};

        System.out.println("Before sorting:");
        sorter.printArray(numbers);

        sorter.sort(numbers, 0, numbers.length - 1);

        System.out.println("After sorting:");
        sorter.printArray(numbers);
    }
}

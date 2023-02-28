public class Main {
    public static void main(String[] args) {
        int[] array = {5, 2, 8, 1, 3};
        BubbleSort.bubbleSort(array);
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
    }
}
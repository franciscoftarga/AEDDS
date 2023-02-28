public class BubbleSort {
    public static void bubbleSort(int[] array) {
        int n = array.length; //n = 4
        boolean swapped;
        do {
            swapped = false;
            for(int i = 1;i < n; i++) {
                if(array[i-1] > array[i]) {
                    int temp = array[i-1];
                    array[i-1] = array[i];
                    array[i] = temp;
                    swapped = true;
                }
            }
            n--;
        } while (swapped);
    }
}

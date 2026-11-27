public class quickSort {
    static void main() {
        int[] arr = {8,4,2,7,1,3,9,6,10,5};

        quicksort(arr, 0, arr.length - 1);

        for (int i:arr) {
            System.out.print(i + " ");
        }
    }
    static void quicksort(int[] arr, int start, int end) {
        if (end <= start) {
            return; 
        }
        int pivot = partition(arr,start,end);
        quicksort(arr, start, pivot - 1);
        quicksort(arr, pivot + 1, end);
    }
    static int partition(int[] arr, int start, int end) {
        int pivot = arr[end];
        int i = start - 1;

        for (int j = start; j <= end - 1; j++) {
            if (arr[j] < pivot) {
                i++;
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
        i++;
        int temp = arr[i];
        arr[i] = arr[end];
        arr[end] =temp;
        return i;
    }
}

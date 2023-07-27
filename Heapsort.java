import java.util.Arrays;
import java.util.Random;

public class Heapsort {
    private static void heapSort(int[] arr){
        int n = arr.length;
        for (int i = n / 2 - 1; i >= 0 ; i--) {
            heapify(arr, i , n);            
        }
        for (int i = n - 1; i >= 0; i--) {
            int temp = arr[i];
            arr[i] = arr[0];
            arr[0] = temp;
            heapify(arr, 0, i);
         }
    }
    private static void heapify(int[] arr, int i, int n){
            int left = i * 2 + 1;
            int right = i * 2 + 2;
            int largest = i;

            if(left < n && arr[left] > arr[largest]){
                largest = left;
            }
            if(right < n && arr[right] > arr[largest]){
                largest = right;
            }
            if(i != largest){
                int temp = arr[i];
                arr[i] = arr[largest];
                arr[largest]=temp;
                heapify(arr, largest, n);
            }
            
    }
    public static void main(String[] args) {
        

        int[] array = new int[10];
        Random rand = new Random();
        for (int i = 0; i < array.length; i++) {
            array[i] = rand.nextInt(15);
        }
        System.out.println(Arrays.toString(array));
        heapSort(array);
        System.out.println(Arrays.toString(array));
    }
}

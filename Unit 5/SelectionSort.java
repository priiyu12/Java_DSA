package Unit5;

public class SelectionSort {
    public static void main(String[] args) {
        int[] arr = {21, 12, 9, 16, 3};
        selection(arr);
        for (int element : arr) {
            System.out.print(element + " ");
        }
    }

    static void selection(int[] arr){
        for (int i = 0; i < arr.length; i++) {
            int end = arr.length - i - 1;
            int maxIndex = getmaxIndex(arr, 0, end);
            swap(arr, maxIndex, end);
        }
    }
    static int getmaxIndex(int[] arr, int start, int end){
        int max = start;
        for(int i = start; i <= end; i++){
            if(arr[max] < arr[i]){
                max = i;
            }
        }
        return max;
    }
    static void swap(int[] arr, int first, int second){
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
}

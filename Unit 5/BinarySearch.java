import java.util.Arrays;

public class BinarySearch {
    public static void main(String[] args) {
        int[] arr = {6, 69, 1, 18, 2, 17, 82, 21, 45, 77};
        int target = 6;
        int result = search(arr, target);
        if(result == -1)
            System.out.println("Target " + target + " was not found!");
        else
            System.out.println("Target " + target + " was found!");
    }

    static int search(int[] arr, int target){
        sort(arr);
        int start = 0;
        int end = arr.length;
        while(start<=end){
            int mid = (start+end)/2;
            if(target < arr[mid])
                end = mid - 1;
            else if(target > arr[mid])
                start = mid + 1;
            else
                return mid;
        }
        return -1;
    }

    static void sort(int[] arr){
        System.out.println(Arrays.toString(arr));
        for(int i = 0; i < arr.length; i++){
            for(int j = i+1; j < arr.length; j++){
                if(arr[i]>arr[j]){
                    swap(arr, i, j);
                }
            }
        }
        System.out.println(Arrays.toString(arr));
    }
    static void swap(int[] arr, int first, int second){
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
}

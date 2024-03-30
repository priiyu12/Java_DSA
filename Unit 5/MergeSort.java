import java.util.Arrays;

public class MergeSort {
    public static void main(String[] args) {
        int[] arr = {3, 25, 11, 1, 78, 42};
        divide(arr, 0, arr.length-1);

        System.out.println(Arrays.toString(arr));
    }
    static void divide(int[] arr, int start, int end){

        if(start>=end)
            return;

        int mid = (start + end)/2;
        divide(arr, start, mid);
        divide(arr, mid+1, end);

        merge(arr, start, mid, end);
    }
    static void merge(int[] arr, int start, int mid, int end){
        int[] mergedArr = new int[end-start+1];
        int i = start;
        int j = mid+1;
        int k = 0;

        while(i <= mid && j <= end){
            if(arr[i]<=arr[j])
                mergedArr[k++] = arr[i++];
            else
                mergedArr[k++] = arr[j++];
        }

        while(i <= mid)
            mergedArr[k++] = arr[i++];

        while(j <= end)
            mergedArr[k++] = arr[j++];

        for(int element : mergedArr)
            arr[start++] = element;
    }
}

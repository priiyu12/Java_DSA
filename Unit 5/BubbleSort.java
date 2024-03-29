public class BubbleSort {
    public static void main(String[] args) {
        int[] arr = {21, 12, 9, 16, 3};
        bubble(arr);
        for(int element : arr){
            System.out.print(element + " ");
        }
    }
    static void bubble(int[] arr){
        for (int i = 0; i < arr.length; i++) {
            for (int j = 1; j < arr.length-i ; j++) {
                if(arr[j]<arr[j-1]){
                    int temp = arr[j];
                    arr[j] = arr[j-1];
                    arr[j-1] = temp;
                }
            }
        }
    }
}

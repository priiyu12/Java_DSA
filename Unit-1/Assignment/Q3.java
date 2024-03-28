// Write a java code to perform addition of two array and save it into third array

public class SumOfArray {
    public static void main(String[] args) {
        int[] arr1 =  {8, 72, 15, 4, 42}; //initialized arr1 with 5 values
        int[] arr2 = {16, 7, 90, 57, 2}; //initialized arr2 with 5 values
        int[] arr3 = new int[5];//declared new array to store the sum

        //arr3 = arr1 + arr2 (sum of elements of arr1 & arr2)
        for(int i = 0; i < arr1.length; i++) {
            arr3[i] = arr1[i]+arr2[i];
        }

        //printing arr3
        for(int val : arr3){
            System.out.println(val);
        }
    }
}

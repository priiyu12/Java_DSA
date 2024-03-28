//Write a java code sum of all array elements

public class SumOfElements {
    public static void main(String[] args) {
        int[] arr = {8, 72, 15, 5, 42}; //initialized array with 5 values
        int sum = 0;
        for(int val : arr){
            sum += val;
        }
        System.out.println("Sum of elements = " + sum);
    }
}

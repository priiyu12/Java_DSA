//1. Write a java code to create an array of five elements and print on terminal

public class PrintArray {
  public static void main(String[] args) {
    int[] arr = new int[5]; //declared array of size 5
    arr = new int[]{8, 72, 15, 4, 42}; //initialized array with 5 values
  
    //printing array elements using for each loop
    for(int val : arr){
        System.out.println(val);
    }
  }
}

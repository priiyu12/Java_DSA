//Write a java code to copy one array to another array

public class CopyArray {
    public static void main(String[] args) {
        int[] arr1 =  {8, 72, 15, 4, 42}; //initialized array with 5 values
        int[] arr2 = new int[5]; //declared new array to copy elements

        //copying elements of arr1 to arr2
        for(int i = 0; i < arr1.length; i++) {
            arr2[i] = arr1[i];
        }

        //printing arr2
        for(int val : arr2){
            System.out.println(val);
        }
    }
}


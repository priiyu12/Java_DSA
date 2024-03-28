//Write a java code to split one array into two parts

public class SpiltArray {
    public static void main(String[] args) {
        int[] arr1 =  {1, 2, 3, 4, 5, 6, 7, 8, 9, 10}; //initialized arr1 with 5 values
        int j = arr1.length/2;
        int[] arr2 = new int[j];//declared new array to store the split elements
        int[] arr3 = new int[j];//declared new array to store the split elements

        for(int i = 0; i < arr1.length; i++) {
            //first 5 elements stored in arr2
            if(i<j){
                arr2[i] = arr1[i];
            }
            //last 5 elements stored in arr3
            else{
                arr3[i-j] = arr1[i];
            }
        }
        //printing arr2
        for(int val : arr2){
            System.out.print(val + " ");
        }

        System.out.println();

        //printing arr3
        for(int val : arr3){
            System.out.print(val + " ");
        }
    }
}

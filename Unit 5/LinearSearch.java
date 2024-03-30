public class LinearSearch {
    public static void main(String[] args) {
        int[] arr = {34, 26, 98, 1, 13};
        int target = 13;
        int result = search(arr, target);
         if(result == -1)
             System.out.println("Target " + target + " was not found");
         else
             System.out.println("Target " + target + " found on " + result + " index of array");
    }

    static int search(int[] arr, int target){
        int i=0;
        for(int element : arr){
            if(element==target)
                return i;
            i++;
        }
        return -1;
    }
}

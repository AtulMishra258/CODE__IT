
import java.util.Arrays;


public class Maximum {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};

        System.out.println("Answer from first method "+maximum(arr)); 
        
        System.out.println("Answer from second method "+maximum2(arr));
    }
//  First Method
    static int maximum(int[] arr){
        Arrays.sort(arr);
        return arr[arr.length-1];
    }
//   Second Method
    static int maximum2(int[] arr){
        int largest = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if(arr[i] >= largest){
                largest = arr[i];
            }
        }
        return largest;
    }

}

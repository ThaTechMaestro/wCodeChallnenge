import java.util.Arrays;
// Given arr = [1,2,3,4,5,6]
// selected element, n = 2
// rotate first time
// ---> [6,1,2,3,4,5]
// rotate second time
// ---> [5,6,1,2,3,4]

// using an intermediate array for the rotation

//input --> arr- nums
// selected element --> n

public class newTask2 {

    public static int[] rotateArray(int[] nums, int n){

        for (int i=0; i<n; i++){

            for( int j=nums.length-1; j>0; j--){

                int tempArray = nums[j];
                nums[j] = nums[j-1];
                nums[j-1] = tempArray;

            }
            //Display each array after rotating
            System.out.print(Arrays.toString(nums));
            System.out.println();

        }

        return nums;


    }

    public static void main(String[] args) {

        int[] nums = {1,2,3,4,5,6};

        int[] newArray = rotateArray(nums, 2);
        System.out.print(Arrays.toString(newArray));


    }


}

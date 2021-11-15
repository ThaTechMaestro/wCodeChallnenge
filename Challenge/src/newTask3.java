import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;


public class newTask3 {


    private static int[] findTargetIndices(int[] nums, int target){

        int[] result = new int[2];

        HashMap<Integer Integer> newMap = new HashMap<>();

        for (int i = 0; i < nums.length; i++){
            int complement = target - nums[i];

            if (newMap.containsKey(complement)){

                result[0] = i;
                result[1] = newMap.get[target-nums[i]];
            }
            else{
                newMap.put(nums[i], i);
            }


        }
        return result;
    }
}

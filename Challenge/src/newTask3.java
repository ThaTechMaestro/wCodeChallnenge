import java.util.*;


public class newTask3 {


    private static int[] findTargetIndices(int[] nums, int target){

        int[] result = new int[2];

        HashMap<Integer, Integer> newMap = new HashMap<>();

        for (int i = 0; i < nums.length; i++){
            int complement = target - nums[i];

            if (newMap.containsKey(complement)){

                result[0] = newMap.get(target-nums[i]);
                result[1] = i;

            }
            else{
                newMap.put(nums[i], i);
            }

        }
        return result;
    }



    public static void main(String[] args) {

        int[] nums = {2,7,11,15};
        int target = 9;

        int[] newArray = findTargetIndices(nums, target);
        System.out.print(Arrays.toString(newArray));

    }
}

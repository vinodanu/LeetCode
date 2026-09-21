import java.util.Arrays;
import java.util.HashMap;

public class TwoSum {
    public static void main(String[] args) {
        //int[] nums = new int[]{2, 7, 11, 15};
        int[] nums = {2, 7, 11, 15};

        int[] result= twoSum(nums, 13);
        System.out.println(Arrays.toString(Arrays.stream(result).toArray()));
    }

    public static int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i = 0; i < nums.length; i++) {
            int need = target - nums[i];
            if(map.containsKey(need)) {
                return new int[]{map.get(need), i};
            }
            map.put(nums[i], i);
        }
        throw new IllegalArgumentException("No Solution");
    }
}

import java.util.Arrays;

public class ContainDuplicate {

    public static boolean containsDuplicate(int[] nums) {
        Arrays.sort(nums);
        for(int i = 1; i < nums.length; i++) {
            if(nums[i] == nums[i - 1])
                return true;
        }
        return false;
    }

    public static void main(String[] args) {
        boolean b = containsDuplicate(new int[]{1, 2, 3, 1});
        if(b)
            System.out.println(b + " Array is contains Duplicates!!");
        else
            System.out.println(b+ " Array is contains Unique Values!!");
    }
}

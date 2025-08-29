  import java.util.Arrays;
import java.util.HashMap;

class TwoSum {
    public static void main(String[] args) {
        int[] nums = {3,2,4};
        System.out.println(Arrays.toString(twoSum(nums, 6)));
    }

    public static int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int req = target - nums[i];
            if (map.containsKey(req)) {
                return new int[] { map.get(req), i };
            }
            map.put(nums[i], i);
        }
        return null;
    }
}

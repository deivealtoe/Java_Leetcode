package two_sum;

import java.util.HashMap;
import java.util.Map;

public class TwoSum {

    public int[] twoSum(int[] nums, int target) {
        /*
        int[] indicesFound = new int[2];

        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] + nums[j] == target) {
                    indicesFound[0] = i;
                    indicesFound[1] = j;
                }
            }
        }

        return indicesFound;
        */

        Map<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < nums.length; ++i) {
            if (map.keySet().contains(nums[i])) {
                return new int[] { map.get(nums[i]), i };
            }

            map.put(target - nums[i], i);
        }

        return null;
    }

}

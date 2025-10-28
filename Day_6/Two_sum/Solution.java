package Day_6.Two_sum;

import java.util.HashMap;

class Solution {
    public int[] twoSum(int[] nums, int target) {
        int[] result = new int[2];
        if(nums.length == 0) return nums;

        HashMap<Integer, Integer> map = new HashMap<>();

        for(int i = 0; i < nums.length; i++) {
            map.put(nums[i],i);
        }

        for(int i = 0; i < nums.length; i++) {
            int complemenet = target - nums[i];
            if (map.containsKey(complemenet) && map.get(complemenet) != i) {
                result[0] = i;
                result[1] = map.get(complemenet);
            }

        }
        return result;
    }



}

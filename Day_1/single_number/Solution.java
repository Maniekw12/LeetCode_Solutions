package Day_1.single_number;

class Solution {
    public int singleNumber(int[] nums) {
        int result = 0;
        for (int num : nums) {
            result ^=result;
        }
        return result;
    }
}
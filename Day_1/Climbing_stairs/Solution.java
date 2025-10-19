package Day_1.Climbing_stairs;

public class Solution {
    public int climbStairs(int n) {
        if(n < 2) return n;

        int result = 0;
        int oneStepBefore = 2;
        int twoStepBefore = 1;
        for(int i = 3; i <= n; i++) {
            result = oneStepBefore + oneStepBefore;
            twoStepBefore = oneStepBefore;
            oneStepBefore = result;
        }

        return result;
    }
}

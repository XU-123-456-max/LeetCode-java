package src.array;
/*
 * @lc app=leetcode.cn id=1 lang=java
 *
 * [1] 两数之和
 */
import java.util.Map;
import java.util.HashMap;
// @lc code=start
class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> table = new HashMap<Integer, Integer>();
        for(int i = 0;i < nums.length;i++){
            if(table.containsKey(target - nums[i])){
                return new int[]{table.get(target - nums[i]), i};
            }
            table.put(nums[i], i);
        }
        return new int[0];
    }
}
// @lc code=end


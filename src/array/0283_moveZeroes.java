/*
 * @lc app=leetcode.cn id=283 lang=java
 *
 * [283] 移动零
 */

// @lc code=start
class Solution {
    public void moveZeroes(int[] nums) {
        int n = nums.length;
        int left = 0, right = 0;
        while(right < n){
            if(nums[right] != 0){
                int temp = nums[right];
                nums[right] = 0;
                nums[left] = temp;
                left++;
            }
            right++;
        }
    }
}
// @lc code=end
/*
非零元素左移，剩余位置补零
public void moveZeroes(int[] nums) {
    int cur = 0;
    for (int i = 0; i < nums.length; i++) {
        if (nums[i] != 0) {
            nums[cur] = nums[i];
            cur++;
        }
    }
    for (int i = cur; i < nums.length; i++) {
        nums[i] = 0;
    }
}
*/

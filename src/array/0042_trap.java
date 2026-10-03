/*
 * @lc app=leetcode.cn id=42 lang=java
 *
 * [42] 接雨水
 */

// @lc code=start
class Solution {
    public int trap(int[] height) {
        int ans = 0;
        int left = 0,right = height.length - 1;
        int leftMax = 0, rightMax = 0;
        while(left < right){
            leftMax = (height[left] > leftMax ? height[left] : leftMax);
            rightMax = (height[right] > rightMax ? height[right] : rightMax);
            if(height[left] < height[right]){
                ans = ans + leftMax - height[left];
                left++;
            }
            if(height[left] >= height[right]){
                ans = ans + rightMax - height[right];
                right--;
            }
        }
        return ans;
    }
}
// @lc code=end
/*
class Solution {
    public int trap(int[] height) {
        int n = height.length;
        int[] leftMax = new int[n];
        leftMax[0] = height[0];
        for(int i = 1;i < n;i++){
            leftMax[i] = Math.max(leftMax[i - 1],height[i]);
        }

        int[] rightMax = new int[n];
        rightMax[n - 1] = height[n - 1];
        for(int i = n - 2;i >= 0;i--){
            rightMax[i] = Math.max(rightMax[i + 1],height[i]);
        }

        int ans = 0;
        for(int i = 0;i < n;i++){
            int level = Math.min(leftMax[i],rightMax[i]);
            ans += Math.max(0,level - height[i]);
        }
        return ans;
    }
}
*/

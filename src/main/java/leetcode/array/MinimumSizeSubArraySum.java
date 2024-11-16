package leetcode.array;

/**
 * <a href="https://leetcode.cn/problems/minimum-size-subarray-sum">209. 长度最小的子数组</a>
 * 给定一个含有 n 个正整数的数组和一个正整数 target。找出该数组中满足其总和大于等于 target 的长度最小的子数组
 *  [numsl, numsl+1, ..., numsr-1, numsr] ，并返回其长度。如果不存在符合条件的子数组，返回 0 。
 *
 * @author hochenchong
 * @date 2024/11/16
 */
/*
class Solution {
    public int minSubArrayLen(int target, int[] nums) {

    }
}
 */
public class MinimumSizeSubArraySum {
    /*
    分析：
    大于等于 target
    长度最小的子数组
    返回其长度，不存在则返回 0
     */

    /*
    滑动窗口方式，不断调节窗口
    每个元素，只被操作 2 次，所以是 O(2n)，也就是 O(n)
     */
    public int minSubArrayLen(int target, int[] nums) {
        int result = Integer.MAX_VALUE;
        int left = 0;
        int sum = 0;
        for (int r = 0; r < nums.length; r++) {
            sum += nums[r];
            while (sum >= target) {
                if (result > (r - left + 1)) {
                    result = r - left + 1;
                }
                sum -= nums[left++];
            }
        }
        return result == Integer.MAX_VALUE ? 0 : result;
    }

    /*
    暴力解法：双层 for 循环遍历。O(n^2)
     */
    public int minSubArrayLen1(int target, int[] nums) {
        int minLen = Integer.MAX_VALUE;
        for (int i = 0; i < nums.length; i++) {
            int sum = 0;
            // 从 i 开始寻找总和大于 target
            for (int j = i; j < nums.length; j++) {
                sum += nums[j];
                // 满足条件跳出循环，下一位开始寻找
                if (sum >= target) {
                    if (j - i + 1 < minLen) {
                        minLen = j - i + 1;
                    }
                    // 如果长度 1，那就是最小的了
                    if (minLen == 1) {
                        return minLen;
                    }
                    break;
                }
            }
        }
        return minLen == Integer.MAX_VALUE ? 0 : minLen;
    }
}

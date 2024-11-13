package leetcode.array;

/**
 * 704. 二分查找
 * <p>
 * 题目：<a href="https://leetcode.cn/problems/binary-search/description/">...</a>
 * 给定一个 n 个元素有序的（升序）整型数组 nums 和一个目标值 target  ，写一个函数搜索 nums 中的 target，如果目标值存在返回下标，否则返回 -1。
 * 提示：
 * 1. 你可以假设 nums 中的所有元素是不重复的。
 * 2. n 将在 [1, 10000]之间。
 * 3. nums 的每个元素都将在 [-9999, 9999]之间。
 *
 * @author hochenchong
 * @date 2024/11/13
 */

//示例
//class Solution {
//    public int search(int[] nums, int target) {
//
//    }
//}
public class BinarySearch {
    /*
    分析：
    1. 二分查找的前提是数组有序，这里是升序。
    2. 二分查找的思路是每次取中间值，然后判断目标值与中间值的大小关系，如果目标值大于中间值，则在右半部分查找，否则在左半部分查找。
     */
    public static int search(int[] nums, int target) {
        if (nums == null || nums.length == 0 || nums[0] > target || nums[nums.length - 1] < target) {
            return -1;
        }
        int mid, left = 0, right = nums.length - 1;
        // 左闭右闭的区间，即[left, right]，当left > right时，区间为空，退出循环
        while (left <= right) {
            // 防止溢出（这题限制了数组元素的范围，不会溢出）
            mid = left + (right - left) / 2;
            if (nums[mid] == target) {
                return mid;
            } else if (nums[mid] < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return -1;
    }
}

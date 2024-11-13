package leetcode.array;

import java.util.HashMap;
import java.util.Map;

/**
 * @author hochenchong
 * @date 2023-08-11
 * <p>
 * @link <a href="https://leetcode.cn/problems/two-sum/">https://leetcode.cn/problems/two-sum/</a>
 * 1. Two Sum
 * Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target.
 * You may assume that each input would have exactly one solution, and you may not use the same element twice.
 * You can return the answer in any order.
 * <p>
 * 1. 两数之和
 * 给定一个整数数组 nums 和一个整数目标值 target，请你在该数组中找出 和为目标值 target  的那 两个 整数，并返回它们的数组下标。
 * 你可以假设每种输入只会对应一个答案。但是，数组中同一个元素在答案里不能重复出现。
 * 你可以按任意顺序返回答案。
 */
public class TwoSum {
    public int[] twoSumDemo(int[] nums, int target) {
        // ...
        return null;
    }

    /*
     * 双层 for 循环，遍历全部找出符合的目标值
     * 缺点：时间复杂度是 n 的 2 次方
     */
    public static int[] twoSumByFor(int[] nums, int target) {
        for (int i = 0; i < nums.length; i++) {
            for (int j = i+1; j < nums.length; j++) {
                if (nums[i] + nums[j] == target) {
                    return new int[]{i, j};
                }
            }
        }
        return new int[0];
    }

    /*
     * 优化：将找另一个值的复杂度改为 O(1)，通过哈希表来查找
     */
    public static int[] twoSumByHash(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            if (map.containsKey(target - nums[i])) {
                return new int[]{map.get(target - nums[i]), i};
            }
            map.put(nums[i], i);
        }
        return new int[0];
    }
}

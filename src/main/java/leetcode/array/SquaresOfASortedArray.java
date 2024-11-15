package leetcode.array;

/**
 * <a href="https://leetcode.cn/problems/squares-of-a-sorted-array/description/">977. 有序数组的平方</a>
 * <p>
 * 给你一个按 非递减顺序 排序的整数数组 nums，返回 每个数字的平方 组成的新数组，要求也按 非递减顺序 排序。
 *
 * @author hochenchong
 * @date 2024/11/15
 */
/*
class Solution {
    public int[] sortedSquares(int[] nums) {

    }
}
 */
public class SquaresOfASortedArray {
    /*
    分析：
    需要考虑的点：负数平方后可能大于原本最大的值

    常规做法，直接都平方后，进行排序，例如调用 Arrays.sort(nums) 排序

    方案二：两头同时平方，大的值，往结果往前塞
    指针重合则结束
     */
    public int[] sortedSquares(int[] nums) {
        int[] result = new int[nums.length];
        int left = 0;
        int right = nums.length - 1;
        for (int i = nums.length - 1; i >= 0; i--) {
            int l = nums[left] * nums[left];
            int r = nums[right] * nums[right];
            if (l > r) {
                result[i] = l;
                left++;
            } else {
                result[i] = r;
                right--;
            }
        }
        return result;
    }
}

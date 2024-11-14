package leetcode.array;

/**
 * <a href="https://leetcode.cn/problems/remove-element/description/">27. 移除元素</a>
 * 给你一个数组 nums 和一个值 val，你需要 原地 移除所有数值等于 val 的元素。元素的顺序可能发生改变。然后返回 nums 中与 val 不同的元素的数量。
 * 假设 nums 中不等于 val 的元素数量为 k，要通过此题，您需要执行以下操作：
 * 1. 更改 nums 数组，使 nums 的前 k 个元素包含不等于 val 的元素。nums 的其余元素和 nums 的大小并不重要。
 * 2. 返回 k。
 *
 * @author hochenchong
 * @date 2024/11/14
 */
/*
class Solution {
    public int removeElement(int[] nums, int val) {

    }
}
 */
public class RemoveElement {
    /*
    分析：（写复杂了）
    返回不等于的元素 k 即可，包含不等于 val 的值，对元素的顺序没有要求
    可以两个指针，从两头找起，左边指针找到就与右边指针非 val 的值换位置
    当两个指针重合时，结束
     */
    public int removeElement1(int[] nums, int val) {
        if (nums == null) {
            return 0;
        }
        int right = nums.length - 1;
        for (int i = 0; i <= right; i++) {
            // 找到右边非 val 的值
            while (nums[right] == val) {
                right -= 1;
                if (right == i) {
                    if (nums[i] == val) {
                        return 0;
                    }
                    return i + 1;
                }
            }
            // 相等时，第一个和最后一个交换位置
            if (nums[i] == val) {
                nums[i] = nums[right];
                right -= 1;
            }
        }
        return right + 1;
    }

    /*
    双指针法
        快指针：找新数组元素
        慢指针：指向更新新数组下标的位置
        缺点：需要保留的元素重复赋值
     */
    public int removeElement2(int[] nums, int val) {
        int slowIndex = 0;
        for (int fastIndex = 0; fastIndex < nums.length; fastIndex++) {
            if (val != nums[fastIndex]) {
                nums[slowIndex] = nums[fastIndex];
                slowIndex ++;
            }
        }
        return slowIndex;
    }

    public int removeElement(int[] nums, int val) {
        int left = 0;
        int right = nums.length;
        while (left < right) {
            if (nums[left] == val) {
                nums[left] = nums[right - 1];
                right --;
            } else {
                left ++;
            }
        }
        return left;
    }
}

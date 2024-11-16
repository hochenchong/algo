package leetcode.array;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

/**
 * @author hochenchong
 * @date 2024/11/16
 */
class MinimumSizeSubArraySumTest {

    @Test
    void minSubArrayLen() {
        MinimumSizeSubArraySum subArraySum = new MinimumSizeSubArraySum();
        Assertions.assertEquals(subArraySum.minSubArrayLen(7, new int[] { 2, 3, 1, 2, 4, 3}), 2);
        Assertions.assertEquals(subArraySum.minSubArrayLen(4, new int[] {1, 4, 4}), 1);
        Assertions.assertEquals(subArraySum.minSubArrayLen(11, new int[] {1,1,1,1,1,1,1,1}), 0);
    }
}
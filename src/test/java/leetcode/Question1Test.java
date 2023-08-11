package leetcode;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class Question1Test {

    @Test
    void twoSumByFor() {
        Assertions.assertArrayEquals(new int[]{0, 1}, Question1.twoSumByFor(new int[]{2, 7, 11, 15}, 9));
        Assertions.assertArrayEquals(new int[]{1, 2}, Question1.twoSumByFor(new int[]{3, 2, 4}, 6));
        Assertions.assertArrayEquals(new int[]{0, 1}, Question1.twoSumByFor(new int[]{3, 3}, 6));
    }

    @Test
    void twoSumByHash() {
        Assertions.assertArrayEquals(new int[]{0, 1}, Question1.twoSumByHash(new int[]{2, 7, 11, 15}, 9));
        Assertions.assertArrayEquals(new int[]{1, 2}, Question1.twoSumByHash(new int[]{3, 2, 4}, 6));
        Assertions.assertArrayEquals(new int[]{0, 1}, Question1.twoSumByHash(new int[]{3, 3}, 6));
    }
}
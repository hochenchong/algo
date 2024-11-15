package leetcode.array;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * @author hochenchong
 * @date 2024/11/15
 */
class SquaresOfASortedArrayTest {

    @Test
    void sortedSquares() {
        SquaresOfASortedArray squaresOfASortedArray = new SquaresOfASortedArray();
        Assertions.assertArrayEquals(squaresOfASortedArray.sortedSquares(new int[]{-4,-1,0,3,10}), new int[]{0,1,9,16,100});
        Assertions.assertArrayEquals(squaresOfASortedArray.sortedSquares(new int[]{-7,-3,2,3,11}), new int[]{4,9,9,49,121});
    }
}
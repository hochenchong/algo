package leetcode.array;

import org.junit.jupiter.api.Test;
import java.util.Arrays;
import static org.junit.jupiter.api.Assertions.*;

/**
 * @author hochenchong
 * @date 2024/11/20
 */
class SpiralMatrixIiTest {

    @Test
    void generateMatrix() {
        SpiralMatrixIi spiralMatrixIi = new SpiralMatrixIi();
        assertEquals("[[1, 2, 3], [8, 9, 4], [7, 6, 5]]", Arrays.deepToString(spiralMatrixIi.generateMatrix(3)));
        assertEquals("[[1]]", Arrays.deepToString(spiralMatrixIi.generateMatrix(1)));
    }
}
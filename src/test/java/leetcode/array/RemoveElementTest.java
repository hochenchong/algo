package leetcode.array;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * @author hochenchong
 * @date 2024/11/14
 */
class RemoveElementTest {

    @Test
    void removeElement() {
        RemoveElement removeElement = new RemoveElement();
        Assertions.assertEquals(removeElement.removeElement(new int[]{3,2,2,3}, 3), 2);
        Assertions.assertEquals(removeElement.removeElement(new int[]{2,2,2,2}, 2), 0);
        Assertions.assertEquals(removeElement.removeElement(new int[]{0,1,2,2,3,0,4,2}, 2), 5);
    }
}
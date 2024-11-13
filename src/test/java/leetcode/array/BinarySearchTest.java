package leetcode.array;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

/**
 * 704. 二分查找
 *
 * @author hochenchong
 * @date 2024/11/13
 */
public class BinarySearchTest {
    @Test
    public void testSearch() {
        BinarySearch binarySearch = new BinarySearch();
        Assertions.assertEquals(binarySearch.search(new int[]{-1,0,3,5,9,12}, 9), 4);
        Assertions.assertEquals(binarySearch.search(new int[]{-1, 0, 3, 5, 9, 12}, 2), -1);
    }
}
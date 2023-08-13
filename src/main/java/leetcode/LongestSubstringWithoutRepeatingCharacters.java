package leetcode;

import java.nio.charset.StandardCharsets;

/**
 * @author hochenchong
 * @date 2023-08-13
 * <p>
 * @link <a href="https://leetcode.cn/problems/longest-substring-without-repeating-characters/">https://leetcode.cn/problems/longest-substring-without-repeating-characters/</a>
 * <p>
 * 3. 无重复字符的最长子串
 * 给定一个字符串 s ，请你找出其中不含有重复字符的 最长子串 的长度。
 */
public class LongestSubstringWithoutRepeatingCharacters {
    // 常规做法，从第一位开始遍历，遇到重复的截止，判断长度是否为当前遇到的最大值
    // 一旦字符串太长，在 leetcode 会超过时间限制
    public int lengthOfLongestSubstring(String s) {
        if (s == null || s.isEmpty()) {
            return 0;
        }
        if (s.length() == 1) {
            return 1;
        }
        byte[] bytes = s.getBytes(StandardCharsets.UTF_8);
        int sum = 0;
        for (int i = 0; i < bytes.length; i++) {
            // 剩余的个数，小于当前的最大值的，就不用继续判断了
            if (bytes.length - i < sum) {
                break;
            }
            byte[] temp = new byte[bytes.length - i];
            temp[0] = bytes[i];
            for (int j = 1; j < bytes.length - i; j++) {
                if (hasByte(temp, bytes[i + j])) {
                    // 遇到重复的，则终止
                    // 判断当前长度
                    if (j > sum) {
                        sum = j;
                    }
                    break;
                }
                // 如果没有重复，则填充进去
                temp[j] = bytes[i + j];
                // 如果是最后一个，则判断长度，需要加上原本的 i 的值
                if ((j + 1) == (bytes.length - i)
                        && j + 1 > sum) {
                    sum = j + 1;
                }
            }
        }
        return sum;
    }

    private boolean hasByte(byte[] temp, byte b) {
        if (temp == null || temp.length == 0) {
            return false;
        }
        for (byte b1 : temp) {
            if (b1 == b) {
                return true;
            }
        }
        return false;
    }
}

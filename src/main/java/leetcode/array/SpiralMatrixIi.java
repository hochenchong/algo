package leetcode.array;

/**
 * <a href="https://leetcode.cn/problems/spiral-matrix-ii/description/">59. 螺旋矩阵 II</a>
 * 给你一个正整数 n ，生成一个包含 1 到 n2 所有元素，且元素按顺时针顺序螺旋排列的 n x n 正方形矩阵 matrix 。
 *
 * @author hochenchong
 * @date 2024/11/20
 */
public class SpiralMatrixIi {
    /*
    需要走几圈？ n/2 圈
    奇数需要处理中心点，最后的值
     */
    public int[][] generateMatrix(int n) {
        int[][] result = new int[n][n];
        int num = 1;
        for (int i = 0; i < n/2; i++) {
            // 从左向右走，左闭右开
            for (int j = i; j < n - i - 1; j++) {
                result[i][j] = num;
                num ++;
            }
            // 最右边竖排，从上向下，上闭，下开
            for (int j = i; j < n - i - 1; j++) {
                result[j][n-i-1] = num;
                num ++;
            }
            // 底部，从右向左
            for (int j = i; j < n - i - 1; j++) {
                result[n-i-1][n-j-1] = num;
                num ++;
            }
            // 最左边竖排，从下向上
            for (int j = i; j < n - i - 1; j++) {
                result[n-j-1][i] = num;
                num ++;
            }
        }
        // 如果是奇数，需要处理一下中心点
        if (n % 2 == 1) {
            result[n/2][n/2] = num;
        }
        return result;
    }
}
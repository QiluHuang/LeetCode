package dArray;

import java.util.ArrayList;
import java.util.List;

public class SpiralMatrix {
    /**
     * 54 Spiral Matrix
     * */
    public static List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> list = new ArrayList<>();

        if (matrix.length == 0) return list;

        int colTop = 0, colBottom = matrix[0].length - 1;
        int rowLeft = 0, rowRight = matrix.length - 1;

        while (colTop <= colBottom && rowLeft <= rowRight) {
            for (int col = colTop; col <= colBottom; col++) {
                list.add(matrix[rowLeft][col]);
            }

            for (int row = rowLeft + 1; row <= rowRight; row++) {
                list.add(matrix[row][colBottom]);
            }

            if (colTop < colBottom && rowLeft < rowRight) {
                for (int col = colBottom - 1; col > colTop; col--) {
                    list.add(matrix[rowRight][col]);
                }
                for (int row = rowRight; row > rowLeft; row--) {
                    list.add(matrix[row][colTop]);
                }
            }

            colTop++;
            colBottom--;
            rowLeft++;
            rowRight--;
        }

        return list;
    }
}

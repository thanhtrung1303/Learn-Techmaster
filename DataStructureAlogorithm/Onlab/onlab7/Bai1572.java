import java.util.HashSet;
import java.util.Set;

class Bai1572 {
    public int diagonalSum(int[][] mat) {
        int sum = 0, n = mat.length;
        for (int i = 0; i < n; i++) {
            sum += mat[i][i];
            int j = n - 1 - i;
            if (j != i)
                sum += mat[i][j];
        }
        return sum;
    }
}
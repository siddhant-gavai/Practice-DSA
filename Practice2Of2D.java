
public class Practice2Of2D {
    public static void main(String[] args) {
        int[][] nums = {
                { 1, 4, 9 },
                { 11, 4, 3 },
                { 2, 2, 3 }
        };

        int sum = 0;
        int m = nums[0].length;

        for (int j = 0; j < m; j++) {
            sum = sum + nums[1][j];
        }
        System.out.println(sum);
    }
}

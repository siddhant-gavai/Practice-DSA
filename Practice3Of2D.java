public class Practice3Of2D {
    public static void main(String[] args) {
        int[][] arr = {
                { 7, 8, 9 },
                { 4, 5, 6 }
        };
        int n = 2;
        int m = 3;

        int[][] transpose = new int[3][2];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                transpose[j][i] = arr[i][j];

            }
        }
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(transpose[i][j] + " ");
            }
            System.out.println();
        }
    }
}

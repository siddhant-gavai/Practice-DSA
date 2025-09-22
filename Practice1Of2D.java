public class Practice1Of2D {
    public static void main(String[] args) {
        int[][] array = { { 4, 7, 8 }, { 8, 8, 7 } };

        int count = 0;
        int key = 7;
        int n = array.length;
        int m = array[0].length;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (key == array[i][j]) {
                    count++;

                }

            }
        }

        System.out.println(count);

    }
}
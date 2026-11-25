public class TwoDArray4 {
    public static void main(String[] args) {
        int[][] m = { { 1, 2, 3, 4, 5 }, { 5, 4, 3, 2, 1 }, { 1, 2, 3, 4, 5 }, { 5, 4, 3, 2, 1 } };
        int[][] n = { { 1, 2, 3, 4, 5 }, { 5, 4, 3, 2, 1 }, { 1, 2, 3, 4, 5 }, { 5, 4, 3, 2, 1 } };
        int[][] add = new int[m.length][m[0].length];
        int i, j;
        System.out.println("Matrix M");
        for (i = 0; i < m.length; i++) {
            for (j = 0; j < m[i].length; j++) {
                System.out.print(m[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println("Matrix N");
        for (i = 0; i < m.length; i++) {
            for (j = 0; j < m[i].length; j++) {
                System.out.print(m[i][j] + " ");
            }
            System.out.println();
        }

        for (i = 0; i < m.length; i++) {
            for (j = 0; j < m[i].length; j++) {
                add[i][j] = m[i][j] + n[i][j];
            }
        }

        System.out.println("Matrix Add");
        for (i = 0; i < add.length; i++) {
            for (j = 0; j < add[i].length; j++) {
                System.out.print(add[i][j] + " ");
            }
            System.out.println();
        }

        /*
         * 
         * 1 2 3   1 2 3   2 4 6
         * 4 5 6 + 4 5 6 = 8 10 12
         * 7 8 9   7 8 9   14 16 18
         * 
         * M N
         */
    }

}

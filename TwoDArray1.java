import java.util.Scanner;

public class TwoDArray1 {
    public static void main(String[] args) {
        // int[][] m = new int[3][3];
        int m[][] = new int[5][5];
        int i, j,row,col;
        Scanner sc = new Scanner(System.in);
        // for(i=0;i<3;i++){
        // for(j=0;j<3;j++){
        // System.out.print("Enter a m["+i+"]["+j+"] : ");
        // m[i][j] = sc.nextInt();
        // }
        // }
        row = m.length;
        col = m[0].length;

        for (i = 0; i < m.length; i++) {
            for (j = 0; j < m[i].length; j++) {
                System.out.print("Enter a m[" + i + "][" + j + "] : ");
                m[i][j] = sc.nextInt();
            }
        }

        for (i = 0; i < m.length; i++) {
            for (j = 0; j < m[i].length; j++) {
                System.out.print(m[i][j] + " ");
            }
            System.out.println();
        }

        /*
         * 
         * 0 1 2
         * 
         * 0 1 2 3
         * 1 4 5 6
         * 2 7 8 9
         * 
         * m[2][0] -> 7
         * m[1][2] -> 6
         */
    }

}

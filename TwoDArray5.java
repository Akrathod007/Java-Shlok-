import java.util.Scanner;

public class TwoDArray5 {
    public static void main(String[] args) {
        int[][] m = { { 1, 2, 3 }, { 4, 5, 6 }, { 1, 8, 9 } };
        int i = 0, j = 0, target, temp = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a target element you want to search in array : ");
        target = sc.nextInt();
        for (i = 0; i < m.length; i++) {
            for (j = 0; j < m[i].length; j++) {
                System.out.print(m[i][j] + " ");
            }
            System.out.println();
        }

        outer: for (i = 0; i < m.length; i++) {
            for (j = 0; j < m[i].length; j++) {
                if (m[i][j] == target) {
                    temp = 1;
                    break outer;
                }
            }
        }

        if (temp == 1) {
            System.out.println(target + " found at row " + (i + 1) + " and column " + (j + 1));
        }
        else{
            System.out.println(target + " Not Found in array");
        }
    }

    /*
     * 0 1 2
     * 0 1 2 3
     * 1 4 5 6
     * 2 7 8 9
     * 
     * target = 7
     * 
     */

}

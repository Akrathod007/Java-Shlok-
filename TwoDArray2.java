import java.util.Scanner;

public class TwoDArray2 {
    public static void main(String[] args) {
        int m[][] = new int[3][3];
        int i, j,sum = 0,leftDSum = 0,rightDSum = 0;
        Scanner sc = new Scanner(System.in);

        for (i = 0; i < m.length; i++) {
            for (j = 0; j < m[i].length; j++) {
                System.out.print("Enter a m[" + i + "][" + j + "] : ");
                m[i][j] = sc.nextInt();
            }
        }

        for (i = 0; i < m.length; i++) {
            sum = 0;
            for (j = 0; j < m[i].length; j++) {
                sum = sum + m[i][j];
                if(i == j){
                    leftDSum = leftDSum + m[i][j];
                }
                if((i+j) == m.length - 1){
                    rightDSum = rightDSum + m[i][j];
                }
                System.out.print(m[i][j] + " ");
            }
            System.out.println("= "+sum);
        }

        System.out.println("Left Diagonal Sum : "+leftDSum);
        System.out.println("Right Diagonal Sum : "+rightDSum);
    }

    /*

         0 1 2
       0 1 2 3 
       1 4 5 6 
       2 7 8 9 
    */

}

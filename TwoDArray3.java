import java.util.Scanner;

public class TwoDArray3 {
    public static void main(String[] args) {
        int m[][] = new int[3][3];
        int i, j,max,min;
        Scanner sc = new Scanner(System.in);

        for (i = 0; i < m.length; i++) {
            for (j = 0; j < m[i].length; j++) {
                System.out.print("Enter a m[" + i + "][" + j + "] : ");
                m[i][j] = sc.nextInt();
            }
        }
        max = m[0][0];
        min = m[0][0];  

        for (i = 0; i < m.length; i++) {
            for (j = 0; j < m[i].length; j++) {
                System.out.print(m[i][j] + " ");
                if(m[i][j] > max){
                    max= m[i][j];
                }
                if(m[i][j] < min){
                    min = m[i][j];
                }
            }
            System.out.println();
        }
        System.out.println("Max : "+max);
        System.out.println("Min : "+min);
    }

}

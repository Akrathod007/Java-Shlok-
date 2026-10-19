import java.util.Scanner;

public class Pattern5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int no;
        System.out.println("Enter a number : ");
        no = sc.nextInt();
        int i,j;

        for(i=1;i<=no;i++){
            // For Space
            for(j=1;j<=no-i;j++){
                System.out.print("  ");
            }

            // For Star
            for(j=1;j<=i;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}

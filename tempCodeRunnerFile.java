import java.util.Scanner;
public class Pattern1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int no;
        System.out.println("Enter a number : ");
        no = sc.nextInt();
        int i,j;

        for(i=1;i<=no;i++){ //row
            for(j=1;j<=no;j++){//column
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    
}

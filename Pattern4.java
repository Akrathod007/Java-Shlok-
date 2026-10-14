import java.util.Scanner;

public class Pattern4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int no;
        System.out.println("Enter a number : ");
        no = sc.nextInt();
        int i,j;

        for(i=1;i<=no;i++){
            for(j=1;j<=no;j++){
                if(i == 1 || i == no){
                    System.out.print("* ");
                }
                else if(j == 1 || j == no){
                    System.out.print("* ");
                }
                else{
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
}

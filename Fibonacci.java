import java.util.Scanner;
public class Fibonacci {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int no,a = 1,b = 1,c,i;
        System.out.println("Enter a number : ");
        no = sc.nextInt();

        System.out.print(a + " ");
        System.out.print(b + " ");

        for(i=3;i<=no;i++){
            c = a + b;
            a = b;
            b = c;
            System.out.print(c + " ");
        }
    }
    
}

import java.util.Scanner;
public class ForLoop {
    public static void main(String[] args) {
        int i;
        // for(i=1;i<=10;i++){
        //     System.out.println("Hello -> "+i);
        // }

        // for(i=10;i>=1;i--){
        //     System.out.println("Bye -> "+i);
        // }

        // System.out.println("Even Numbers From 1 to 20");
        // for(i=2;i<=20;i = i + 2){
        //     System.out.println("Even : "+i);
        // }

        // System.out.println("Odd Numbers From 1 to 20");
        // for(i=1;i<=20;i += 2){
        //     System.out.println("Odd : "+i);
        // }

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number : ");
        int no = sc.nextInt();
        int sum = 0;
        int eSum = 0,oSum = 0;
        long mul = 1;
        long eMul = 1,oMul = 1;
        for(i=1;i<=no;i++){
            System.out.println(i);
            sum = sum + i;
            mul = mul * i;

            if(i % 2 == 0){
                eSum = eSum + i;
                eMul = eMul * i;
            }
            else{
                oSum = oSum + i;
                oMul = oMul * i;
            }
        }

        System.out.println("Sum : "+sum);
        System.out.println("Mul : "+mul);

        System.out.println("Even Sum is "+eSum);
        System.out.println("Even Mul is "+eMul);
        System.out.println("Odd Sum is "+oSum);
        System.out.println("Odd Mul is "+oMul);
        // int x = 2147483647;
        // System.out.println("X : "+x);
    }
    
    
}

import java.util.Scanner;
public class Armstrong {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int no,t1,t2,dc = 0,sum = 0,pow = 1,digit;
        System.out.println("Enter a number : ");
        no = sc.nextInt();
        System.out.println("NO : "+no);
        t1 = no;
        t2 = no;
        while(t1 > 0){
            dc++;
            t1 = t1 / 10;
        }

        System.out.println("Digit Count : "+dc);

        while(t2 > 0){
            digit = t2 % 10; //15 % 10 -> 5
            pow = 1;
            for(int i = 1;i<=dc;i++){
                pow = pow * digit;
            }

            sum = sum + pow;
            t2 = t2 / 10;
        }

        if(sum == no){
            System.out.println("Number is Armstrong");
        }
        else{
            System.out.println("Number is not Armstrong");
        }
    }
    
}

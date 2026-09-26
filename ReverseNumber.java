import java.util.Scanner;
public class ReverseNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int no,digit,rev = 0,temp;
        System.out.println("Enter a number : ");
        no = sc.nextInt();
        temp = no;

        while(no > 0){
            digit = no % 10;
            rev = rev * 10 + digit;
            no = no / 10;
        }

        System.out.println("Reverse Number is "+rev);

        if(temp == rev){
            System.out.println("Palindrome Number");
        }
        else{
            System.out.println("Not Palindrome Number");
        }

    }
    
}

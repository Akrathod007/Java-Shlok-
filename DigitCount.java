import java.util.Scanner;

public class DigitCount {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int no, count = 0, digit, sum = 0, mul = 1;

        System.out.println("Enter a number : ");
        no = sc.nextInt();

        while (no > 0) {
            digit = no % 10;
            sum = sum + digit;
            mul = mul * digit;
            no = no / 10;
            count++;
        }

        System.out.println("Digit Count is " + count);
        System.out.println("Digit Sum is " + sum);
        System.out.println("Digit Product is "+mul);
    }

}

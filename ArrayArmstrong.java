import java.util.Scanner;

public class ArrayArmstrong {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arr[] = new int[10];
        int i, j, temp, dc, temp2, sum, power, digit,ac = 0;
        for (i = 0; i < arr.length; i++) {
            System.out.println("Enter a arr[" + i + "] : ");
            arr[i] = sc.nextInt();
        }

        for (i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }

        System.out.println();
        for (i = 0; i < arr.length; i++) {
            temp = arr[i];
            temp2 = arr[i];
            sum = 0;
            dc = 0;

            while (temp > 0) {
                dc++;
                temp = temp / 10;
            }
            // System.out.println("Digit Count : " + dc);

            while (temp2 > 0) {
                power = 1;
                digit = temp2 % 10; //1 % 10 => 1
                for (j = 1; j <= dc; j++) {
                    power = power * digit;
                }
                sum = sum + power;
                temp2 = temp2 / 10;
            }

            // System.out.println("Sum : " + sum);
            if(sum == arr[i]){
                System.out.println("Armstrong : "+arr[i]);
                ac++;
            }
        }

        System.out.println("Armstrong Count is "+ac);
    }
}

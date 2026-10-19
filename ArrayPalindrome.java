import java.util.Scanner;

public class ArrayPalindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[10];
        int i,rev,digit,temp,pc = 0;
        for (i = 0; i < arr.length; i++) {
            System.out.println("Enter a arr[" + i + "] : ");
            arr[i] = sc.nextInt();
        }

        for(i=0;i<arr.length;i++){
            temp = arr[i];
            rev = 0;
            while(temp > 0){
                digit = temp % 10;
                rev = rev * 10 + digit;
                temp = temp / 10;
            }

            if(arr[i] == rev){
                System.out.print(arr[i] + " ");
                pc++;
            }
        }
        System.out.println("\nPalindrome Count is "+pc);
    }

}

import java.util.Scanner;;

public class ArrayPrime {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[10];
        int i, j, primeCount = 0, f = 0;

        for (i = 0; i < arr.length; i++) {
            System.out.println("Enter a arr[" + i + "] : ");
            arr[i] = sc.nextInt();
        }

        for (i = 0; i < arr.length; i++) {
            f = 0;
            for (j = 1; j <= arr[i]; j++) {
                if (arr[i] % j == 0) {
                    f++;
                }
            }

            if (f == 2) {
                System.out.print(arr[i] + " ");
                primeCount++;
            }
        }
        System.out.println("\nPrime Count : " + primeCount);
    }

}

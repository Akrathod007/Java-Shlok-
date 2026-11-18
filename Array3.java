import java.util.Scanner;

public class Array3 {
    public static void main(String[] args) {
        int[] arr = new int[10];
        Scanner sc = new Scanner(System.in);

        int i, max, min;
        for (i = 0; i < arr.length; i++) {
            System.out.println("Enter a element : ");
            arr[i] = sc.nextInt();
        }

        max = arr[0];
        min = arr[0];

        for (i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }

            if (arr[i] < min) {
                min = arr[i];
            }
            System.out.print(arr[i] + " ");
        }
        System.out.println("\nMax : " + max);
        System.out.println("Min : " + min);
    }

    /*
     * 
     * 34 56 78 23 45 12 57 76 24 43
     * max = arr[0] -> 34
     * if arr[i] > max -> max = arr[i]
     * 
     * min = arr[0] -> 34
     * if arr[i] < min -> min = arr[i]
     */

}

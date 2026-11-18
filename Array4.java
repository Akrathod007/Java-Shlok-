import java.util.Scanner;

public class Array4 {
    public static void main(String[] args) {
        int[] arr1 = new int[10];
        int[] arr2 = new int[10];
        int[] arr3 = new int[10];
        Scanner sc = new Scanner(System.in);

        int i;
        System.out.println("Scan Array 1");
        for (i = 0; i < arr1.length; i++) {
            System.out.println("Enter a element : ");
            arr1[i] = sc.nextInt();
        }

        System.out.println("Scan Array 2");
        for (i = 0; i < arr2.length; i++) {
            System.out.println("Enter a element : ");
            arr2[i] = sc.nextInt();
        }

        System.out.println("Printing Array 1 : ");
        for (i = 0; i < arr1.length; i++) {
            System.out.print(arr1[i] + " ");
        }

        System.out.println("\nPrinting Array 2 : ");
        for (i = 0; i < arr2.length; i++) {
            System.out.print(arr2[i] + " ");
        }

        System.out.println("\nPrinting Array 3 : ");
        for(i=0;i<arr3.length;i++){
            arr3[i] = arr1[i] + arr2[i];
            System.out.print(arr3[i] + " "); 
        }
    }

    /*
     * arr1 = 1 2 3 4 5
     * arr2 = 1 2 3 4 5
     * arr3 = 2 4 6 8 10
     */
}

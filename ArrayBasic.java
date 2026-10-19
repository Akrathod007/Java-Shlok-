import java.util.Scanner;
public class ArrayBasic {
    public static void main(String[] args) {
        int[] arr = new int[20];
        int i,sum = 0,eSum = 0,oSum = 0;

        Scanner sc = new Scanner(System.in);
        for(i=0;i<arr.length;i++){
            System.out.println("Enter a arr["+i+"] : ");
            arr[i] = sc.nextInt();
        }

        for(i=0;i<arr.length;i++){
            sum = sum + arr[i];
            if(arr[i] % 2 == 0){
                eSum = eSum + arr[i];
            }
            else{
                oSum = oSum + arr[i];
            }
            System.out.print(arr[i] + " ");
        }

        System.out.println("\nTotal Sum : "+sum);
        System.out.println("Even Sum : "+eSum);
        System.out.println("Odd Sum : "+oSum);
    }
    
}

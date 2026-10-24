import java.util.Scanner;
public class SearchElement {
    public static void main(String[] args) {
        int arr[] = new int[10];
        Scanner sc = new Scanner(System.in);
        int i,target,f = 0;

        for(i=0;i<arr.length;i++){
            System.out.println("Enter a arr["+i+"] : ");
            arr[i] = sc.nextInt();
        }

        System.out.println("Enter a target element : ");
        target = sc.nextInt();

        for(i=0;i<arr.length;i++){
            System.out.print(arr[i] + " ");
        }

        for(i=0;i<arr.length;i++){
            if(target == arr[i]){
                f = 1;
                break;
            }
        }

        if(f == 1){
                System.out.println("\n"+target + " is found at index "+i+" in array");
        }
        else{
            System.out.println("\n"+target + " is not found in array");
        }
    }
    
}

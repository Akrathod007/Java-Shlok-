public class CopyArray {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7,8,9,10};
        int[] copy = new int[arr.length];
        int i;
        for(i =0 ;i<copy.length;i++){
            copy[i] = arr[i];
        }

        System.out.println("Printing Array Arr");
        for(i=0;i<arr.length;i++){
            System.out.print(arr[i] + " ");
        }

        System.out.println("\nPrinting Array copy");
        for(i=0;i<copy.length;i++){
            System.out.print(copy[i] + " ");
        }
    }
    /*
        i   = 0 1 2 3 4 5 6 7 8 9
        arr = 1 2 3 4 5 6 7 8 9 10

        i   = 0  1 2 3 4 5 6 7 8 9
        rev = 10 9 8 7 6 5 4 3 2 1

        k = 0
        for 9 to 0
            rev[k] = arr[i]
            k++;
    */
    
}

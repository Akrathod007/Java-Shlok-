public class Array2 {
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5,6,7,8,9,10};
        int i;
        for(i=0;i<arr.length;i++){
            System.out.print(arr[i]+ " ");
        }
    }
    
    /*
        a = [1,2,3,4,5]
        b = [6,7,8,9,10]
        aLen = a.length
        bLen = b.length
        c = new int[aLen + bLen]
        c = [1,2,3,4,5,6,7,8,9,10]

        for(i=0;i<5;i++){
            c[i] = a[i]
        }
    */
}

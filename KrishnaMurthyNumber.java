import java.util.Scanner;;
public class KrishnaMurthyNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int no,fact,digit,sum = 0,temp;
        System.out.println("Enter a number : ");
        no = sc.nextInt();
        temp = no;
        while(no > 0){
            fact = 1;
            digit = no % 10; //digit = 5!
            for(int i=1;i<=digit;i++){
                fact = fact * i;
            }

            sum = sum + fact;
            no = no / 10;
        }

        if(temp == sum){
            System.out.println("Krishanmurthy Number");
        }
        else{
            System.out.println("Not Krishanmurthy Number");

        }
    }
    
}

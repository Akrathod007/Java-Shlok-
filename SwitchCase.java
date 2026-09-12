import java.util.Scanner;

public class SwitchCase {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // int day;
        // System.out.println("Enter a day number : ");
        // day = sc.nextInt(); //3

        // // 1
        // switch(day){
        // case 1:System.out.println("MONDAY");
        // break;
        // case 2:System.out.println("TUESDAY");
        // break;
        // case 3:System.out.println("WEDNESDAY");
        // break;
        // case 4:System.out.println("THURSDAY");
        // break;
        // case 5:System.out.println("FRIDAY");
        // break;
        // case 6:System.out.println("SATURDAY");
        // break;
        // case 7:System.out.println("SUNDAY");
        // break;
        // default:System.out.println("Invalid Day Number");
        // }

        // char ch;
        // System.out.println("Enter a character : ");
        // ch = sc.next().charAt(0);

        // switch (ch) {
        //     case 'A':
        //     case 'a':
        //     case 'E':
        //     case 'e':
        //     case 'I':
        //     case 'i':
        //     case 'O':
        //     case 'o':
        //     case 'U':
        //     case 'u':
        //         System.out.println("It is vowel");
        //         break;
        //     default:
        //         System.out.println("It is not vowel");
        // }

        // int no;
        // System.out.println("Enter a number : ");
        // no = sc.nextInt();

        // switch(no % 2){
        //     case 0:System.out.println("Even");
        //         break;
        //     case 1:System.out.println("Odd");
        //         break;
        // }

        // System.out.println("===============HOTEL==================");
        // System.out.println("1 -> Gujarati");
        // System.out.println("2 -> Punjabi");
        // System.out.println("3 -> South Indian");
        // System.out.println("4 -> Chinese");
        // System.out.println("5 -> Italian");
        // System.out.println("Enter Your Choice : ");
        // int ch = sc.nextInt();

        // switch(ch){
        //     case 1:System.out.println("You Selected Gujarati");
        //             System.out.println("1 -> Thepla");
        //             System.out.println("2 -> Fafda");
        //             System.out.println("3 -> Dhokla");
        //             System.out.println("4 -> Khandvi");
        //             System.out.println("5 -> Undhiyu");
        //             System.out.println("Enter Your Choice : ");
        //             int ch2 = sc.nextInt();

        //             switch(ch2){
        //                 case 1:System.out.println("You Selected Thepla");
        //                     break;
        //                 case 2:System.out.println("You selected Fafda");
        //                     break;
        //                 case 3:System.out.println("You Selected Dhokla");
        //                     break;
        //                 case 4:System.out.println("You Selected Khandvi");
        //                     break;
        //                 case 5:System.out.println("You Selected Undhiyu");
        //                     break;
        //                 default:System.out.println("Invalid Choice!!");
        //             }
        //         break;
        //     case 2:System.out.println("You Selected Punjabi");
        //         break;
        //     case 3:System.out.println("You Selected South Indian");
        //         break;
        //     case 4:System.out.println("You Selected Chinese");
        //         break;
        //     case 5:System.out.println("You Selected Italian");
        //         break;
        //     default:System.out.println("Invalid Choice!!");
        // }

        String fruit;
        System.out.println("Enter a fruit : ");
        fruit = sc.next();
        switch(fruit){
            case "apple" : System.out.println("It is Fruit");
                break;
            case "kiwi" : System.out.println("It is Fruit");
                break;
            case "banana" : System.out.println("It is Fruit");
                break;
        }



    }
}

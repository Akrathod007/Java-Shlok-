import java.util.Scanner;

public class IfElse {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // int no;
        // System.out.println("Enter a number : ");
        // no = sc.nextInt();
        // System.out.println("No : "+no);

        // 1: only if
        // if(no > 0){
        // System.out.println("Number is Positive");
        // }

        // 2: if else

        // if(no > 0){
        // System.out.println("Number is Positive");
        // }
        // else{
        // System.out.println("Number is Negative");
        // }

        // 3: ladder if else :
        // int marks;
        // System.out.println("Enter a marks : ");
        // marks = sc.nextInt();
        // if(marks >= 90){
        // System.out.println("Grade A");
        // }
        // else if(marks >= 80){
        // System.out.println("Grade B");
        // }
        // else if(marks >= 70){
        // System.out.println("Grade C");
        // }
        // else if(marks >= 60){
        // System.out.println("Grade D");
        // }
        // else if(marks >= 50){
        // System.out.println("Grade E");
        // }
        // else{
        // System.out.println("Grade F");
        // }

        // int amt;
        // System.out.println("Enter a Amount : ");
        // amt = sc.nextInt(); // 2160

        // int n500 = 0, n100 = 0, n50 = 0, n20 = 0, n10 = 0, n5 = 0, n2 = 0, n1 = 0;

        // if (amt >= 500) {
        //     n500 = amt / 500;
        //     // amt = amt - n500 * 500;
        //     amt = amt % 500;
        //     // amt = 2160 - 4 * 500
        // }
        // if (amt >= 100) {
        //     n100 = amt / 100;
        //     amt = amt % 100;
        // }

        // if (amt >= 50) {
        //     n50 = amt / 50;
        //     amt = amt % 50;
        // }
        // if (amt >= 20) {
        //     n20 = amt / 20;
        //     amt = amt % 20;
        // }
        // if (amt >= 10) {
        //     n10 = amt / 10;
        //     amt = amt % 10;
        // }
        // if (amt >= 5) {
        //     n5 = amt / 5;
        //     amt = amt % 5;
        // }
        // if (amt >= 2) {
        //     n2 = amt / 2;
        //     amt = amt % 2;
        // }
        // if(amt >= 1){
        //     n1 = amt / 1;
        //     amt = amt % 1;
        // }

        // System.out.println("Note500 : "+n500);
        // System.out.println("Note100 : "+n100);
        // System.out.println("Note50 : "+n50);
        // System.out.println("Note20 : "+n20);
        // System.out.println("Note10 : "+n10);
        // System.out.println("Note5 : "+n5);
        // System.out.println("Note2 : "+n2);
        // System.out.println("Note1 : "+n1);

        // 5. nested if else

        int no;
        System.out.println("Enter a number : ");
        no = sc.nextInt();

        if(no > 0){
            if(no % 2 == 0){
                System.out.println("Number is Positive Even");
            }
            else{
                System.out.println("Number is Positive Odd");
            }
        }
        else if(no < 0){
            if(no % 2 == 0){
                System.out.println("Number is Negative Even");
            }
            else{
                System.out.println("Number is Negative Odd");
            }
        }
        else{
            System.out.println("Number is Zero");
        }


    }
}
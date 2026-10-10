import java.util.Scanner;

public class HotelMenu {
    public static void main(String[] args) {
        int ch,totalbill = 0,qty = 0,itemBill = 0;
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("===============HOTEL==================");
            System.out.println("1 -> Gujarati");
            System.out.println("2 -> Punjabi");
            System.out.println("3 -> South Indian");
            System.out.println("4 -> Chinese");
            System.out.println("5 -> Italian");
            System.out.println("Enter Your Choice : ");
            System.out.println("6 -> Exit");

            ch = sc.nextInt();

            if(ch == 6){
                System.out.println("Thank You for visting");
                break;
            }
            switch (ch) {
                case 1:
                    System.out.println("You Selected Gujarati");
                    System.out.println("1 -> Thepla ------------ 20₹");
                    System.out.println("2 -> Fafda ------------- 100₹");
                    System.out.println("3 -> Dhokla ------------ 50₹");
                    System.out.println("4 -> Khandvi ----------- 30₹");
                    System.out.println("5 -> Undhiyu ----------- 150₹");
                    System.out.println("Enter Your Choice : ");
                    int ch2 = sc.nextInt();

                    switch (ch2) {
                        case 1:
                            System.out.println("You Selected Thepla");
                            break;
                        case 2:
                            System.out.println("You selected Fafda");
                            break;
                        case 3:
                            System.out.println("You Selected Dhokla");
                            break;
                        case 4:
                            System.out.println("You Selected Khandvi");
                            break;
                        case 5:
                            System.out.println("You Selected Undhiyu");
                            break;
                        default:
                            System.out.println("Invalid Choice!!");
                    }

                    System.out.println("Enter Qty : ");
                    qty = sc.nextInt();
                    if(ch2 == 1){
                        itemBill = qty * 20;
                        System.out.println("Thepla ------- " + "20RS * " + qty + " = " + itemBill + "RS");
                    }
                    else if(ch2 == 2){
                        itemBill = qty * 100;
                        System.out.println("Fafda ------- " + "100RS * " + qty + " = " + itemBill + "RS");

                    }
                    else if(ch2 == 3){
                        itemBill = qty * 50;
                        System.out.println("Dhokla ------- " + "50RS * " + qty + " = " + itemBill + "RS");

                    }
                    else if(ch2 == 4){
                        itemBill = qty * 30;
                        System.out.println("Khandvi ------- " + "30RS * " + qty + " = " + itemBill + "RS");

                    }
                    else if(ch2 == 5){
                        itemBill = qty * 150;
                        System.out.println("Undhiyu ------- " + "150RS * " + qty + " = " + itemBill + "RS");

                    }
                    totalbill = totalbill + itemBill;
                    break;
                case 2:
                    System.out.println("You Selected Punjabi");
                    break;
                case 3:
                    System.out.println("You Selected South Indian");
                    break;
                case 4:
                    System.out.println("You Selected Chinese");
                    break;
                case 5:
                    System.out.println("You Selected Italian");
                    break;
                default:
                    System.out.println("Invalid Choice!!");
            }
        }

        System.out.println("Total Bill : "+totalbill);
    }

}

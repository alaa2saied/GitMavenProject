import java.util.Scanner;

public class Days {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int numMonth = scanner.nextInt();
        int num = scanner.nextInt();

            switch (numMonth) {
                case 1: {
                    System.out.print("This month is January and day is ");
                    break;
                }
                case 2: {
                    System.out.print("This month is February and day is ");
                    break;
                }
                case 3: {
                    System.out.print("This month is March and day is ");
                    break;
                }
                case 4: {
                    System.out.print("This month is April and day is ");
                    break;
                }
                case 5: {
                    System.out.print("This month is May and day is ");
                    break;
                }
                case 6: {
                    System.out.print("This month is June and day is ");
                    break;
                }
                case 7: {
                    System.out.print("This month is July and day is ");
                    break;
                }
                case 8: {
                    System.out.print("This month is August and day is ");
                    break;
                }
                case 9: {
                    System.out.print("This month is September and day is ");
                    break;
                }
                case 10: {
                    System.out.print("This month is October and day is ");
                    break;
                }
                case 11: {
                    System.out.print("This month is November and day is ");
                    break;
                }
                case 12: {
                    System.out.print("This month is December and day is ");
                    break;
                }
                default:
                    System.out.println("This is invalid Month");
            }

        switch (num){
            case 1 :
            {
                System.out.println("Saturday");
                break;
            }

            case 2 :
            {
                System.out.println("Sunday");
                break;
            }
            case 3 : {
                System.out.println("Monday");
                break;
            }
            case 4 :
            {
                System.out.println("Tuesday");
                break;
            }
            case 5 :
            {
                System.out.println("Wednesday");
                break;
            }
            case 6 :
            {
                System.out.println("Thursday");
                break;
            }
            case 7 :
            {
                System.out.println("Friday");
                break;
            }
            default:
                break;


        }
    }

}

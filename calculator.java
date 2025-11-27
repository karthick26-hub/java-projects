import java.util.Scanner;

class Calculator {

    public static void main(String args[]){

        Scanner scan = new Scanner(System.in);
        int choice;

        System.out.println("========== Simple Calculator ==========");

        do{
            System.out.println("1.Addition");
            System.out.println("2.Subtraction");
            System.out.println("3.Multiplication");
            System.out.println("4.Division");
            System.out.println("5.Exit");
            System.out.print("Enter the operation:");

            choice = scan.nextInt();

            if(choice == 5){
                System.out.println("Exiting the calculator. varen da!");
                break;
            }

            System.out.print("Enter first number:");
            Double num1 = scan.nextDouble();
            System.out.print("Enter the second number:");
            Double num2 = scan.nextDouble();

            switch (choice) {
                case 1 :
                    System.out.println("Result: " + (num1 + num2));
                    break;

                case 2 :
                    System.out.println("Result " + (num1 - num2));
                    break;

                case 3 :
                    System.out.println("Result: " + (num1 * num2));
                    break;

                case 4 :
                    if(num2 == 0){
                        System.out.println("Error: incorrect value");
                    }
                    else {
                        System.out.println("Result:" +(num1 / num2));
                        break;
                    }
                    default:
                        System.out.println("please enter a valid operation");                   
            }
        }while(choice != 5);


    }
}

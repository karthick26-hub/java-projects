import java.util.Scanner;
class Atm{
    public static void main(String args []){

        Scanner scan = new Scanner(System.in);

        int pin = 2630;
        int userPin;
        Double balance = 10000.0;
        int choice;

        System.out.println("========== Welcome to AKK ATM ==========");
        System.out.print("Enter the Pin:");
        userPin = scan.nextInt();

        if(userPin != pin){
            System.out.println("Incorrect Pin. Exiting...");
            return;
        }
        else {
            System.out.println("WELCOME");
            do{
                System.out.println("1.Check Balance");
                System.out.println("2.Withdraw");
                System.out.println("3.Deposit");
                System.out.println("4.Exit");
                System.out.print("Enter the choice:");
                choice = scan.nextInt();

                switch(choice) {
                    case 1 :
                        System.out.print("Current balance:" + balance);
                        break;
                    
                    case 2 :
                        System.out.print("Enter the amount:");
                        double withdrawAmount = scan.nextDouble();

                        if(withdrawAmount <=0){
                            System.out.print("Invalid amount");
                        }
                        else if(withdrawAmount > balance){
                            System.out.print("Insufficient balance");
                        }
                        else{
                            System.out.print("Collect your cash");
                            balance -= withdrawAmount;
                            System.out.print("Updated balance:" + balance);
                        }
                        break;
                    case 3 :
                        System.out.print("Enter the deposit amount:");
                        double depositAmount = scan.nextDouble();
                        if(depositAmount <= 0){
                            System.out.print("Invalid amount");
                        }
                        else{
                            balance += depositAmount;
                            System.out.print("Updated balance:" + balance);
                        }
                        break;
                    case 4 :
                        System.out.print("Exiting...");
                        break;
                    default:
                        System.out.print("Invalid choice!");
                }

            } while(choice != 4);

        }


    }
}
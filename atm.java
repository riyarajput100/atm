import java.util.Scanner;

public class atm {
    
    
    public static boolean validateInputAmount(int amount) {
        return amount > 0;
    }

    public static void main(String args[]) {
        int balance = 100000;
        int withdraw, deposit;
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("Automated Teller Machine");
            System.out.println("Choose 1 for Withdraw");
            System.out.println("Choose 2 for Deposit");
            System.out.println("Choose 3 for Check Balance");
            System.out.println("Choose 4 for EXIT");
            System.out.print("Choose the operation you want to perform:");

            int choice = sc.nextInt();
            switch (choice) {
                case 1:
                    System.out.print("Enter money to be withdrawn:");
                    withdraw = sc.nextInt();
                    if (!validateInputAmount(withdraw)) {
                        System.out.println("Enter amount greater than zero");
                        break;
                    }

                    if (balance >= withdraw) {
                        balance -= withdraw;
                        System.out.println("Please collect your money");
                    } else {
                        System.out.println("Insufficient Balance");
                    }
                    System.out.println("");
                    break;

                case 2:
                    System.out.print("Enter money to be deposited:");
                    deposit = sc.nextInt();
                    if (!validateInputAmount(deposit)) {
                        System.out.println("Enter amount greater than zero");
                        break;
                    }

                    balance += deposit;
                    System.out.println("Your Money has been successfully deposited");
                    System.out.println("");
                    break;

                case 3:
                    System.out.println("Balance : " + balance);
                    System.out.println("");
                    break;

                case 4:
                    System.out.println("Thank you for using ATM.");
                    System.exit(0);
                    break;

                default:
                    System.out.println("Invalid choice");
            }
        }
    }
}

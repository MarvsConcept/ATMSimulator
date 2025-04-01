import java.util.Scanner;

class Account{
    public double balance;

    public Account(double initialBalance){
        if (initialBalance >= 0){
            this.balance = initialBalance;
        }else{
            this.balance = 0;
            System.out.println("Inital Balance cannot be negative. Setting balance to $0...");
        }
    }

    // Get Balance
    public double getbalance(){
        return balance;
    }

    // Deposit Money
    public boolean deposit(double amount){
        if(amount > 0){
            balance += amount;
            return true;
        } else {
            System.out.println("Amount must be Positive...");
            return false;
        }
    }

    // Withdraw Money
    public boolean withdraw(double amount){
        if (amount > 0){
            if (amount <= balance){
                balance -= amount;
                return true;
            } else {
                System.out.println("Insufficient Balance");
                return false;
            }
        } else {
            System.out.println("Withdrawal amount must be positive...");
            return false;
        }
    }
}

public class ATMSim {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        // Create a bank account with initial balance
        Account acc1 = new Account(1000);

        boolean running = true;

        while (running){
            // Menu
            System.out.println();
            System.out.println("-----Marvs ATM Simulator-----");
            System.out.println();
            System.out.println("1. Check balance");
            System.out.println("2. Deposit");
            System.out.println("3. Withdraw");
            System.out.println("4. Exit");
            System.out.println();
            System.out.print("Enter you choice (1 - 4): " );

            // Get the user Input
            int choice = sc.nextInt();

            switch (choice) {

                case 1:
                    // Check balance
                    System.out.println();
                    System.out.println("Current Balance: $" + acc1.getbalance());
                    break;

                case 2:
                // Deposit
                    System.out.println();
                    System.out.print("Enter the amount you wish to deposit: $");
                    // Get amount
                    double amt = sc.nextDouble();
                    boolean depositsuccess = acc1.deposit(amt);
                    if (depositsuccess){
                        System.out.println("Successfully deposited $" + amt);
                        System.out.println("New Balance: $" + acc1.getbalance());
                    }
                    break;

                case 3:
                    // Withdrawal
                    System.out.println();
                    System.out.print("Enter the amount you want to withdraw: $");
                    double withdrawAmount = sc.nextDouble();
                    boolean withdrawSuccess = acc1.withdraw(withdrawAmount);
                    if(withdrawSuccess){
                        System.out.println ( "$" + withdrawAmount + " Withdrawn Successfully");
                        System.out.println("New Balance: $" + acc1.getbalance());
                    } else {
                        System.out.println("Insufficient Funds!");
                    }
                    break;

                    case 4:
                        System.out.println();
                        System.out.println("Thank you for using Marvs ATM Simulator, Goodbye");
                        running = false;
                        break;

                    default:
                        System.out.println();
                        System.out.println("Invalid Choice! please try again. ");
            }
        }
        sc.close();
    }

}

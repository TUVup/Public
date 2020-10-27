import java.util.Scanner;

public class Account {
    private double balance;

    public Account( double initialBalance){
        if(initialBalance > 0.0)
        balance = initialBalance;
    }

    public void credit(double amount)
    {
        balance = balance + amount;
    }

    public double getBalance(){
        return balance;
    }

    public static void main( String[] args){
        Account account1=new Account(50.00);
        Account account2 = new Account(-7.53);

        System.out.printf("account1 balance: %.2f\n", account1.getBalance());
        System.out.printf("account2 balance: %.2f\n", account2.getBalance());

        Scanner input = new Scanner(System.in);
        double depositAmount;

        System.out.print("Enter deposit amount: ");
        depositAmount = input.nextDouble();
        account1.credit(depositAmount);
        System.out.printf("account1 balance: $%.2f\n\n", account1.getBalance());

        System.out.print("Enter deposit amount: ");
        depositAmount = input.nextDouble();
        account2.credit(depositAmount);
        System.out.printf("account2 balance: $%.2f\n\n", account2.getBalance());
        input.close();
    }
}

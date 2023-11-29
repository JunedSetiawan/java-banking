package banking;

import banking.model.Account;
import banking.model.Loan;
import banking.users.Customer;

public class FinancialSummary {
    public static void showFinancialSummary(Customer customer) {
        System.out.println("\n Financial Summary for Customer: " + customer.name);
        System.out.println("-------------------------------");

        // Display account balances
        System.out.println("Account Balances:");
        for (Account acc : customer.getAccounts()) {
            System.out.println("Account Number: " + acc.getAccountNumber() + "\n Balance: " + acc.getBalance());

            // Display deposit and withdrawal history
            // Display deposit history
            System.out.println("\n Deposit History:");
            for (Double deposit : acc.getDepositHistory()) {
                System.out.println("Amount: " + deposit);
            }

            // Display withdrawal history
            System.out.println("\n Withdrawal History:");
            for (Double withdrawal : acc.getWithdrawalHistory()) {
                System.out.println("Amount: " + withdrawal);
            }
        }

        // Display total loans
        System.out.println("\nTotal Loans:");
        for (Loan loan : customer.getLoanList()) {
            System.out.println("Loan ID: " + loan.getLoanID() + ", Amount: " + loan.getLoanAmount());
        }

        // Calculate and display net worth
        double netWorth = 0.0;
        for (Account acc : customer.getAccounts()) {
            netWorth += acc.getBalance();
        }
        for (Loan loan : customer.getLoanList()) {
            netWorth -= loan.getLoanAmount();
        }

        System.out.println("\nNet Worth: " + netWorth);
    }
}

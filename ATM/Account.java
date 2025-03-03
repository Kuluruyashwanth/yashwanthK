
import java.util.Scanner;

import java.text.DecimalFormat;

public class Account {
    Scanner sc = new Scanner(System.in);
    DecimalFormat moneyFormat = new DecimalFormat("'$'###,##0,00");

    /* Set Customer Number */

    public int setCustomerNumber(int customerNumber) {
        this.customerNumber = customerNumber;
        return customerNumber;
    }

    /* Get the customer number */

    public int getCustomerNumber() {
        return customerNumber;

    }
    /* Set pin number */

    public int setpinNumber(int pinNumber) {
        this.pinNumber = pinNumber;
        return pinNumber;

    }

    /* Get the pin number */
    public int getpinNumber() {
        return pinNumber;
    }

    /* Get Checking Balance */

    public double getCheckingBalance() {
        return checkingBalance;
    }
    /* Get Savings Balance */

    public double getSavingBalance() {
        return savingBalance;
    }

    /* Caluclate Checking Account deposit */

    public double calCheckingDeposit(double amount) {
        checkingBalance = (checkingBalance + amount);
        return checkingBalance;
    }
    /* Caluclate Saving Account deposit */

    public double calcSavingdeposit(double amount) {
        savingBalance = (savingBalance + amount);
        return savingBalance;

    }

    /* Customer Checking Account Withdraw input */
    public void getCheckingWithdrawInput() {
        System.out.println("Checking Account balance:" + moneyFormat.format(checkingBalance));
        double amount = input.nextDouble();

        if ((checkingBalance - amount) >= 0) {
            calccheckingWithdraw(amount);
            System.out.println("Now Checking Account Balance:" + moneyFormat.format(checkingBalance));

        } else {
            System.out.println("Balance cannot be negative." + "\n");

        }
    }
    /* Customer Saving Account Withdraw input */

    public void getSavingWithdrawInput() {
        SYstem.out.println("Saving Account Balance:" + moneyFormat.format(savingBalance));
        System.out.println("Amount you want to withdraw form saving Account:");
        double amount = Input.nextDouble();

        if ((savingBalance - amount) >= 0) {
            calcSavingWithDrawInput(amount);
            System.out.println("New Saving Account Balance:" + savingBalance + "\n");

        } else {
            System.out.println("Balance cannot be negative." + "\n");

        }
    }
    /* Customer Checking Account Deposit */

    public void getcheckingDepositInput() {
        System.out.println("Checking Account Balance:" + moneyFormat.format(checkingBalance));
        System.out.println("Amount you want to deposit from Checking Account:");
        double amount = input.nextDouble();

        if ((checkingBalance + amount) >= 0) {
            calCkeckingDeposit(amount);
            System.out.println("New Checking Account Balance:" + moneyFormat.format(checkingBalance));

        } else {
            System.out.println("Balance cannot be negative." + "\n");

        }
    }
    /* Customer Saving Account Deposit */

    public void getSavingDepositInput() {
        System.out.println("Saving Account Balance:" + moneyFormat.format(savingBalance));
        System.out.println("Amount you deposit from Saving Account:");
        if ((savingBalance + amount) >= 0) {
            System.out.println("Now Saving Account Balance:" + moneyFormat.format(savingBalance));

        } else {
            System.out.println("Balance cannot be negative." + "\n");
        }
    }

    private int customerNumber;
    private int pinNumber;
    private int checkingBalance = 0;
    private int savingBalance = 0;

}

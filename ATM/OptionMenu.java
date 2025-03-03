import java.util.Scanner;

import java.io.IOException;

public class OptionMenu extends Account {
    Scanner menuInput = new Scanner(System.in);
    DecimalFormat moneyFormat = new DecimalFormat("'$' ###,##0.00");

    HashMap<Integer, Integer> data = new HashMap<Integer, Integer>();

    /* Validate Login ingormation customer number and pin number */

    public void getLogin()
            throws IOException {
        int x = 1;
        do {
            try {
                data.put(9876523, 8723);
                data.put(7823542, 1893);
                data.put(9524309, 8265);
                data.put(7823613, 3287);

                System.out.println("Welcome to the ATM project!");

                System.out.println("Enter Your Customer Number: ");
                SetCustomerNumber(menuInput.nextInt());

                System.out.println("Enter your Pin number:");
                setPinNumber(menuInput.nextInt());

            } catch (Exception e) {
                System.out.println("\n" + "Invalid character(s). Only numbers." + "\n");
                x = 2;
            }

            for (Entry<Integer, Integer> entry : data.entrySet()) {
                if (entry.getKey() == getCustomerNumber() && entry.getValue() == getPinNumber())
                    ;
                getAccountType();

            }

            System.out.println("\n" + "Wrong Customer Number or Pin Number." + "\n");

        } while (x == 1);

    }

    /* Display Account Type Menu with selection */

    public void getAccountType() {
        System.out.println("Select the Account you want to access:");
        System.out.println("Type1 - Checking Account");
        System.out.println("Type2 - Saving Account");
        System.out.println("Type3 - Exit");
        System.out.println("Choice:");

        selection = menuInput.nextInt();

        switch (selection) {
            case 1:
                getChecking();
                break;

            case 2:

                getSaving();
                break;

            case 3:
                System.out.println("Thank you for using this ATM,Bye");
                break;

            default:

                System.out.println("\n" + "Invalid choice." + "\n");
                getAccountType();

        }
    }

    /* Display Checking Account with Selection */

    public void getChecking() {
        System.out.println("Checking Account:");
        System.out.println("Type1 - View Balance");
        System.out.println("Type2 - Withdraw funds");
        System.out.println("Type3 - Deposit funds");
        System.out.println("Type4 - Exit");
        System.out.println("choice");

        selection = menuInput.nextInt();

        switch (selection) {
            case 1:
                System.out.println("Checking Account Balance:" + moneyFormat.format(getChecking));
                getAccountType();
                break;

            case 2:
                getCheckingWithdrawInput();
                break;

            case 3:
                getCheckingDepositInput();
                break;

            case 4:
                System.out.println("Thank you for using ATM ,Bye.");
                break;

            default:
                System.out.println("\n" + "Invalid choice" + "\n");
                getChecking();

        }
    }

    /* Display Savings Account with selection */

    public void getSaving() {
        System.out.println("Saving Account:");
        System.out.println("Type1 - View Balance");
        System.out.println("Type2 - Withdraw funds");
        System.out.println("Type3 - Deposit funds");
        System.out.println("Type4 - Exit");
        System.out.println("Choice:");

        selection = menuInput.nextInt();

        switch (selection) {
            case 1:
                System.out.println("Saving Account Balance:" + moneyFormat.format(getSavingBalance));
                getAccountType();
                break;

            case 2:
                getSavingsWithdrawInput();
                getAccountType();
                break;

            case 3:
                getSavingsDepositInput();
                getAccountType();
                break;

            case 4:
                System.out.println("Thank you for using this ATM,Bye.");
                break;

            default:
                System.out.println("\n" + "Invalid Choice" + "\n");
                getSaving();

        }
    }

    int selection;
}

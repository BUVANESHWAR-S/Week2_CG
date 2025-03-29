import java.util.Scanner;
class BankAccount{
    static Scanner input = new Scanner(System.in);
    Character trans, dec;
    String Account_Holder;
    int Account_Number, balance = 0;
    BankAccount(){
        System.out.println("enter the transaction you want to perform: ");
        System.out.println("Deposit('d')\nWithdraw('w')\nbalance_enquiry('b')\n press any other key to cancel");
        trans = input.next().charAt(0);
        switch (Character.toLowerCase(trans)) {
            case 'd':
                deposit();
                break;
            case 'w':
                withdraw();
                break;
            case 'b':
                balance_enquiry();
                break;
        
            default:
                break;
        }
     }
    void deposit(){
        
        int deposit_amnt;

        System.out.println("enter the account_number you wanted to deposit: ");
        Account_Number = input.nextInt();
        System.out.println("enter the account holder name");
        Account_Holder = input.next();
        System.out.println("enter the amount to be deposited: ");
        deposit_amnt = input.nextInt();
        System.out.printf("confirm the amount: %d to deposit in account number: %d\n", deposit_amnt, Account_Number);
        System.out.println("press 'Y' to continue\npress 'N' to cancel the transaction");
        dec = input.next().charAt(0);
        switch (Character.toLowerCase(dec)) {
            case 'y':
                balance += deposit_amnt;
                System.out.println("deposited");
                break;
            case 'n':
                return;
            default:
                System.out.println("INVALID");
                return;
                //break;
        }
    }
    void withdraw(){
        int pin, withdrawal_amnt;
        System.out.println("enter the account_number you wanted to deposit: ");
        Account_Number = input.nextInt();
        System.out.println("enter your pin: ");
        pin = input.nextInt();
        System.out.println("enter the amount: ");
        withdrawal_amnt = input.nextInt();
        System.out.println("press 'Y' to continue\npress 'N' to cancel the transaction");
        dec = input.next().charAt(0);
        switch (Character.toLowerCase(dec)) {
            case 'y':
                if(withdrawal_amnt > balance){
                    System.out.println("Insufficient balance");
                    return;
                }
                else{
                    balance -= withdrawal_amnt;
                    System.out.println("collect the cash");
                    return;
                }
            case 'n':
                return;
            default:
                System.out.println("INVALID");
                return;
                //break;
        }
    }
    void balance_enquiry(){
        System.out.println(balance);
    }


        
    }

public class pb7 {
    public static void main(String[] args) {
        BankAccount acc1 = new BankAccount();
    }

}

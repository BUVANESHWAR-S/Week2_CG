import java.util.*;
public class bankAccount{
    static String Bank_Name = "City Union Bank";
    static int total_acc = 0;
    private String AccHolderName;
    private final long AccNum;

    public bankAccount(String AccHolderName, long AccNum){
        this.AccHolderName = AccHolderName;
        this.AccNum = AccNum;
        total_acc++;
    }
    public static void gettotalaccnum(){
        System.out.println("Total number of accounts: "+total_acc);
    }
    public void accdetails(){
        if(this instanceof bankAccount){
            System.out.println("Bank Name: "+Bank_Name);
            System.out.println("Account Holder Name: "+AccHolderName);
            System.out.println("Account Number: "+AccNum);
        }
    }

    public static void main(String[] args) {
        bankAccount acc1 = new bankAccount("Karun", 123244);
        bankAccount acc2 = new bankAccount("Karun", 123244);
        acc1.accdetails();
        acc2.accdetails();
        bankAccount.gettotalaccnum();

    }
}

package day3;

public class _2AccessingStaticMembers {
    public static void main(String[] args) {
        BankAccount account1= new BankAccount();
        account1.balance=11.7;
//        account1.bankName="Citi";
        BankAccount account2 =new BankAccount();
        account2.balance=12.3;
//        account2.bankName="Citi";
        System.out.println(BankAccount.bankName);
    }
}
class BankAccount{
    Double balance;
    static String bankName="Citi"; //citi
}

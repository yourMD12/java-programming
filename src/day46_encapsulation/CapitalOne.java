package day46_encapsulation;

public class CapitalOne {
    public static void main(String[] args) {
        CheckingAccount account = new CheckingAccount();

        account.setBalance(4000);
        System.out.println(account.getBalance());

        account.setAccountHolder("Vasya Pupkin");
        System.out.println(account.getAccountHolder());

        account.setAccountNum(1737364539);
        System.out.println(account.getAccountNum());

        account.setType("360 checking");
        System.out.println(account.getType());
        System.out.println("account = " + account); //

    }
}

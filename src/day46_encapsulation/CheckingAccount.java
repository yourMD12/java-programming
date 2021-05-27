package day46_encapsulation;

public class CheckingAccount {
    //balance, accountNum,accountHolder, type = "checking"
    private int balance;
    private long accountNum;
    private String accountHolder;
    private String type = "checking"; //default is checking, we can change it using setter

    /**
     * public void setAccountInfo(long accNum,String accHolder, int balance,String type)
     * 1) this.accNum = accNum; OR
     * 2) setAccNum(accNum);
;     */
    //right click -> generate ->getter and setter > select ALL > ok


    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    public long getAccountNum() {
        return accountNum;
    }

    public void setAccountNum(long accountNum) {
        this.accountNum = accountNum;
    }

    public String getAccountHolder() {
        return accountHolder;
    }

    public void setAccountHolder(String accountHolder) {
        this.accountHolder = accountHolder;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}

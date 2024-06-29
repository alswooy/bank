package bank2;

public class Account {
    private long accountNumber;
    private long balance;

    public Account(long accountNumber){
        this.accountNumber = accountNumber;
        this.balance = 0;
    }

    void setBalance(long balance){
        this.balance = balance; //main에서 건들수가 있기때문에 패지키를 따로 둬서 만듬
    }
    long getBalance(){
        return balance;

    }
    long getAccountNumber(){
        return accountNumber;
    }
}

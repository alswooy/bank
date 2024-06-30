package bank1;

public class User {
    String name;
    Bank bank;

    User(String name){
        this.name = name;
    }

    public void useBank(Bank bank){
        this.bank=bank;
    }
    public void selectAccount(String name){
        if(bank.accountSelect(name)!=null){
            System.out.println(bank.accountSelect(name).accountNumber);
        }
        System.out.println("계좌가 없습니다. 계좌 생성을 해주세요.");

    }

}

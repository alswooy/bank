public class User {
    String name;
    Bank bank;

    User(String name){
        this.name = name;
    }

    public void useBank(Bank bank){
        this.bank=bank;
    }
    public Account selectAccount(String name){
        if(bank.AccountSelect(name)!=null){
            return bank.AccountSelect(name);
        }
        System.out.println("계좌가 없습니다. 계좌 생성을 해주세요.");
        return null;
    }

}

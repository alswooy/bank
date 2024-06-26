import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Bank{
    private List<Account> accounts = new ArrayList<Account>();

    public void AccountCreate(String name){
        if(accounts.size()<=3){
            long accountNumber = new Random().nextLong();
            Account newAccount = new Account(accountNumber,name);
            accounts.add(newAccount);
            System.out.println(name+"님 계좌 생성 계좌번호는 "+accountNumber+"입니다.");
        }else{
            System.out.println(name+"님 계좌가 너무 많아 생성 불가");
        }
        
        
    }
    public Account AccountSelect(String name){
        for(Account account : accounts){
            if (account.ownerName.equals(name)) {
                return account;
            }
        }
        return null;
    }

    public void out(String name, long money) {
        Account userAccount = AccountSelect(name);
        if(userAccount != null){
            userAccount.Out(money);
        }else{
            System.out.println(name+"님 계좌를 찾을 수 없습니다.");
        }
    }


    public void input(String name, long money) {
        Account userAccount = AccountSelect(name);
        if(userAccount != null){
            userAccount.input(money);
        }else{
            System.out.println(name+"님 계좌를 찾을 수 없습니다.");
        }
    }



}

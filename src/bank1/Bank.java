package bank1;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Bank{
    private List<Account> accounts = new ArrayList<Account>();
    //고객은 서비스를 사용하는 고객이니깐 bank가 다 처리해야하는데
    //내가 말한대로 설계 하게 된다면 고객이 은행에서 입금출금계좌생성 직접 다하는거네
    //저렇게 되면 고객 1명이 사용을 하는 시스템을 개발하는거고 유지보수 확장성이 어렵네
    public Account accountCreate(String name){
        if(accounts.size()<=3){
            long accountNumber = Math.abs(new Random().nextLong());
            Account newAccount = new Account(accountNumber,name);
            accounts.add(newAccount);
            System.out.println(name+"님 계좌 생성 계좌번호는 "+accountNumber+"입니다.");
            return newAccount;
        }else{
            System.out.println(name+"님 계좌가 너무 많아 생성 불가");
        }
        return null;
    }
    public Account accountSelect(String name){
        for(Account account : accounts){
            if (account.ownerName.equals(name)) {
                return account;
            }
        }
        return null;
    }

    public void output(String name, long money,Account account) {
        Account userAccount = accountSelect(name);
        if(userAccount != null
                &&account.accountNumber==userAccount.accountNumber
                &&name==account.ownerName){
            System.out.print(name+"님 계좌 : "+userAccount.accountNumber);
            System.out.println(money+"출금하엿습니다.");
            userAccount.Out(money);
            System.out.println("남은돈 : "+account.haveMoney);
        }else{
            System.out.println(name+"님 계좌를 찾을 수 없습니다.");
        }
    }


    public void input(String name, long money,Account account) {
        Account userAccount = accountSelect(name);
        if(userAccount != null
                &&account.accountNumber==userAccount.accountNumber
                &&name==account.ownerName){
            System.out.print(name+"님 계좌 : "+userAccount.accountNumber);
            System.out.println(money+"입금하엿습니다.");
            userAccount.input(money);
            System.out.println("남은돈 : "+account.haveMoney);
        }else{
            System.out.println(name+"님 계좌를 찾을 수 없습니다.");
        }
    }



}

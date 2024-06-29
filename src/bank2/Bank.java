package bank2;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Random;

public class Bank {
    private String name;
    private ArrayList<User> users;
    private HashMap<User, ArrayList<Account>> accounts;


    public Bank(String name){
        this.name = name;
        this.users = new ArrayList<>();
        this.accounts = new HashMap<>();
    }

    public User userJoin(String name){
        User user = new User(name);
        users.add(user);
        return user;
    }
    public Account createAccount(User user){
        if(!users.contains(user)){
            System.out.println("유저가 없습니다.");
            return null;
        }
        long accountNumber = Math.abs(new Random().nextLong());
        Account account = new Account(accountNumber);
        System.out.println(user.getName()+"님의 생성된 계좌번호: " + account.getAccountNumber());

        if (!accounts.containsKey(user)) {
            accounts.put(user, new ArrayList<>());
        }

        accounts.get(user).add(account);
        return account;
    }

    public ArrayList<Account> getAccounts(User user) {
        return accounts.get(user);
    }

    public void userAccountCheck(User user){
        if (!users.contains(user)) {
            System.out.println("해당 사용자가 존재하지 않습니다.");
            return;
        }

        System.out.println(user.getName() + "의 계좌 조회:");
        List<Account> userAccounts = accounts.get(user);

        if (userAccounts == null || userAccounts.isEmpty()) {
            System.out.println("  보유한 계좌가 없습니다.");
        } else {
            for (Account account : userAccounts) {
                System.out.println("  계좌번호: " + account.getAccountNumber() + ", 잔액: " + account.getBalance());
            }
        }
    }
    public void input(User user, Account account, long amount) {
        if (!users.contains(user) || !accounts.get(user).contains(account)) {
            System.out.println("유효하지 않은 사용자 또는 계좌입니다.");
            return;
        }
        System.out.print(user.getName() + "님의 계좌번호: " + account.getAccountNumber() + " ");
        System.out.print("에서 " + amount + "원 입금 ");
        long newBalance = account.getBalance()+amount;
        account.setBalance(newBalance);
        System.out.println("잔액 : " + account.getBalance());
    }
    public void output(User user, Account account, long amount) {
        if (!users.contains(user) || !accounts.get(user).contains(account)) {
            System.out.println("다른사람의 계좌입니다.");
            return;
        }

        System.out.print(user.getName() + "님의 계좌번호: " + account.getAccountNumber() + " ");
        if (account.getBalance() >= amount) {
            System.out.print("에서 " + amount + "원 출금하여 ");
            long newBalance = account.getBalance()-amount;
            account.setBalance(newBalance);
            System.out.println("잔액 : " + account.getBalance());
        } else {
            System.out.println("계좌의 잔액보다 출금금액이 많습니다.");
        }
    }
}

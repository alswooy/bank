import bank2.Account;
import bank2.Bank;
import bank2.User;

public class Main {
    public static void main(String[] args) {
        Bank bank = new Bank("newBank");

        User user1 = bank.userJoin("유민우");
        User user2 = bank.userJoin("남궁성");
        System.out.println("계좌 생성");
        Account account1 = bank.createAccount(user1);
        Account account2 = bank.createAccount(user1);
        Account account3 = bank.createAccount(user2);

        System.out.println("------------------------");

        bank.input(user1, account1, 50000);
        bank.input(user2, account3, 100000);
        bank.output(user1, account1, 20000);
        bank.output(user2, account2, 150000);

        bank.userAccountCheck(user1);
        bank.userAccountCheck(user2);

    }
}

package bank1;

public class Main {
    public static void main(String[] args) {
        Bank bank = new Bank();
        User user = new User("유민우");
        User user1 = new User("1234");


        user.useBank(bank);
        user1.useBank(bank);


        user.selectAccount(user.name);
        user1.selectAccount(user1.name);

        Account account = bank.accountCreate(user.name);
        Account account1 = bank.accountCreate(user1.name);
        Account account2 = bank.accountCreate(user.name);
        Account account3 = bank.accountCreate(user.name);
        Account account4 = bank.accountCreate(user.name);

        System.out.println();
        bank.input(user.name,1000,account);
        System.out.println();
        bank.input(user1.name,2000,account1);
        System.out.println();
        bank.output(user.name,1000,account1);
        bank.input(user.name,1000,account2);
        System.out.println();
        bank.output(user.name,500,account);

    }
}
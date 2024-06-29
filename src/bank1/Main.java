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

        bank.accountCreate(user.name);
        bank.accountCreate(user1.name);
        System.out.println();

        bank.input(user.name,1000);
        System.out.println();
        bank.input(user1.name,2000);
        System.out.println();
        bank.output(user.name,1000);
        bank.input(user.name,1000);
        System.out.println();
        bank.output(user.name,500);

    }
}
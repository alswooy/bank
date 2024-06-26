public class Main {
    public static void main(String[] args) {
        Bank bank = new Bank();
        User user = new User("유민우");

        user.useBank(bank);

        user.selectAccount(user.name);
        bank.AccountCreate(user.name);
        System.out.println();
        user.selectAccount(user.name);

        bank.input(user.name,1000);
        bank.out(user.name,1000);
        bank.input(user.name,1000);
        System.out.println();
        bank.out(user.name,500);



    }
}
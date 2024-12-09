
public class YourFirstAccount {

    public static void main(String[] args) {
        Account artosAccount = new Account("Arto's account", 100.00);

        artosAccount.deposit(20);

        System.out.println(artosAccount);
    }
}

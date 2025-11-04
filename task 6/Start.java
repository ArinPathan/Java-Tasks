public class Start {
    public static void main(String[] args) {
        FixedAccount f = new FixedAccount("DBBL", "Fixed", 111, 5);
        SavingsAccount s = new SavingsAccount("DBBL", "Savings", 111, 12345);
        BankingSector bs = new BankingSector("Govt", f);

        f.info();
        s.info();

        bs.all();
    }
}
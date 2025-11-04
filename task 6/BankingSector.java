class BankingSector {
    private String secName;
    private Bank bank;

    BankingSector() {}

    BankingSector(String secName, Bank bank) {
        this.secName = secName;
        this.bank = bank;
    }

    void setSector(Bank b) {
        bank = b;
    }

    Bank getSector() {
        return bank;
    }

    void all() {
        System.out.println("Sector Name: " + secName);
        bank.info();
    }
}
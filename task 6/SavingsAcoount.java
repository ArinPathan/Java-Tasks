class SavingsAccount extends Bank {
    private String name;
    private String type;
    private int branchNo;
    private int accNo;

    SavingsAccount(String name, String type, int branchNo, int accNo) {
        super(name, type, branchNo);
		this.name = name;
        this.type = type;
        this.branchNo = branchNo;
        this.accNo = accNo;
    }

    public void info() {
        System.out.println("Savings Account Info:");
        System.out.println("Name: " + name);
        System.out.println("Type: " + type);
        System.out.println("Branch No: " + branchNo);
        System.out.println("Account No: " + accNo);
    }
}
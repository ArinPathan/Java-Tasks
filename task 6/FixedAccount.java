   FixedAccount(String name, String type, int branchNo, int count) {
        super(name, type, branchNo);
		this.name = name;
        this.type = type;
        this.branchNo = branchNo;
        this.count = count;
    }

    public void info() {
        System.out.println("Fixed Account Info:");
        System.out.println("Name: " + name);
        System.out.println("Type: " + type);
        System.out.println("Branch No: " + branchNo);
        System.out.println("Count: " + count);
    }
}
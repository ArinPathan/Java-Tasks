class Burger extends Food {
    private int numberOfPatty;

    public Burger(String name, String[] ingredients, double price, float calories, int numberOfPatty) {
        super(name, ingredients, price, calories);
        this.numberOfPatty = numberOfPatty;
    }

    public void setNumberOfPatty(int numberOfPatty) {
		this.numberOfPatty = numberOfPatty; }
    public int getNumberOfPatty() { 
	return numberOfPatty; }
public void showDetails() {
        System.out.println("Burger: " + name + ", Patties: " + numberOfPatty + ", Price: " + price);
    }
}


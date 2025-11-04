class Drinks extends Food {
    private String type;
    private int sizeInLiters;

    public Drinks(String name, String[] ingredients, double price, float calories, String type, int sizeInLiters) {
        super(name, ingredients, price, calories);
        this.type = type;
        this.sizeInLiters = sizeInLiters;
    }

    public void setType(String type) {
		this.type = type; }
    public void setSize(int sizeInLiters) { 
	this.sizeInLiters = sizeInLiters; }
    public String getType() { 
	return type; }
    public int getSize() { 
	return sizeInLiters; }
	 public void showDetails() {
        System.out.println("Drink: " + name + ", Type: " + type + ", Size: " + sizeInLiters + "L, Price: " + price);
    }
}


abstract class Food {
    protected String name;
    protected String[] ingredients;
    protected double price;
    protected float calories;

    public Food(String name, String[] ingredients, double price, float calories) {
        this.name = name;
        this.ingredients = ingredients;
        this.price = price;
        this.calories = calories;
    }

    public void setName(String name) { 
	this.name = name; }
    public void setIngredients(String[] ingredients) { 
	this.ingredients = ingredients; }
    public void setPrice(double price) { 
	this.price = price; }
    public void setCalories(float calories) {
		this.calories = calories; }
    public String getName() { 
	return name; }
    public String[] getIngredients() {
		return ingredients; }
    public double getPrice() {
		return price; }
    public float getCalories() { 
	return calories; }
    
    public abstract void showDetails();
}


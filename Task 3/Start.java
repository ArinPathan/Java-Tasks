public class Start {
    public static void main(String[] args) {
        Resturant resturant = new Resturant("AIUB Eatery");

        Drinks d1 = new Drinks("Coke", new String[]{"Water", "Sugar"}, 10, 150, "Soft Drink", 1);
        Drinks d2 = new Drinks("banana juice ", new String[]{"banana", "Sugar"}, 20, 120, "Juice", 1);
        Drinks d3 = new Drinks("Watermelon Juice", new String[]{"Watermelon", "Sugar"}, 10, 130, "Juice", 1);
        Drinks d4 = new Drinks("Mango Juice", new String[]{"Mango", "Sugar"}, 10, 140, "Juice", 1);
        Drinks d5 = new Drinks("kiwi Juice", new String[]{"kiwi", "Sugar"}, 20, 150, "Juice", 1);
        Burger b1 = new Burger("Cheese Burger", new String[]{"Beef", "Cheese", "Bread"}, 50, 500, 2);
        Burger b2 = new Burger("Ham Burger", new String[]{"Ham", "Cheese", "Bread"}, 50, 500, 2);
        Burger b3 = new Burger("cgd Burger", new String[]{"fffv", "Cheese", "Bread"}, 50, 500, 2);
        Burger b4 = new Burger("chili Burger", new String[]{"Beef", "Chili", "Bread"}, 50, 500, 2);
        Burger b5 = new Burger("naga Burger", new String[]{"Beef", "naga", "Bread"}, 50, 500, 2);
        Pizza p1 = new Pizza("Pepperoni", new String[]{"Flour", "Cheese", "Pepperoni"}, 80, 800, 12);
        Pizza p2 = new Pizza("dfd", new String[]{"Flour", "Cheese", "Pepperoni"}, 80, 800, 12);
        Pizza p3 = new Pizza("drgb", new String[]{"Flour", "Cheese", "Pepperoni"}, 80, 800, 12);
        Pizza p4 = new Pizza("hjh", new String[]{"Flour", "Cheese", "Pepperoni"}, 80, 800, 12);
        Pizza p5 = new Pizza("gnhhb", new String[]{"Flour", "Cheese", "Pepperoni"}, 80, 800, 12);

        resturant.addToOrder(d1);
        resturant.addToOrder(d2);
        resturant.addToOrder(d3);
        resturant.addToOrder(d4);
        resturant.addToOrder(d5);
		
        resturant.addToOrder(b1);
        resturant.addToOrder(b2);
        resturant.addToOrder(b3);
        resturant.addToOrder(b4);
        resturant.addToOrder(b5);
		
        resturant.addToOrder(p1);
        resturant.addToOrder(p2);
        resturant.addToOrder(p3);
        resturant.addToOrder(p4);
        resturant.addToOrder(p5);

        resturant.showOrders();
        System.out.println("Total bill: $" + resturant.calculateBill());
    }
}
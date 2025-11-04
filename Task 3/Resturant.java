class Resturant implements ResturantOperation {
    private String resturantName;
    private Food[] order;
    private int orderCount;

    public Resturant(String resturantName) {
        this.resturantName = resturantName;
        this.order = new Food[100]; 
        this.orderCount = 0;
    }

    public void setResturantName(String resturantName) { this.resturantName = resturantName; }
    public String getResturantName() { return resturantName; }
public void addToOrder(Food f) {
        if (orderCount < order.length) {
            order[orderCount++] = f;
            System.out.println(f.getName() + " added to the order.");
        } else {
            System.out.println("Order is full.");
        }
    }
 public void removeFromOrder(Food f) {
        for (int i = 0; i < orderCount; i++) {
            if (order[i] == f) {
                order[i] = order[--orderCount];
                order[orderCount] = null;
                System.out.println(f.getName() + " removed from the order.");
                return;
            }
        }
        System.out.println(f.getName() + " not found in the order.");
    }
 public void showOrders() {
        System.out.println("Orders at " + resturantName + ":");
        for (int i = 0; i < orderCount; i++) {
            order[i].showDetails();
        }
    }
public double calculateBill() {
        double total = 0;
        for (int i = 0; i < orderCount; i++) {
            total += order[i].getPrice();
        }
        return total;
    }
}

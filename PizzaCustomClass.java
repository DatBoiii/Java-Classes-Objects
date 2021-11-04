public class PizzaCustomClass {
    private String pizzaRestaurantName;
    private int numberOfCustomers;
    private int numberOfOrders;

    public PizzaCustomClass() {

    }

    public PizzaCustomClass(String pizzaRestaurantName, int numberOfCustomers) {
        this.pizzaRestaurantName = pizzaRestaurantName;
        this.numberOfCustomers = numberOfCustomers;
    }

    public PizzaCustomClass(String pizzaRestaurantName, int numberOfCustomers, int numberOfOrders) {
        this.pizzaRestaurantName = pizzaRestaurantName;
        this.numberOfCustomers = numberOfCustomers;
        this.numberOfOrders = numberOfOrders;
    }

    public String getName() {
        return pizzaRestaurantName;
    }

    public int getNumberOfCustomers() {
        return numberOfCustomers;
    }

    public int getNumberOfOrders() {
        return numberOfOrders;
    }

    public void setName (String newName) {
        this.pizzaRestaurantName = newName;
    }

    public void setNumberOfCustomers (int newCustomers) {
        this.numberOfCustomers = newCustomers;
    }

    public void setNumberOfOrders (int newOrders) {
        this.numberOfOrders = newOrders;
    }

    public boolean pizzaIsGood(String answer) {
        if (answer.equals("yes")) {
            return true;
        } else {
            return false;
        }
    }

    public String delicious() {
        return "Yummy! So good!";
    }

    public static void main(String[] args) {
    PizzaCustomClass PizzaRestaurant = new PizzaCustomClass("Pizznanos", 56, 42);
    System.out.print(PizzaRestaurant.getNumberOfCustomers());
    }

    
}


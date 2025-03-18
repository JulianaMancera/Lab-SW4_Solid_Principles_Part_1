package OCP;

public abstract class Customer {
    private String name;

    public Customer(String name){
        this.name = name;
    }

    public String getName() {
        return name;
    }

    abstract double calculateDiscount(double amount);
    
    public double applyDiscount(double amount) {
        return amount - calculateDiscount(amount);
    }
}

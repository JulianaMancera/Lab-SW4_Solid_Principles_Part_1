package OCP;

public class RegularCustomer extends Customer{
    public RegularCustomer(String name){
        super(name);
    }

    @Override
    double calculateDiscount(double amount){
        return 0.0;
    }
}

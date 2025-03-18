package OCP;

public class StudentCustomer extends Customer{
    public StudentCustomer(String name){
        super(name);
    }

    @Override
    double calculateDiscount(double amount){
        return amount * 0.05;
    }
}

package OCP;

public class SeniorCitizenCustomer extends Customer{
    public SeniorCitizenCustomer (String name){
        super(name);
    }

    @Override
    double calculateDiscount(double amount){
        return amount * 0.10;
    }
}

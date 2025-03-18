package OCP;

public class CustomerApp {
    public static void main(String[] args) {
        Customer student = new StudentCustomer("Alice");
        Customer senior = new SeniorCitizenCustomer("Bob");
        Customer regular = new RegularCustomer("Charlie");

        double purchaseAmount = 100.0;

        System.out.println(student.getName() + " pays: $" + student.applyDiscount(purchaseAmount));
        System.out.println(senior.getName() + " pays: $" + senior.applyDiscount(purchaseAmount));
        System.out.println(regular.getName() + " pays: $" + regular.applyDiscount(purchaseAmount));
    }
}

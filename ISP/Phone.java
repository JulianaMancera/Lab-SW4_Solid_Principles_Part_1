package ISP;

public class Phone {
    public static void main(String[] args) {
        BasicPhone basicPhone = new BasicPhone();
        Smartphone smartphone = new Smartphone();

        System.out.println("\nTesting BasicPhone:");
        basicPhone.makeCall("09618361224");
        basicPhone.sendSMS("09998594460", "See you tomorrow!");

        System.out.println("\nTesting Smartphone:");
        smartphone.makeCall("092668962749");
        smartphone.sendSMS("09325192412", "Good day mate!");
        smartphone.browseWeb("www.google.com");
        smartphone.takePicture();
    }
}
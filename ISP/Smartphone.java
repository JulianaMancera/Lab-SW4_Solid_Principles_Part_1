package ISP;

public class Smartphone implements Call, SMS, Internet, Camera{
    
    @Override
    public void makeCall(String number){
        System.out.println("Calling "+ number + " from a smartphone");

    }

    @Override
    public void sendSMS(String number, String message){
        System.out.println("Send SMS to " + number + ": " + message);

    }

    @Override
    public void browseWeb(String url){
        System.out.println("Browsing " + url);
    }

    @Override
    public void takePicture(){
        System.out.println("Taking a picture");
    }
}

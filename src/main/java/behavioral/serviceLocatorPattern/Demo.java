package behavioral.serviceLocatorPattern;

public class Demo {
    public static void main(String[] args) {
        MessagingService emailService = ServiceLocator.getService("EmailService");
        MessagingService smsService = ServiceLocator.getService("SMSService");
        System.out.println(emailService.getMessageBody());
        System.out.println(smsService.getMessageBody());
    }
}

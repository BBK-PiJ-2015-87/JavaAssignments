package day10.Task1;

public class PhoneLauncher {
    public static void main(String[] args) {
        PhoneLauncher launcher = new PhoneLauncher();
        launcher.launch();
    }
    public void launch() {
        SmartPhone s3 = new RestrictedSmartPhone("GALAXY S3");
        s3.browseWeb("www.google.com");
        s3.findPosition();
        s3.call("00751022222");
        s3.playGame("snake");
        s3.printLastNumbers();
        s3.ringAlarm("10:45 AM");
        System.out.println(s3.getBrand());
    }
}

package day11.Task2;

import day10.Task1.MobilePhone;
import day10.Task1.SmartPhone;

public class Task2 {
    public static void main(String[] args) {
        SmartPhone s3 = new SmartPhone("GALAXY S3");
        MobilePhone nokia = new SmartPhone("3310");

        s3.browseWeb("www.goole.com");
        s3.call("000087128172");
        s3.call("1234567");
        s3.findPosition();
        s3.playGame("Candy Crush");

        //casting nokia to Smart Phone
        SmartPhone nokiaSmart = (SmartPhone)nokia;
        nokiaSmart.browseWeb("www.nokia.com");
        nokiaSmart.call("000012222");
    }
}

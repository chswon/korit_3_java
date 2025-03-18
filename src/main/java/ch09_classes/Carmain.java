package ch09_classes;

import java.util.Scanner;

public class Carmain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Car mycar = new Car();
        Car yourcar = new Car();
        mycar.color = "빨강";
        mycar.speed = 160;
        yourcar.color = "노랑";
        yourcar.speed = 180;

        mycar.drive();
        yourcar.brake();

        mycar.displayInfo();
        yourcar.displayInfo();





    }


}

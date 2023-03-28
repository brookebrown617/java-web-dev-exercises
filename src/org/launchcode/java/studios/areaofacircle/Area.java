package org.launchcode.java.studios.areaofacircle;

import java.util.Scanner;
public class Area {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the radius of a circle:");
        Double radius = input.nextDouble();
//        Circle.getArea(radius);
        System.out.println("The area of a circle of radius " + radius + " is " + Circle.getArea(radius));
    }
}

package com.seminar1;
import java.util.Scanner;

public class Equation {
    private double a;
    private double b;
    private double c;

    public Equation()
    {
        Scanner scanner = new Scanner(System.in);
        this.a = scanner.nextDouble();
        this.b = scanner.nextDouble();
        this.c = scanner.nextDouble();
    }

    public void findRoots()
    {
        double d = b*b - 4.0*a*c;
        if (d < 0.0)
            System.out.println("There are no solutions");
        else if (d == 0.0)
            System.out.printf("One solution: %f\n", (-b + java.lang.Math.sqrt(d))/(2.0*a));
        else if (d > 0.0)
            System.out.printf("Two solutions: %f, %f\n", (-b + java.lang.Math.sqrt(d))/(2.0*a), (-b - java.lang.Math.sqrt(d))/(2*a));
    }

}

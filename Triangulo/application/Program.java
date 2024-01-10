package application;

import entities.Triangle;

import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        Triangle x;
        Triangle y;
        
        x = new Triangle();
        y = new Triangle();

        System.out.println("Enter the measure pf triangle x:");
        x.a = sc.nextDouble();
        x.b = sc.nextDouble();
        x.c = sc.nextDouble();
        System.out.println("Enter the measure pf triangle y:");
        y.a = sc.nextDouble();
        y.b = sc.nextDouble();
        y.c = sc.nextDouble();

        double areax = x.area();
        double areay = y.area();

        System.out.println("\nTriangle x  area: " + areax);
        System.out.println("\nTriangle y  area: " + areay);

        if (areay > areax) {
            System.out.println("\nArea y is large");
        } else {
            System.out.println("\nArea x is large");
        }
    }
}

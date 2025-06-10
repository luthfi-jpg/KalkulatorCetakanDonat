package uap.mains;

import uap.models.*;
import java.util.Scanner;

public class KalkulatorPabrik {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("=============================================");
        System.out.println("Kalkulator Pabrik Cetakan Donat Rumahan");
        System.out.println("MUHAMMAD LUTHFI THORIQ");
        System.out.println("245150700111015");
        System.out.println("=============================================");
        System.out.println("Donat dengan lubang");
        System.out.println("=============================================");
        System.out.print("Isikan Radius   : ");
        double R = scanner.nextDouble(); // major radius (7)
        System.out.print("Isikan radius   : ");
        double r = scanner.nextDouble(); // minor radius (3.5)
        System.out.println("=============================================");
        Torus torus = new Torus(R, r);
        torus.printInfo();

        System.out.println("=============================================");
        System.out.println("Donat tanpa lubang");
        System.out.println("=============================================");
        System.out.print("Isikan radius   : ");
        double r2 = scanner.nextDouble(); // radius bola (21)
        scanner.close();
        System.out.println("=============================================");
        Sphere sphere = new Sphere(r2);
        sphere.printInfo();

        System.out.println("=============================================");
    }
}

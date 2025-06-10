package uap.models;

import uap.bases.Shape;
import uap.interfaces.*;

public class Sphere extends Shape implements PiRequired, ThreeDimensional, MassCalculable, MassConverter, ShippingCostCalculator {
    private double radius;

    public Sphere(double radius) {
        this.radius = radius;
    }

    public double getVolume() {
        return (4.0 / 3.0) * PI * Math.pow(radius, 3);
    }

    public double getSurfaceArea() {
        return 4 * PI * radius * radius;
    }

    public double getMass() {
        return DENSITY * getSurfaceArea() * THICKNESS;
    }

    public double gramToKilogram() {
        return getMass() / DENOMINATOR;
    }

    public double calculateCost() {
        return Math.ceil(gramToKilogram()) * PRICE_PER_KG;
    }

    public void printInfo() {
        System.out.printf("Volume          : %.2f\n", getVolume());
        System.out.printf("Luas permukaan  : %.2f\n", getSurfaceArea());
        System.out.printf("Massa           : %.2f\n", getMass());
        System.out.printf("Massa dalam kg  : %.2f\n", gramToKilogram());
        System.out.printf("Biaya kirim     : Rp%.0f\n", calculateCost());
    }
}

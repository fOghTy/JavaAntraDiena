package lt.kaunascoding.java;

import java.util.Scanner;

public class Uzduotis06 {
    public Uzduotis06() {
        Scanner skaitytuvas = new Scanner(System.in);

        System.out.println("Iveskite savo mase(kg)");
        double mase = skaitytuvas.nextDouble();
        System.out.println("Iveskite savo ugi (cm)");
        double ugis = skaitytuvas.nextDouble();
        ugis = ugis / 100;

        double KMI = mase / ugis * ugis;

        System.out.println(KMI);
    }
}

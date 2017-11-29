package lt.kaunascoding.java;

import java.util.Scanner;

public class Uzduotis05 {
    public Uzduotis05() {
        Scanner skaitytuvas = new Scanner(System.in);
        float a = skaitytuvas.nextFloat();
        float b = skaitytuvas.nextFloat();
    }

    public static int suma(int a, int b) {
        System.out.println("Suma int: " + a + b);
        {
            return a + b;
        }

    }

    public static float suma(float a, float b) {
        System.out.println("Suma float: " + a + b);
        {
            return a + b;
        }

    }

    public static int skirtumas(int a, int b) {
        System.out.println("Skirtumas int: "a - b); {
            return a - b;
        }
    }

    public static float skirtumas(float a, float b) {
        System.out.println("Skirtumas float: "a - b); {
            return a - b;
        }
    }
}

package lt.kaunascoding.java;

import java.util.Scanner;

public interface Uzduotis02 {
    public Uzduotis02() {
        // paprasyti vartotojo ivesti zodi ir parodyti kiek tas zodis turi simboliu
        System.out.println("Iveskite zodi");

        Scanner skaitytuvas = new Scanner(System.in);
        String zodis = skaitytuvas.next();
        zodis.length();
    }
}

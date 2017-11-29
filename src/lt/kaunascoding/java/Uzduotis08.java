package lt.kaunascoding.java;

import java.util.Scanner;

public class Uzduotis08 {
    public Uzduotis08(){
        System.out.println("Iveskite nuvaziuotus km ir kuro sanaudas ");
        Scanner skaitytuvas = new Scanner(System.in);

        int km = skaitytuvas.nextInt();
        int sanaudos = skaitytuvas.nextInt();
        int vidurkis = sanaudos * 100 / km;
    }
}

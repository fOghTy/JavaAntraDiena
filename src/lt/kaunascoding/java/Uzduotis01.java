package lt.kaunascoding.java;

import java.util.Scanner;

public class Uzduotis01 {
    public Uzduotis01(){
        // pasisveikitinti su vartotoju
        // paprasyti ivesti varda
        // atspausdinti varda 5 kartus
        System.out.println("Sveiki, iveskite savo varda");
        Scanner skaitytuvas = new Scanner(System.in);
        String vardas = skaitytuvas.next();
        System.out.println(vardas);
        System.out.println(vardas);
        System.out.println(vardas);
        System.out.println(vardas);
        System.out.println(vardas);
    }

}

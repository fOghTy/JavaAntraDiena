package lt.kaunascoding.java;

import java.util.Scanner;

public class Main {
    public static final int CHOISE_0 = 0;
    public static final int CHOISE_1 = 1;
    public static final int CHOISE_2 = 2;
    public static final int CHOISE_3 = 3;
    public static final int CHOISE_4 = 4;
    public static final int CHOISE_5 = 5;

    public static void main(String[] args) {
        // Parodyti vartotojui kiek yra uzduociu
        // Paklausti vartotojo kokia uzduoti parodyti
        // Nuskaityti vartotojo pasirinkima
        // pagal ivesta sveika skaiciu rodyti uzduoties vykdyma
        // programa kartoja sia seka kol vartotojas neiveida 0
        Scanner skaitytuvas = new Scanner(System.in);

        while (true) {
            System.out.println("Turime isviso 3 uzduociu");
            System.out.println("Iveskite uzduoties numeri kad ja pamatyti");
            System.out.println("Ivedus 0 programa bus baigta");

            int pasirinkimas = skaitytuvas.nextInt();

            switch (pasirinkimas) {
                case CHOISE_0:
                    return;
                case CHOISE_1:
                    Uzduotis01 pirmoji = new Uzduotis01();
                case CHOISE_2:
                    Uzduotis02 antroji = new Uzduotis02();
                case CHOISE_3:
                    Uzduotis03 trecioji = new Uzduotis03();

                    break;
            }
        }
    }
}
